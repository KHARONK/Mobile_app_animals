package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_six.*

class Six : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six)

        val northdata = intent

        val pygmy = findViewById<View>(R.id.animal) as ImageView
        val ringtail = findViewById<View>(R.id.animal) as ImageView
        val polar = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val descTectUrl = findViewById<View>(R.id.descUrl)

        val pygybtn = findViewById<View>(R.id.Pygmy)
        // descTectUrl.setText("image Url: https://www.wallpapers13.com/rain-drops/");
        pygybtn.setOnClickListener {
            pygmy.setImageResource(R.drawable.pygmy)
            text.visibility = View.GONE
            Pygmy.visibility = View.GONE
            Ringtail.visibility = View.GONE
            Bear.visibility = View.GONE
        }

        val ringtailbtn = findViewById<View>(R.id.Ringtail)
        ringtailbtn.setOnClickListener {
            ringtail.setImageResource(R.drawable.ringtail)
            text.visibility = View.GONE
            Pygmy.visibility = View.GONE
            Ringtail.visibility = View.GONE
            Bear.visibility = View.GONE
        }

        val polarbtn = findViewById<View>(R.id.Bear)
        polarbtn.setOnClickListener {
            polar.setImageResource(R.drawable.polar)
            text.visibility = View.GONE
            Pygmy.visibility = View.GONE
            Ringtail.visibility = View.GONE
            Bear.visibility = View.GONE

        }

        val backbtn = findViewById<View>(R.id.Back)
        backbtn.setOnClickListener {
            val Mainsix = Intent(applicationContext, Six::class.java)
            startActivity(Mainsix)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }


    }
}