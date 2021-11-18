package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_three.*
import kotlinx.android.synthetic.main.activity_two.*

class Three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val antarcticaata = intent

        val krill = findViewById<View>(R.id.animal) as ImageView
        val whale = findViewById<View>(R.id.animal) as ImageView
        val penguin = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val descTectUrl = findViewById<View>(R.id.descUrl)

        val Krillbtn = findViewById<View>(R.id.Krill)
        // descTectUrl.setText("image Url: https://www.wallpapers13.com/rain-drops/");
        Krillbtn.setOnClickListener {
            krill.setImageResource(R.drawable.krill)
            text.visibility = View.GONE
            Krill.visibility = View.GONE
            Whale.visibility = View.GONE
            Penguin.visibility = View.GONE
        }

        val Whalebtn = findViewById<View>(R.id.Whale)
        Whalebtn.setOnClickListener {
            whale.setImageResource(R.drawable.whale)
            text.visibility = View.GONE
            Krill.visibility = View.GONE
            Whale.visibility = View.GONE
            Penguin.visibility = View.GONE
        }

        val Penguinebtn = findViewById<View>(R.id.Penguin)
        Penguinebtn.setOnClickListener {
            penguin.setImageResource(R.drawable.penguin)
            text.visibility = View.GONE
            Krill.visibility = View.GONE
            Whale.visibility = View.GONE
            Penguin.visibility = View.GONE

        }

        val backbtn = findViewById<View>(R.id.Back)
        backbtn.setOnClickListener {
            val Mainthree = Intent(applicationContext, Three::class.java)
            startActivity(Mainthree)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }

    }
}