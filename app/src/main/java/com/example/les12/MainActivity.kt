package com.example.les12

import android.content.Intent
import android.icu.text.IDNA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegister.setOnClickListener {
            if (!etName.text.isNullOrEmpty() && !etSurname.text.isNullOrEmpty()
                && !etTown.text.isNullOrEmpty()){
                navigateToSecondActivity()}
            else {
                Toast.makeText(this, "Введите все данные", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun navigateToSecondActivity(){
        val intent = Intent (this, SecondActivity::class.java)
        intent.putExtra("NAME_EXTRA",etName.text.toString())
        intent.putExtra("PASSWORD_EXTRA",etSurname.text.toString())
        intent.putExtra("TOWN_EXTRA",etTown.text.toString())
        startActivity(intent)
    }
}