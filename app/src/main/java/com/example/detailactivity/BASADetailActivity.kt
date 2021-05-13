package com.example.detailactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.detailactivity.databinding.BasaDetailActivityBinding

class BASADetailActivity : AppCompatActivity() {

    private lateinit var binding: BasaDetailActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BasaDetailActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {

            TvEditOne.setOnClickListener {
                Toast.makeText(this@BASADetailActivity, "Ingrese el destinatario", Toast.LENGTH_SHORT).show()
                TvName.isFocusableInTouchMode = true
                EtDetailTransaction.isFocusableInTouchMode = true
            }

            TvEditTwo.setOnClickListener {
                Toast.makeText(this@BASADetailActivity, "Ingrese el monto", Toast.LENGTH_SHORT).show()
                EtAmount.isFocusableInTouchMode = true
            }

            TvEditThree.setOnClickListener {
                Toast.makeText(this@BASADetailActivity, "Ingrese un concepto", Toast.LENGTH_SHORT).show()
                EtTransaction.isFocusableInTouchMode = true
            }

        }
    }
}
