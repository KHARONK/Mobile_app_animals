package nmhu.edu.mediazoo

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_video.*


private const val VIDEO_RES ="video_file" //key for bundle
class     Video : Fragment() {

    private lateinit var viewModel:Videom

    private var mediaPlayer: MediaPlayer? = null///will hold mediaPlayer
    private var videoRes:Int? = null  //resource to play


    override  fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Videom::class.java)
        arguments?.let {
            videoRes = it.getInt(VIDEO_RES) //load argument from companion
        }
    }


    override fun onCreateView(
        inflator: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?, ): View? {
        if (this.mediaPlayer == null) {
            this.mediaPlayer = MediaPlayer.create(context, videoRes!!)//make mediaplayer
        }

        val v: View = inflator.inflate(R.layout.fragment_video, container, false)
        //look up each button and give it click listener
        v.findViewById<Button>(R.id.playbtn).apply {
            setOnClickListener {
                playMedia()//reusable function
            }
        }

        v.findViewById<Button>(R.id.stopbtn).apply {
            setOnClickListener {
                stopMedia()//reusable function
            }

        }
        return v


    }

    private fun playMedia(time:Int = 0){
        mediaPlayer?.seekTo(time)
        mediaPlayer?.start()
    }

    private fun stopMedia(time:Int = 0){
        mediaPlayer?.stop()
        mediaPlayer?.prepare()
    }

    //these two functions are pretty much same
    //concepts as the instance state stuff from before
    override fun onDestroyView(){
        super.onDestroyView()
        viewModel.setCurrentTime(this.mediaPlayer?.currentPosition!!)
        stopMedia()
        mediaPlayer?.release()
        mediaPlayer = null
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        if (viewModel.getCurrentTime() > 0){
            playMedia(viewModel.getCurrentTime())
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(video:Int) =
            Video().apply {
                arguments = Bundle().apply {
                    putInt(VIDEO_RES, video)
                }
            }
    }
}