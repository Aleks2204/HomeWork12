package com.example.les12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvName.text = intent.getStringExtra("NAME_EXTRA")
        tvSurname.text = intent.getStringExtra("PASSWORD_EXTRA")
        tvTown.text = intent.getStringExtra("TOWN_EXTRA")

    }
}