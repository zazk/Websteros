package pe.zazk.websteros

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view:View){
        //var myToast = Toast.makeToast(this, message,duration)
        val myToast = Toast.makeText(this,"Hello Badass",Toast.LENGTH_SHORT)
        myToast.show()

    }

    fun countMe(view:View){
        val myTextValue = textView.text.toString()
        var count:Int = Integer.parseInt(myTextValue)
        count++

        textView.text = count.toString()
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this,RandomActivity::class.java)
        val count = Integer.parseInt( textView.text.toString() )
        randomIntent.putExtra(RandomActivity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }
}

