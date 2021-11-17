package nmhu.edu.mediazoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        val europedata = intent

        val elkbtn = findViewById<View>(R.id.elk)
        elkbtn.setOnClickListener{
        }

        val harebtn = findViewById<View>(R.id.hare)
        harebtn.setOnClickListener{
        }

        val squirrelbtn = findViewById<View>(R.id.squirrel)
        squirrelbtn.setOnClickListener{
        }
    }
}