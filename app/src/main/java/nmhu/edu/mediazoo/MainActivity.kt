package nmhu.edu.mediazoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.content.Intent
import android.widget.ImageView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)


        //image source: https://www.themoviedb.org/t/p/original/p0EBWE757Rzmgo4XkNOjCeDPFGn.jpg
        val wlcmImg = findViewById<View>(R.id.wlcmImage) as ImageView
        wlcmImg.setOnClickListener {
            val continentsintent = Intent(applicationContext, Continents::class.java)
            startActivity(continentsintent)
        }

    }
}