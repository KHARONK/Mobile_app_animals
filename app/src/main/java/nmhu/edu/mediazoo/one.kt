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
        val animalInfo = findViewById<View>(R.id.animalinfo) as TextView


        val Camelabtn = findViewById<View>(R.id.Camel)
        Camelabtn.setOnClickListener {
            camel.setImageResource(R.drawable.camel)
            animalInfo.text = "camel, (genus Camelus), any of three species of large ruminating hoofed mammals of arid Africa and " +
                    "Asia known for their ability to go for long periods without drinking. The Arabian camel, " +
                    "or dromedary (Camelus dromedarius), has one back hump, while the domesticated Bactrian camel" +
                    " (C. bactrianus) and the wild Bactrian camel (C. ferus) have two. These “ships of the desert”" +
                    " have long been valued as pack or saddle animals, and they are also exploited for milk, meat, wool, and hides. " +
                    "The dromedary was domesticated about 3000–2000 BCE in Arabia, the Bactrian camel by 4000 BCE in the steppes of Central" +
                    "\n" +  "\n" +
                        "More @https://www.britannica.com/animal/camel"
            text.visibility = View.GONE
            Camel.visibility = View.GONE
            Flamingo.visibility = View.GONE
            Snow.visibility = View.GONE
        }

        val Flamingobtn = findViewById<View>(R.id.Flamingo)
        Flamingobtn.setOnClickListener {
            flamingo.setImageResource(R.drawable.flamingo)
            animalInfo.text  = "flamingo, (order Phoenicopteriformes), any of six species of tall, pink wading birds " +
                    "with thick downturned bills. Flamingos have slender legs, long, graceful necks, large wings, and short tails." +
                    "They range from about 90 to 150 cm (3 to 5 feet) tall. Flamingos are highly gregarious birds. Flocks numbering " +
                    "in the hundreds may be seen in long, curving flight formations and in wading groups along the shore. On some of" +
                    " East Africa’s large lakes, more than a million lesser flamingos (Phoeniconaias minor) " +
                    "gather during the breeding season. In flight, flamingos present a striking and beautiful sight, with legs and neck " +
                    "\n" +  "\n" +
                    "More @https://www.britannica.com/animal/flamingo-bird"
            text.visibility = View.GONE
            Camel.visibility = View.GONE
            Flamingo.visibility = View.GONE
            Snow.visibility = View.GONE
        }

        val Snowbtn = findViewById<View>(R.id.Snow)
        Snowbtn.setOnClickListener {
            snow.setImageResource(R.drawable.snowleopard)
            animalInfo.text = " snow leopard, also called ounce, large long-haired Asian cat, classified as either" +
                    " Panthera uncia or Uncia uncia in the family Felidae. The snow leopard inhabits the mountains " +
                    "of central Asia and the Indian subcontinent, ranging from an elevation" +
                    "of about 1,800 metres (about 6,000 feet) in the winter to about 5,500 metres (18,000 feet) in the summer." +
                    "Its soft coat, consisting of a dense insulating undercoat and a " +
                    "thick outercoat of hairs about 5 cm (2 inches) long, is pale grayish with dark rosettes and a dark streak along the spine. " +
                    "The underparts, on which the fur may be 10 cm (4 inches) long, are uniformly whitish. The snow leopard attains a " +
                    "length of about 2.1 metres (7 feet), including the 0.9-metre-(3-foot-) long tail. It " +
                    "stands about 0.6 metre (2 feet) high at the shoulder and weighs 23–41 kg (50–90 pounds)." +
                    "\n" +  "\n" +
                    "More @https://www.britannica.com/animal/snow-leopard"

            text.visibility = View.GONE
            Camel.visibility = View.GONE
            Flamingo.visibility = View.GONE
            Snow.visibility = View.GONE
        }

        val backbtn = findViewById<View>(R.id.Back)
        backbtn.setOnClickListener {
            val Mainone = Intent(applicationContext, one::class.java)
            startActivity(Mainone)

        }

        val continentbtn = findViewById<View>(R.id.Continent)
        continentbtn.setOnClickListener {
            val continent = Intent(applicationContext, Continents::class.java)
            startActivity(continent)

        }
    }

    //URL LINKS FOR TEXTVIEW (Animal information)
    //Camel : https://www.britannica.com/animal/camel
    //Flamingo : https://www.britannica.com/animal/flamingo-bird
    //Snow:https://www.britannica.com/animal/snow-leopard

    //Animals use URL @
    //Camel : https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.thoughtco.com%2Fcamel-facts-4589369&psig=AOvVaw2D43sWh9R7lPjVcY_NCMjm&ust=1636766590116000&source=images&cd=vfe&ved=0CAkQjhxqFwoTCJj-xu7UkfQCFQAAAAAdAAAAABAD
    //Flamingo :https://www.google.com/url?sa=i&url=https%3A%2F%2Febird.org%2Fspecies%2Fgrefla2&psig=AOvVaw1q9RUb12gvnf9MRkhLRLqj&ust=1636766691908000&source=images&cd=vfe&ved=0CAkQjhxqFwoTCMi3-JvVkfQCFQAAAAAdAAAAABAF
    //Snow:https://seaworld.org/animals/all-about/penguins/habitat-and-distribution/
}



