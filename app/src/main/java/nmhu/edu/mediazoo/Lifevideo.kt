package nmhu.edu.mediazoo

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_lifevideo.*
import java.lang.Exception

class Lifevideo : AppCompatActivity() {

    private var vp: MediaPlayer? = null
    private var currentVideo = mutableListOf(R.raw.zoo)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifevideo)

        controlVideo(currentVideo[0])
    }

    private fun controlVideo(id:Int){
        play.setOnClickListener(){
            if (vp ==null){
                vp = MediaPlayer.create(this, id)
                Log.d("Lifevideo", "ID: ${vp!!.audioSessionId}")

                initialiseSeeekerBar()
            }
            vp?.start()
            Log.d("Lifevideo", "Duration: ${vp!!.duration/1000} seconds")
        }
        pause.setOnClickListener{
            if (vp !== null) vp?.pause()
            Log.d("Lifevideo", "paused at: ${vp!!.currentPosition/1000} seconds")
        }

        stop.setOnClickListener{
            if (vp !== null)
            {
                vp?.stop()
                vp?.reset()
                vp?.release()
                vp = null
            }
        }

        seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) vp?.seekTo(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })
    }

        private fun initialiseSeeekerBar(){

        seekbar.max = vp!!.duration
        val handler = Handler()
        handler.postDelayed(object : Runnable {
            override fun run() {
                try{
                    seekbar.progress = vp!!.currentPosition
                    handler.postDelayed(this,1000)
                }
                catch (e: Exception){
                    seekbar.progress = 0
                }
            }

        })
    }
}