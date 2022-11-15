package com.example.jumping_jacks
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_my_main.*
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // initialize txtView label
        val mLabelHome3 = findViewById<View>(R.id.homeId)
        // handle onClick
        mLabelHome3.setOnClickListener {
            //intent to start mMain Activity
            startActivity(Intent(this@Settings, MainActivity::class.java))
        }
        val mMain3 = findViewById<View>(R.id.mainId)
        mMain3.setOnClickListener {
            startActivity(Intent(this@Settings, JumpingJacksMain::class.java))
        }
        val mSettings3 = findViewById<View>(R.id.settingId)
        mSettings3.setOnClickListener {
            startActivity(Intent(this@Settings, Settings::class.java))
        }
        val mInfo3 = findViewById<View>(R.id.infoId)
        mInfo3.setOnClickListener {
            startActivity(Intent(this@Settings, Info::class.java))
        }
        //print name to log in page.
        val fullName1=nameId.text
        val currentWeight=weightId.text
        val age=ageId.text

    fun onClicked(view: View){
        if (fullName1.isNotEmpty())lbl_Hello_Name.text="Hello, $fullName1"
        }
        /// when toggle switch is selected clear that radio button

    }
}
