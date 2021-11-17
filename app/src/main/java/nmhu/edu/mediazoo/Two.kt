package nmhu.edu.mediazoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val africaintent = intent

        val zebrabtn = findViewById<View>(R.id.zebra)
        zebrabtn.setOnClickListener{
        }

        val impalabtn = findViewById<View>(R.id.impala)
        impalabtn.setOnClickListener{
        }

        val wolfbtn = findViewById<View>(R.id.wolf)
        wolfbtn.setOnClickListener{
        }

    }
}