package com.example.jumping_jacks

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.activity_my_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // intialize txtView label
        val mLabelHome1 = findViewById<View>(R.id.homeId)
        // handle onClick
        mLabelHome1.setOnClickListener {
            //intent to start mMain Activity
            startActivity(Intent(this@MainActivity, MainActivity::class.java))
        }
        val mMain1 = findViewById<View>(R.id.mainId)
        mMain1.setOnClickListener {
            startActivity(Intent(this@MainActivity, JumpingJacksMain::class.java))
        }
        val mSettings1 = findViewById<View>(R.id.settingId)
        mSettings1.setOnClickListener {
            startActivity(Intent(this@MainActivity, Settings::class.java))

        }

    }
}

