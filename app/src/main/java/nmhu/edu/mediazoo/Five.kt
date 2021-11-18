package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_five.*
import kotlinx.android.synthetic.main.activity_one.*

class Five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        val europedata = intent


        val elk = findViewById<View>(R.id.animal) as ImageView
        val hare = findViewById<View>(R.id.animal) as ImageView
        val squirrel = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val descTectUrl = findViewById<View>(R.id.descUrl)

        val elkbnt = findViewById<View>(R.id.Elk)
        // descTectUrl.setText("image Url: https://www.wallpapers13.com/rain-drops/");
        elkbnt.setOnClickListener {
            elk.setImageResource(R.drawable.elk)
            text.visibility = View.GONE
            Elk.visibility = View.GONE
            Hare.visibility = View.GONE
            Squirrel.visibility = View.GONE
        }

        val harebtn = findViewById<View>(R.id.Hare)
        harebtn.setOnClickListener {
            hare.setImageResource(R.drawable.hare)
            text.visibility = View.GONE
            Elk.visibility = View.GONE
            Hare.visibility = View.GONE
            Squirrel.visibility = View.GONE
        }

        val squirrelbtn = findViewById<View>(R.id.Squirrel)
        squirrelbtn.setOnClickListener {
            squirrel.setImageResource(R.drawable.squirrel)
            text.visibility = View.GONE
            Elk.visibility = View.GONE
            Hare.visibility = View.GONE
            Squirrel.visibility = View.GONE

        }

        val backbtn = findViewById<View>(R.id.Back)
        backbtn.setOnClickListener {
            val Mainfive = Intent(applicationContext, Five::class.java)
            startActivity(Mainfive)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }


    }
}