package nmhu.edu.mediazoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        val outhdata = intent

        val iguanabtn = findViewById<View>(R.id.iguana)
        iguanabtn.setOnClickListener{
        }

        val jaguarbtn = findViewById<View>(R.id.jaguar)
        iguanabtn.setOnClickListener{
        }

        val toucanbtn = findViewById<View>(R.id.toucan)
        iguanabtn.setOnClickListener{
        }
    }
}