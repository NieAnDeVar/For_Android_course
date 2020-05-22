package com.nieandevar.for_android_course

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    var arguments = intent.extras
     var  Name1: String = arguments?.get("Name1").toString()
     var  Name2: String = arguments?.get("Name2").toString()
     var  email : String = arguments?.get("email").toString()
   fun Exit(){
    val randomIntent = Intent(this, MainActivity ::class.java)
    startActivity(randomIntent)
}
}
