package com.example.dialogcustomlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mydialog.MyDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dialog  = MyDialog(this)
        dialog.createRoundColorsDialog()

    }
}