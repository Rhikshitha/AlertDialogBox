package com.example.alertdialogbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etMessage: EditText = findViewById(R.id.etMessage)
        val btMsg : Button = findViewById(R.id.btMsg)
        btMsg.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                .setTitle("MAD Lab")
                .setMessage(etMessage.text.toString())
                .setPositiveButton("OK"){
                    dialog, which ->
                }
                .setNegativeButton("Cancel"){
                    dialog, which ->
                }
                .create()
            alertDialog.show()
        }
    }
}