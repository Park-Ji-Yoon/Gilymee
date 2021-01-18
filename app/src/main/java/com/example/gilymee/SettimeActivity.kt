package com.example.gilymee

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_settime.*
import java.util.*

class SettimeActivity : AppCompatActivity() {

    var minute = 0
    var hour = 0
    var alarmManager : AlarmManager = getSystemService(ALARM_SERVICE) as AlarmManager;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settime)

        settime_btn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                hour = time_picker.getHour() + ""
                minute = time_picker.getMinute() + ""
            } else {
                hour = time_picker.getCurrentHour() + ""
                minute = time_picker.getCurrentMinute() + ""
            }
            Toast.makeText(applicationContext, time_picker.getHour() + "시 " + time_picker.getMinute() + "분", Toast.LENGTH_SHORT).show()
        }

        settime_exit_btn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "알림 설정이 취소되었습니다", Toast.LENGTH_SHORT).show()
        }
        //   time_picker.setIs24HourView(true);
    }
}