package org.techtown.myapplication64

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.myapplication64.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding by lazy{ActivitySubBinding.inflate(layoutInflater)}
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.to1.text=intent.getStringExtra("from1")
        binding.to2.text= "${intent.getIntExtra("from2",0)}"

        binding.button2.setOnClickListener {
            val returnIntent=Intent()
            returnIntent.putExtra("returnValue",binding.editTextTextPersonName.text.toString())
            setResult(RESULT_OK,returnIntent)
            finish()
        }

    }
}