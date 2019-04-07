package com.redcarpetup.kotlintest
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val buttonCLick = findViewById<Button>(R.id.addBtn)

        val t = findViewById<TextView>(R.id.textView)
        buttonCLick.setOnClickListener{
            val list = arrayListOf("text1", "text2", "text3")
            val random = Random()
            val randomtext = random.nextInt(list.count())

            t.text=list[randomtext]

        }

    }

}