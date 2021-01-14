package com.example.gilymee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_settime.*

class SettimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settime)

        settime_exit_btn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "알림 설정이 취소되었습니다", Toast.LENGTH_SHORT).show()
        }
    }
}