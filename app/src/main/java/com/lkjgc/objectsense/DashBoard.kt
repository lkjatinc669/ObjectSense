package com.lkjgc.objectsense

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lkjgc.objectsense.detection.Detector

class DashBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        startActivity(Intent(this@DashBoard, Detector::class.java))
    }
}