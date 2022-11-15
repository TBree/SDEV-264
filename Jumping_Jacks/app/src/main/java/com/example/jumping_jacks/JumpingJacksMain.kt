package com.example.jumping_jacks

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.activity_info.mainId
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_my_main.*
import kotlinx.android.synthetic.main.activity_my_main.view.*
import kotlinx.android.synthetic.main.activity_settings.*
import kotlinx.android.synthetic.main.activity_settings.view.*

class JumpingJacksMain: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_main)

        // initialize txtView label
        val mLabelHome2 = findViewById<View>(R.id.homeId)
        // handle onClick
        mLabelHome2.setOnClickListener {
            //intent to start mMain Activity
            startActivity(Intent(this@JumpingJacksMain, MainActivity::class.java))
        }
        val mMain2 = findViewById<View>(R.id.mainId)
        mMain2.setOnClickListener {
            startActivity(Intent(this@JumpingJacksMain, mainId::class.java))
        }
        val mSettings2 = findViewById<View>(R.id.settingId)
        mSettings2.setOnClickListener {
            startActivity(Intent(this@JumpingJacksMain, Settings::class.java))
        }
        val mInfo2 = findViewById<View>(R.id.infoId)
        mInfo2.setOnClickListener {
            startActivity(Intent(this@JumpingJacksMain, Info::class.java))
        }

    }
    fun saveButtonClicked(view: View){
        val sundayRbn = findViewById<RadioButton>(R.id.rbn_Sun)
        val mondayRbn = findViewById<RadioButton>(R.id.rbn_Mon)
        val tuesdayRbn = findViewById<RadioButton>(R.id.rbn_Tues)
        val wednesdayRbn = findViewById<RadioButton>(R.id.rbn_Wed)
        val thursdayRbn = findViewById<RadioButton>(R.id.rbn_Thurs)
        val fridayRbn = findViewById<RadioButton>(R.id.rbn_Friday)
        val saturdayRbn = findViewById<RadioButton>(R.id.rbn_Saturday)

        val sunJacks=txt_jacks.text
        val sunCal=txt_Cal.text

        val monJacks=txt_jacks.text
        val monCal=txt_Cal.text

        val tueJacks=txt_jacks.text
        val tueCal=txt_Cal.text

        val wedJacks=txt_jacks.text
        val wedCal=txt_Cal.text

        val thurJacks=txt_jacks.text
        val thurCal=txt_Cal.text

        val friJacks=txt_jacks.text
        val friCal=txt_Cal.text

        val satJacks=txt_jacks.text
        val satCal=txt_Cal.text
 ///////////////////////////////////////////////////////////

        if (sundayRbn.isChecked)
            DayResult.text=("Sunday, Jumping Jacks:  $sunJacks")
        if (sundayRbn.isChecked)
            DayResult.text=("Sunday, Calories: $sunCal")
        if (mondayRbn.isChecked)
            DayResult.text=("Monday, Jumping Jacks: $monJacks")
        if (mondayRbn.isChecked)
            DayResult.text=("Monday, Calories: $monCal")

        if (tuesdayRbn.isChecked)
            DayResult.text=("Tuesday Jumping Jacks: $tueJacks")
        if (tuesdayRbn.isChecked)
            DayResult.text=("Tuesday Calories: $tueCal")

        if (wednesdayRbn.isChecked)
            DayResult.text=("Tuesday, Jumping Jacks: $wedJacks")
        if (wednesdayRbn.isChecked)
            DayResult.text=("Tuesday, Calories: $wedCal")

        if (thursdayRbn.isChecked)
            DayResult.text=("Monday, Jumping Jacks: $thurJacks")
        if (thursdayRbn.isChecked)
            DayResult.text=("Monday, Calories: $thurCal")

        if (fridayRbn.isChecked)
            DayResult.text=("Tuesday Jumping Jacks: $friJacks")
        if (fridayRbn.isChecked)
            DayResult.text=("Tuesday Calories: $friCal")

        if (saturdayRbn.isChecked)
            DayResult.text=("Tuesday, Jumping Jacks: $satJacks")
        if (saturdayRbn.isChecked)
            DayResult.text=("Tuesday, Calories: $satCal")
    }
    fun clearButton(view: View) {
        btn_Clear.run { btn_Clear.clearText() }
    }
}


