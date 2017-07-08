package pe.zazk.websteros

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_random.*
import java.util.*

class RandomActivity : AppCompatActivity() {

    companion object{
        const val TOTAL_COUNT="total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        showRandomNumber()
    }

    fun showRandomNumber(){

        val count = intent.getIntExtra(TOTAL_COUNT,0)
        val random = Random()
        var randomInt = 0
        //Add one because the bound is exclusive
        if ( count > 0 ){
            randomInt = random.nextInt( count +1 )

        }

        // Display the random number.
        random_label.text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        textview_label.text = getString(R.string.random_heading, count)



    }
}
