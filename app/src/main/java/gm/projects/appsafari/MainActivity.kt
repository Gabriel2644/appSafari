package gm.projects.appsafari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val btnclick_me = findViewById(R.id.btn) as Button
        var mytextview = findViewById(R.id.text) as TextView
        var timesclicked = 0

        mytextview.setOnClickListener{
            timesclicked++
            mytextview.text= timesclicked.toString()
            Toast.makeText(this@MainActivity, "This is Safari App!", Toast.LENGTH_SHORT).show()
        }


    }
}