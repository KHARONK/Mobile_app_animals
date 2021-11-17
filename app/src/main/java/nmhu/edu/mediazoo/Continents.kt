package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.widget.LinearLayoutCompat
import kotlinx.android.synthetic.main.activity_one.*

class Continents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_continents)

        val maindata = intent

        val asiabtn = findViewById<View>(R.id.asia)
        asiabtn.setOnClickListener{
            Back.visibility = View.GONE
            val asiaintent = Intent(applicationContext, one::class.java)
            startActivity(asiaintent)
        }

        val africatn = findViewById<View>(R.id.africa)
        africatn.setOnClickListener{
            val africaintent = Intent(applicationContext, Two::class.java)
            startActivity(africaintent)
        }

        val antarcticabtn = findViewById<View>(R.id.antarctica)
        antarcticabtn.setOnClickListener{
            val antarcticaintent = Intent(applicationContext, Three::class.java)
            startActivity(antarcticaintent)
        }

        val australiabtn = findViewById<View>(R.id.australia)
        australiabtn.setOnClickListener{
            val australiaintent = Intent(applicationContext, Four::class.java)
            startActivity(australiaintent)
        }

        val europebtn = findViewById<View>(R.id.europe)
        europebtn.setOnClickListener{
            val europeintent = Intent(applicationContext, Five::class.java)
            startActivity(europeintent)
        }

        val northbtn = findViewById<View>(R.id.north)
        northbtn.setOnClickListener{
            val northintent = Intent(applicationContext, Six::class.java)
            startActivity(northintent)
        }

        val southbtn = findViewById<View>(R.id.south)
        southbtn.setOnClickListener{
            val southintent = Intent(applicationContext, Seven::class.java)
            startActivity(southintent)
        }

        val lifebtn = findViewById<View>(R.id.life)
        lifebtn.setOnClickListener{
           val lifeintent = Intent(applicationContext, Lifevideo::class.java)
           startActivity(lifeintent)
        }

    }
}

