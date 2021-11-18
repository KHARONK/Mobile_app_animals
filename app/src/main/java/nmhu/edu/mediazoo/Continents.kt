package nmhu.edu.mediazoo

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.commit
import kotlinx.android.synthetic.main.activity_one.*
import kotlinx.android.synthetic.main.fragment_video.*

class Continents : AppCompatActivity() {

    private val ZOO_TAG: String = "nmhu.edu.mediazoo_mediaplayer"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continents)

        val maindata = intent

        val asiabtn = findViewById<View>(R.id.asia)
        asiabtn.setOnClickListener {
            val asiaintent = Intent(applicationContext, one::class.java)
            startActivity(asiaintent)
            Back.visibility = View.GONE
        }

        val africatn = findViewById<View>(R.id.africa)
        africatn.setOnClickListener {
            val africaintent = Intent(applicationContext, Two::class.java)
            startActivity(africaintent)
        }

        val antarcticabtn = findViewById<View>(R.id.antarctica)
        antarcticabtn.setOnClickListener {
            val antarcticaintent = Intent(applicationContext, Three::class.java)
            startActivity(antarcticaintent)
        }

        val australiabtn = findViewById<View>(R.id.australia)
        australiabtn.setOnClickListener {
            val australiaintent = Intent(applicationContext, Four::class.java)
            startActivity(australiaintent)
        }

        val europebtn = findViewById<View>(R.id.europe)
        europebtn.setOnClickListener {
            val europeintent = Intent(applicationContext, Five::class.java)
            startActivity(europeintent)
        }

        val northbtn = findViewById<View>(R.id.north)
        northbtn.setOnClickListener {
            val northintent = Intent(applicationContext, Six::class.java)
            startActivity(northintent)
        }

        val southbtn = findViewById<View>(R.id.south)
        southbtn.setOnClickListener {
            val southintent = Intent(applicationContext, Seven::class.java)
            startActivity(southintent)
        }

        var mediaPlayer: MediaPlayer? = null

        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.zoo)
        }

        val lifebtn = findViewById<View>(R.id.life)
        lifebtn.setOnClickListener {
            if (savedInstanceState == null) {
                //fragment for videoView
                supportFragmentManager.commit {
                    replace(vidview.id, Video.newInstance(R.raw.zoo), ZOO_TAG)
                }
            }
        }

        fun playMedia(time: Int = 0) {
            if (mediaPlayer?.isPlaying!!) {
                mediaPlayer?.pause()
                mediaPlayer?.seekTo(time) //rewinds and resets buffers
            } else {
                mediaPlayer?.start()
            }
        fun onRestoreInstanceState(savedInstanceState: Bundle) {
            super.onRestoreInstanceState(savedInstanceState)
            val currentTime = savedInstanceState.getInt(ZOO_TAG)

            playMedia(currentTime)
        }

      fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(ZOO_TAG, mediaPlayer?.currentPosition!!)
        mediaPlayer?.pause()

    }
    }
    }
}




