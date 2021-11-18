package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_four.*
import kotlinx.android.synthetic.main.activity_three.*

class Four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        val australiadata = intent

        val deer = findViewById<View>(R.id.animal) as ImageView
        val dolphine = findViewById<View>(R.id.animal) as ImageView
        val kangaroo = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val descTectUrl = findViewById<View>(R.id.descUrl)

        val Deerbtn = findViewById<View>(R.id.Deer)
        // descTectUrl.setText("image Url: https://www.wallpapers13.com/rain-drops/");
        Deerbtn.setOnClickListener {
            deer.setImageResource(R.drawable.deer)
            text.visibility = View.GONE
            Deer.visibility = View.GONE
            Dolphine.visibility = View.GONE
            Kangaroo.visibility = View.GONE
        }

        val Dolphinebtn = findViewById<View>(R.id.Dolphine)
        Dolphinebtn.setOnClickListener {
            dolphine.setImageResource(R.drawable.dolphine)
            text.visibility = View.GONE
            Deer.visibility = View.GONE
            Dolphine.visibility = View.GONE
            Kangaroo.visibility = View.GONE
        }

        val Kangaroobtn = findViewById<View>(R.id.Kangaroo)
        Kangaroobtn.setOnClickListener {
            kangaroo.setImageResource(R.drawable.kangaroo)
            text.visibility = View.GONE
            Deer.visibility = View.GONE
            Dolphine.visibility = View.GONE
            Kangaroo.visibility = View.GONE

        }

        val backbtn = findViewById<View>(R.id.Back)
        backbtn.setOnClickListener {
            val Mainfour = Intent(applicationContext, Four::class.java)
            startActivity(Mainfour)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }


    }
}