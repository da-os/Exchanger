package com.example.exchanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var k : Double = 1.0/74.0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        exchangeB.setOnClickListener {
            exchange()
        }
        dollRub.setOnClickListener {
            dollarsToRub()
        }
        rubDoll.setOnClickListener {
            rublesToDollars()
        }
    }
    private fun exchange(){
        var userNum = editText.text.toString().toDouble()

        var exchangedVal : Double = userNum*k
        result.setText(exchangedVal.toString())
    }
    private fun rublesToDollars() {
        k=1.0/74.0
        textView1.setText("Рубли:")
        textView2.setText("Доллары:")
        result.setText("0")
    }

    private fun dollarsToRub() {
        k=74.0
        textView2.setText("Рубли:")
        textView1.setText("Доллары:")
        result.setText("0")
    }



}