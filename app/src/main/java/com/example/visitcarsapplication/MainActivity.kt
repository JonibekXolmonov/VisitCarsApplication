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

        call()
        openTelegram()
        openFacebook()
        openGitHUb()
        openImages()

    }

    private fun call() {
        val callButton = findViewById<Button>(R.id.btn_phone_call)
        callButton.setOnClickListener {
            phoneCall(getString(R.string.phone_number))
        }
    }

    private fun phoneCall(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse(phoneNumber)
        startActivity(intent)
    }

    private fun openTelegram() {
        val instagramButton = findViewById<Button>(R.id.btn_telegram)
        instagramButton.setOnClickListener {
            openTelegramProfile(getString(R.string.telegram_link))
        }
    }

    private fun openTelegramProfile(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun openFacebook() {
        val instagramButton = findViewById<Button>(R.id.btn_facebook)
        instagramButton.setOnClickListener {
            openFacebookProfile(getString(R.string.facebook_link))
        }
    }

    private fun openFacebookProfile(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun openGitHUb() {
        val instagramButton = findViewById<Button>(R.id.btn_gitHub)
        instagramButton.setOnClickListener {
            openGitHubProfile(getString(R.string.gitHub_link))
        }
    }

    private fun openGitHubProfile(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
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