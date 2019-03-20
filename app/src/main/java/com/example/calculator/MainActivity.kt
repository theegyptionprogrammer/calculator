package com.example.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener {
            calculation.append("1")
            calculation.append(Result.text)
            Result.text = ""
        }

        two.setOnClickListener {
            calculation.append("2")
            calculation.append(Result.text)
            Result.text = ""
        }

        three.setOnClickListener {
            calculation.append("3")
            calculation.append(Result.text)
            Result.text = ""
        }

        four.setOnClickListener {
            calculation.append("4")
            calculation.append(Result.text)
            Result.text = ""
        }

        five.setOnClickListener {
            calculation.append("5")
            calculation.append(Result.text)
            Result.text = ""
        }

        six.setOnClickListener {
            calculation.append("6")
            calculation.append(Result.text)
            Result.text = ""
        }

        seven.setOnClickListener {
            calculation.append("7")
            calculation.append(Result.text)
            Result.text = ""
        }

        eight.setOnClickListener {
            calculation.append("8")
            calculation.append(Result.text)
            Result.text = ""
        }

        nine.setOnClickListener {
            calculation.append("9")
            calculation.append(Result.text)
            Result.text = ""
        }

        zero.setOnClickListener {
            calculation.append("0")
            calculation.append(Result.text)
            Result.text = ""
        }

        add.setOnClickListener {
            calculation.append("+")
            calculation.append(Result.text)
            Result.text = ""
        }

        sub.setOnClickListener {
            calculation.append("-")
            calculation.append(Result.text)
            Result.text = ""
        }

        mul.setOnClickListener {
            calculation.append("*")
            calculation.append(Result.text)
            Result.text = ""
        }

        div.setOnClickListener {
            calculation.append("/")
            calculation.append(Result.text)
            Result.text = ""
        }

        dot.setOnClickListener {
            calculation.append(".")
            calculation.append(Result.text)
            Result.text = ""
        }

        leftBrack.setOnClickListener {
            calculation.append("(")
            calculation.append(Result.text)
            Result.text = ""
        }

        rightBrack.setOnClickListener {
            calculation.append(")")
            calculation.append(Result.text)
            Result.text = ""
        }

        percent.setOnClickListener {
            calculation.append("%")
            calculation.append(Result.text)
            Result.text = ""
        }

        sin.setOnClickListener {
            calculation.append("sin")
            calculation.append(Result.text)
            Result.text = ""
        }

        cos.setOnClickListener {
            calculation.append("cos")
            calculation.append(Result.text)
            Result.text = ""
        }

        tan.setOnClickListener {
            calculation.append("tan")
            calculation.append(Result.text)
            Result.text = ""
        }


        equal.setOnClickListener {
            if (calculation.text.isNotEmpty()) {

                val txt = calculation.text.toString()
                val expression = ExpressionBuilder(txt).build()
                try {
                    val result = expression.evaluate()
                    Result.text = result.toString()
                } catch (e: java.lang.Exception) {
                    Log.d("Exception", "Error" + e.message)
                }
            }

        }

        clear.setOnClickListener {
            calculation.text = ""
            Result.text = ""
        }
    }

}



