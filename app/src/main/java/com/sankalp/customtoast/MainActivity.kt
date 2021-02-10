package com.sankalp.customtoast

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn_toast : Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast  = findViewById(R.id.button_Toast)

        btn_toast.setOnClickListener {
            val custom_Toast = Toast(this)
            val toastView: View = layoutInflater.inflate(R.layout.custom_toast_message,null)
            custom_Toast.setGravity(Gravity.CENTER,0 ,0)
            custom_Toast.setDuration(Toast.LENGTH_SHORT)
            custom_Toast.setView(toastView)
            custom_Toast.show()

        }
     }
  }

/*
val inflater = layoutInflater
val container: ViewGroup = findViewById(R.id.toast_Container)
val layout: ViewGroup = inflater.inflate(R.layout.custom_toast_message, container) as ViewGroup
val text: TextView = layout.findViewById(R.id.textView)
text.text = "Custom Toast Successfully Displayed"
with(Toast(applicationContext)) {
    setGravity(Gravity.CENTER_VERTICAL, 0, 0)
    duration = Toast.LENGTH_LONG
    view = layout
    show()
}*/
