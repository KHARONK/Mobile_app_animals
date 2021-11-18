package nmhu.edu.mediazoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_seven.*

class Seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        val outhdata = intent


        val iguana = findViewById<View>(R.id.animal) as ImageView
        val jaguar = findViewById<View>(R.id.animal) as ImageView
        val toucan = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val descTectUrl = findViewById<View>(R.id.descUrl)

        val iguanabtn = findViewById<View>(R.id.Iguana)
        // descTectUrl.setText("image Url: https://www.wallpapers13.com/rain-drops/");
        iguanabtn.setOnClickListener {
            iguana.setImageResource(R.drawable.iguana)
            text.visibility = View.GONE
            Iguana.visibility = View.GONE
            Jaguar.visibility = View.GONE
            Toucan.visibility = View.GONE
        }

        val jaguarbtn = findViewById<View>(R.id.Jaguar)
        jaguarbtn.setOnClickListener {
            jaguar.setImageResource(R.drawable.jaguar)
            text.visibility = View.GONE
            Iguana.visibility = View.GONE
            Jaguar.visibility = View.GONE
            Toucan.visibility = View.GONE
        }

        val toucanbtn = findViewById<View>(R.id.Toucan)
        toucanbtn.setOnClickListener {
            toucan.setImageResource(R.drawable.toucan)
            text.visibility = View.GONE
            Iguana.visibility = View.GONE
            Jaguar.visibility = View.GONE
            Toucan.visibility = View.GONE

        }

        val backbtn = findViewById<View>(R.id.Back)
        backbtn.setOnClickListener {
            val Mainseven = Intent(applicationContext, Seven::class.java)
            startActivity(Mainseven)
        }

        val continentbtn = findViewById<View>(R.id.Continent)
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }


    }
}