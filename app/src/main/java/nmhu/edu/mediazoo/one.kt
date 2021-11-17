package nmhu.edu.mediazoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_one.*
import android.content.Intent




class one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)


        val asiadata = intent

        val camel = findViewById<View>(R.id.animal) as ImageView
        val flamingo = findViewById<View>(R.id.animal) as ImageView
        val snow = findViewById<View>(R.id.animal) as ImageView
        val text = findViewById<View>(R.id.textView2) as TextView
        val descTectUrl = findViewById<View>(R.id.descUrl)

       val Camelabtn = findViewById<View>(R.id.Camel)
       // descTectUrl.setText("image Url: https://www.wallpapers13.com/rain-drops/");
       Camelabtn.setOnClickListener {
          camel.setImageResource(R.drawable.camel)
           text.visibility = View.GONE
           Camel.visibility = View.GONE
           Flamingo.visibility = View.GONE
           Snow.visibility = View.GONE
        }

        val Flamingobtn = findViewById<View>(R.id.Flamingo)
        Flamingobtn.setOnClickListener {
            flamingo.setImageResource(R.drawable.flamingo)
            text.visibility = View.GONE
            Camel.visibility = View.GONE
            Flamingo.visibility = View.GONE
            Snow.visibility = View.GONE
        }

        val Snowbtn = findViewById<View>(R.id.Snow)
        Snowbtn.setOnClickListener {
            text.visibility = View.GONE
            Camel.visibility = View.GONE
            Flamingo.visibility = View.GONE
            Snow.visibility = View.GONE
            flamingo.setImageResource(R.drawable.snowleopard)
        }


        val backbtn = findViewById<View>(R.id.Back)
        backbtn.setOnClickListener {
            val Mainone = Intent(applicationContext, one::class.java)
            startActivity(Mainone)

        }


    }
}



