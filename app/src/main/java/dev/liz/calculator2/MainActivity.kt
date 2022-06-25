package dev.liz.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.liz.calculator2.databinding.ActivityMainBinding
import javax.security.auth.Subject

class MainActivity : AppCompatActivity() {
    lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleclick()

        }
        fun  handleclick(){
            binding.btnAdd.setOnClickListener {
                Add(obtainInput())
            }
            binding.btnDivision.setOnClickListener {
                    Division(obtainInput())

            }
            binding.btnModulus.setOnClickListener {
                    Modulus(obtainInput())
            }
            binding.btnSubtract.setOnClickListener {
                    Subtraction(obtainInput())
                }

        }
     data class Inputs(var firstnum:Double,var secondnum:Double)
    fun obtainInput():Inputs?{
        val firstnumb=binding.etFirstNumber.text.toString()
        val secondnumb=binding.etSecondNumber.text.toString()
        var error=false
        if(firstnumb.isBlank()) {
            binding.tilFirstNumber.error="first number required"
            error=true
        }
        if(secondnumb.isBlank()) {
            binding.tilSecondNumber.error="second number required"
            error=true
        }
        if (!error){
            return Inputs(firstnumb.toDouble(),secondnumb.toDouble())

        }

        return null
    }
    fun Add(inputs: Inputs?){
        if (inputs!=null) {
            var add = inputs.firstnum + inputs.secondnum
            binding.tvAnswer.text = add.toString()
        }
    }
    fun Division(inputs: Inputs?){
        if (inputs!=null) {
            var add = inputs.firstnum / inputs.secondnum
            binding.tvAnswer.text = add.toString()
        }
    }
    fun Modulus(inputs: Inputs?){
        if (inputs!=null){
            var add= inputs.firstnum % inputs.secondnum
        binding.tvAnswer.text=add.toString()}
    }
    fun Subtraction(inputs: Inputs?){
        if (inputs!=null){
            var add=inputs.firstnum - inputs.secondnum
        binding.tvAnswer.text=add.toString()}
 }
}