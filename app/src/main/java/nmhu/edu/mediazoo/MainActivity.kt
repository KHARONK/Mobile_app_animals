package nmhu.edu.mediazoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.media.MediaPlayer
import android.widget.ImageView
import java.io.IOException
import android.media.AudioManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mediaPlayer: MediaPlayer?///will hold mediaPlayer
        //image source: https://www.themoviedb.org/t/p/original/p0EBWE757Rzmgo4XkNOjCeDPFGn.jpg
        val wlcmImg = findViewById<View>(R.id.wlcmImage) as ImageView
        wlcmImg.setOnClickListener {
            playAudio()
            val continentsintent = Intent(applicationContext, Continents::class.java)
            startActivity(continentsintent)
        }
    }
    private fun playAudio() {
        val audioUrl = "https://artlist.io/sfx/track/69928/wild-animals---tiger,-roaring"

        // initializing media player
        var mediaPlayer = MediaPlayer()

        // below line is use to set the audio
        // stream type for our media player.
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)

        // below line is use to set our
        // url to our media player.
        try {
            mediaPlayer.setDataSource(audioUrl)
            // below line is use to prepare
            // and start our media player.
            mediaPlayer.prepare()
            mediaPlayer.start()
        }
        catch (e: IOException)
        {
            e.printStackTrace()
        }
    }

    }





