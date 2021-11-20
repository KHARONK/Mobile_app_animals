package nmhu.edu.mediazoo

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_continents_video.*

class ContinentsVideo : AppCompatActivity() {


private lateinit var player: MediaPlayer
private lateinit var runnable:Runnable
private var handler: Handler = Handler()

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val videodata = intent
    // Start the media player
    playbtn.setOnClickListener{
        player = MediaPlayer.create(applicationContext,R.raw.zoo)

        player.start()
        initializeSeekBar()

        it.isEnabled = false
        stopbtn.isEnabled = true

        player.setOnCompletionListener {
            stopbtn.isEnabled = false
            playbtn.isEnabled = true
        }
    }


    // Stop the media player
    stopbtn.setOnClickListener{
        if(player.isPlaying){
            player.stop()
            player.reset()
            player.release()
            handler.removeCallbacks(runnable)

            it.isEnabled = false
            playbtn.isEnabled = true
        }
    }


    // Seek bar change listener
    seekbr.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
            if (b) {
                player.seekTo(i * 1000)
            }
        }

        override fun onStartTrackingTouch(seekBar: SeekBar) {
        }

        override fun onStopTrackingTouch(seekBar: SeekBar) {
        }
    })
}


// Method to initialize seek bar and audio stats
private fun initializeSeekBar() {
    seekbr.max = player.seconds

    runnable = Runnable {
        seekbr.progress = player.currentSeconds
        val diff = player.seconds - player.currentSeconds
        handler.postDelayed(runnable, 1000)
    }
    handler.postDelayed(runnable, 1000)
}
}



// Extension property to get media player duration in seconds
val MediaPlayer.seconds:Int
    get() {
        return this.duration / 1000
    }


// Extension property to get media player current position in seconds
val MediaPlayer.currentSeconds:Int
    get() {
        return this.currentPosition/1000
    }



