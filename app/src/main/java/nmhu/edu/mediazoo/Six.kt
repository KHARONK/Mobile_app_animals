package nmhu.edu.mediazoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Six : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six)

        val northdata = intent

        val pygmybtn = findViewById<View>(R.id.pygmy)
        pygmybtn.setOnClickListener{
        }

        val ringtailbtn = findViewById<View>(R.id.ringtail)
        ringtailbtn.setOnClickListener{
        }

        val bearbtn = findViewById<View>(R.id.bear)
        bearbtn.setOnClickListener{
        }
    }
}