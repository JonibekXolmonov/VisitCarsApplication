package com.example.visitcarsapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openInstagram()
        call()
        openImages()

    }

    private fun openInstagram() {
        val instagramButton = findViewById<Button>(R.id.btn_instagram)
        instagramButton.setOnClickListener {
            openInstagramProfile("https://www.instagram.com/eliot/")
        }
    }

    private fun openInstagramProfile(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun call() {
        val callButton = findViewById<Button>(R.id.btn_phone_call)
        callButton.setOnClickListener {
            phoneCall("tel:+998914631974")
        }
    }

    private fun phoneCall(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse(phoneNumber)
        startActivity(intent)
    }

    private fun openImages() {
        val pictureButton = findViewById<Button>(R.id.btn_pictures)
        pictureButton.setOnClickListener {
            openMyPicturesPage()
        }
    }

    private fun openMyPicturesPage() {
        val intent = Intent(this, MyPicturesActivity::class.java)
        startActivity(intent)
    }
}