package com.example.valik.mynotes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_three_topors.*
import java.util.*

class ThreeToporsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_topors)

        var score:Int = 0;
        var rand = (1..3).shuffled().first()
        var one = 1
        var two = 2
        var three = 3


        axe_one.setOnClickListener{
            if (rand == one) {
                Toast.makeText(this, "Shit blet", Toast.LENGTH_LONG).show()
                axe_one.setImageResource(R.drawable.topor)
                finish()
                startActivity(getIntent())
            }
            else{
                axe_one.setImageResource(R.drawable.toporr)
                finish()
                startActivity(getIntent())
            }

        }

        axe_two.setOnClickListener{
            if (rand == two) {
                Toast.makeText(this, "Shit blet", Toast.LENGTH_LONG).show()
                axe_two.setImageResource(R.drawable.topor)
                finish()
                startActivity(getIntent())
            }
            else{
                axe_two.setImageResource(R.drawable.toporr)
                finish()
                startActivity(getIntent())
            }
        }

        axe_three.setOnClickListener{
            if (rand == three) {
                Toast.makeText(this, "Shit blet", Toast.LENGTH_LONG).show()
                axe_three.setImageResource(R.drawable.topor)
                finish()
                startActivity(getIntent())
            }
            else{
                axe_three.setImageResource(R.drawable.toporr)
                finish()
                startActivity(getIntent())
            }
        }




    }


    public fun Topor (rand:Int){





    }


    public fun onClick () {

    }
}
