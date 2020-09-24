package jp.techacademy.yuuki.nakano4.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            showTimePickerDiaLog()
        }
    }

    private fun showTimePickerDiaLog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if (2 <= hour && hour < 10){
                    textView.text = "おはよう"
                } else if (10 <= hour && hour < 18){
                    textView.text = "こんにちは"
                } else {
                    textView.text = "こんばんは"
                }

            },
            13, 0, true)
        timePickerDialog.show()
    }
}
