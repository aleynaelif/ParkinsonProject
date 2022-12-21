package com.example.parkinson

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.parkinson.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }


    fun kaydet(view: View){

        if(binding.ppeNum.text.isNotEmpty() && binding.shimmerNum.text.isNotEmpty() &&  binding.foNum.text.isNotEmpty() && binding.rpdeNum.text.isNotEmpty() && binding.spreadNum.text.isNotEmpty()){

            val ppe = binding.ppeNum.text.toString().toFloat()
            val shimmer = binding.shimmerNum.text.toString().toFloat()
            val fo = binding.foNum.text.toString().toFloat()
            val rpde = binding.rpdeNum.text.toString().toFloat()
            val spread = binding.spreadNum.text.toString().toFloat()

            if(ppe > 0.130 && shimmer>0.191){
                Toast.makeText(this,"%97 oranında parkinson hastasısınız!",Toast.LENGTH_LONG).show()
            }
            else if(ppe > 0.130 &&  shimmer <= 0.191 && fo > 118.141){
                Toast.makeText(this,"%91 oranında parkinson hastasısınız!",Toast.LENGTH_LONG).show()
            }
            else if(ppe > 0.130 &&  shimmer <= 0.191  && fo > 112.349 && fo <= 118.141){
                Toast.makeText(this,"Parkinson hastası değilsiniz!",Toast.LENGTH_LONG).show()
            }
            else if(ppe > 0.130 &&  shimmer <= 0.191  &&  fo <= 112.349 ){
                Toast.makeText(this,"Parkinson hastasısınız!",Toast.LENGTH_LONG).show()
            }
            else if(ppe <= 0.130  && rpde > 0.337 && spread > 0.209 && fo > 138.017 ){
                Toast.makeText(this,"Parkinson hastasısınız!",Toast.LENGTH_LONG).show()
            }
            else if(ppe <= 0.130 && rpde > 0.337 && spread > 0.209 && fo <= 138.017){
                Toast.makeText(this,"Parkinson hastası değilsiniz!",Toast.LENGTH_LONG).show()
            }
            else if(ppe <= 0.130 && rpde > 0.337 && spread <= 0.209){
                Toast.makeText(this,"Parkinson hastası değilsiniz!",Toast.LENGTH_LONG).show()
            }
            else if(ppe <= 0.130 && rpde <= 0.337 && fo > 217.579){
                Toast.makeText(this,"Parkinson hastası değilsiniz!",Toast.LENGTH_LONG).show()
            }
            else if(ppe <= 0.130 && rpde <= 0.337 && fo <= 217.579){
                Toast.makeText(this,"Parkinson hastasısınız!",Toast.LENGTH_LONG).show()
            }
        }
        else{
            Toast.makeText(this,"Lütfen bütün değerleri giriniz!",Toast.LENGTH_LONG).show()
        }
    }
}