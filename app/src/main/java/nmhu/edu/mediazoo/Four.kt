package nmhu.edu.mediazoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        val australiadata = intent

        val deerbtn = findViewById<View>(R.id.deer)
        deerbtn.setOnClickListener{
        }

        val dolphinebtn = findViewById<View>(R.id.dolphine)
        dolphinebtn.setOnClickListener{
        }

        val kangaroobtn = findViewById<View>(R.id.kangaroo)
        kangaroobtn.setOnClickListener{
        }
    }
}