package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_one.*
import kotlinx.android.synthetic.main.activity_two.*

class Two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val africaintent = intent


        val zebra = findViewById<View>(R.id.animal) as ImageView
        val impala = findViewById<View>(R.id.animal) as ImageView
        val wolf = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val descTectUrl = findViewById<View>(R.id.descUrl)

        val Zebrabtn = findViewById<View>(R.id.Zebra)
        // descTectUrl.setText("image Url: https://www.wallpapers13.com/rain-drops/");
        Zebrabtn.setOnClickListener {
            zebra.setImageResource(R.drawable.zebra)
            text.visibility = View.GONE
            Zebra.visibility = View.GONE
            Impala.visibility = View.GONE
            Wolf.visibility = View.GONE
        }

        val Impalabtn = findViewById<View>(R.id.Impala)
        Impalabtn.setOnClickListener {
            impala.setImageResource(R.drawable.imapala)
            text.visibility = View.GONE
            Zebra.visibility = View.GONE
            Impala.visibility = View.GONE
            Wolf.visibility = View.GONE
        }

        val Wolfbtn = findViewById<View>(R.id.Wolf)
        Wolfbtn.setOnClickListener {
            wolf.setImageResource(R.drawable.wolf)
            text.visibility = View.GONE
            Zebra.visibility = View.GONE
            Impala.visibility = View.GONE
            Wolf.visibility = View.GONE

        }

        val backbtn = findViewById<View>(R.id.Back)
        backbtn.setOnClickListener {
            val Maintwo = Intent(applicationContext, Two::class.java)
            startActivity(Maintwo)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }


    }
}


