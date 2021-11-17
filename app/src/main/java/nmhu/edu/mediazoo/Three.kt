package nmhu.edu.mediazoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val antarcticaata = intent

        val krillbtn = findViewById<View>(R.id.krill)
        krillbtn.setOnClickListener{
        }

        val whalebtn = findViewById<View>(R.id.whale)
        whalebtn.setOnClickListener{
        }

        val penguinbtn = findViewById<View>(R.id.penguin)
        penguinbtn.setOnClickListener{
        }
    }
}