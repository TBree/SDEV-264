package com.example.jumping_jacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.activity_info.mainId
import kotlinx.android.synthetic.main.activity_info.view.*
import kotlinx.android.synthetic.main.activity_my_main.*

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        // intialize txtView label
        val mLabelHome4 = findViewById<View>(R.id.homeId)
        // handle onClick
        mLabelHome4.setOnClickListener {
            //intent to start mMain Activity
            startActivity(Intent(this@Info, MainActivity::class.java))
        }
        val mMain4 = findViewById<View>(R.id.mainId)
        mMain4.setOnClickListener{
            startActivity(Intent(this@Info, mainId::class.java))
        }
        val mSettings4 = findViewById<View>(R.id.settingId)
        mSettings4.setOnClickListener {
            startActivity(Intent(this@Info, Settings::class.java))
        }
        val mInfo4 = findViewById<View>(R.id.info)
        mInfo4.setOnClickListener {
            startActivity(Intent(this@Info, Info::class.java))
        }

    }
}

