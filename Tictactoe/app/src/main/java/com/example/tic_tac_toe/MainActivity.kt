package com.example.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //grid boxes
        var box1: TextView = findViewById(R.id.button1)
        var box2: TextView = findViewById(R.id.button2)
        var box3: TextView = findViewById(R.id.button3)
        var box4: TextView = findViewById(R.id.button4)
        var box5: TextView = findViewById(R.id.button5)
        var box6: TextView = findViewById(R.id.button6)
        var box7: TextView = findViewById(R.id.button7)
        var box8: TextView = findViewById(R.id.button8)
        var box9: TextView = findViewById(R.id.button9)

        //function

        var a1 = box1.text
        var a2 = box2.text
        var a3 = box3.text
        var a4 = box4.text
        var a5 = box5.text
        var a6 = box6.text
        var a7 = box7.text
        var a8 = box8.text
        var a9 = box9.text


        var b1 = a1.toString()
        var b2 = a2.toString()
        var b3 = a3.toString()
        var b4 = a4.toString()
        var b5 = a5.toString()
        var b6 = a6.toString()
        var b7 = a7.toString()
        var b8 = a8.toString()
        var b9 = a9.toString()

        //clearing function
        fun clear() {
            a1 = ""
            a2 = ""
            a3 = ""
            a4 = ""
            a5 = ""
            a6 = ""
            a7 = ""
            a8 = ""
            a9 = ""
        }
        clear()
        fun win() {
            while ((b1 == "") || (b5 == "") || (b9 == "")) {
                if ((b1 == b2 && b1 == b3) || (b1 == b5 && b1 == b9) || (b1 == b4 && b1 == b7) || (b2 == b5 && b2 == b8) ||
                    (b3 == b6 && b3 == b9) || (b3 == b5 && b3 == b9)) {
                    Toast.makeText(this, "The Game has been Won!!!", Toast.LENGTH_LONG)
                    clear()
                    break
                } else {
                    Toast.makeText(this,"There was no winner",Toast.LENGTH_SHORT)
                    clear()
                    break
                }
            }
        }

        //Onclick
        var count = 0
        val x = View.OnClickListener { c->
            val v = (c as TextView)
            if(v.text.isEmpty()){
                if ((count == 0)|| (count == 2) || (count == 4) || (count == 6) || (count == 8)) {
                    v.text = "X"
                    count += 1
                } else{
                    v.text = "O"
                    count += 1
                }
            }
        }
        box1.setOnClickListener(x)
        box2.setOnClickListener(x)
        box3.setOnClickListener(x)
        box4.setOnClickListener(x)
        box5.setOnClickListener(x)
        box6.setOnClickListener(x)
        box7.setOnClickListener(x)
        box8.setOnClickListener(x)
        box9.setOnClickListener(x)





    }
}