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
//
//        binding.btnAdd.setOnClickListener {
//            var firstnumb= binding.etFirstNumber.text.toString()
//            var secondnumb=binding.etSecondNumber.text.toString()
//            if(firstnumb.isBlank()){
//                binding.etFirstNumber.setError("first number is required")
//                return@setOnClickListener
//            }
//            if(secondnumb.isBlank()){
//                binding.etSecondNumber.setError("second numberis required")
//                return@setOnClickListener
//            }
//            Add(firstnumb.toInt(), secondnumb.toInt())
//
//
//        }
//                 binding.btnDivision.setOnClickListener {
//            var firstnumb= binding.etFirstNumber.text.toString()
//            var secondnumb=binding.etSecondNumber.text.toString()
//            if(firstnumb.isBlank()){
//               binding. etFirstNumber.setError("first number  is required")
//                return@setOnClickListener
//            }
//            if(secondnumb.isBlank()){
//                binding.etSecondNumber.setError("second number is required")
//                return@setOnClickListener
//            }
//            Division(firstnumb.toInt(), secondnumb.toInt())


        }
        fun  handleclick(){
            binding.btnAdd.setOnClickListener {
                var inputs=obtainInput()
                if(inputs!=null){
                    Add(inputs.firstnum,inputs.secondnum)
                }
            }
            binding.btnDivision.setOnClickListener {
                var inputs=obtainInput()
                if(inputs!=null){
                    Subtraction(inputs.firstnum,inputs.secondnum)
                }
            }
            binding.btnModulus.setOnClickListener {
                var inputs=obtainInput()
                if(inputs!=null){
                    Division(inputs.firstnum,inputs.secondnum)
                }
            }
            binding.btnSubtract.setOnClickListener {
                var inputs=obtainInput()
                if(inputs!=null){
                    Modulus(inputs.firstnum,inputs.secondnum)
                }
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


//        binding.btnModulus.setOnClickListener {
//            var firstnumb=binding.etFirstNumber.text.toString()
//            var secondnumb=binding.etSecondNumber.text.toString()
//            if(firstnumb.isBlank()){
//                binding.etFirstNumber.setError("first numberis required")
//                return@setOnClickListener
//            }
//            if(secondnumb.isBlank()){
//                binding.etSecondNumber.setError("second number is required")
//                return@setOnClickListener
//            }
//            Modulus(firstnumb.toInt(), secondnumb.toInt())
//        }
//       binding. btnSubtract.setOnClickListener {
//            var firstnumb=binding.etFirstNumber.text.toString()
//            var secondnumb=binding.etSecondNumber.text.toString()
//            if(firstnumb.isBlank()){
//                binding.etFirstNumber.setError("first number is required")
//                return@setOnClickListener
//            }
//            if(secondnumb.isBlank()){
//                binding.etSecondNumber.setError("second number is required")
//                return@setOnClickListener
//            }
//            Subtraction(firstnumb.toInt(), secondnumb.toInt())
//
//        }

//    }
    fun Add(firstnumb:Double,secondnumb:Double){
        var add=firstnumb+secondnumb
        binding.tvAnswer.text=add.toString()
    }
    fun Division(firstnumb:Double,secondnumb:Double){
        var add=firstnumb/secondnumb
        binding.tvAnswer.text=add.toString()
    }
    fun Modulus(firstnumb:Double,secondnumb:Double){
        var add=firstnumb%secondnumb
        binding.tvAnswer.text=add.toString()
    }
    fun Subtraction(firstnumb:Double,secondnumb:Double){
        var add=firstnumb-secondnumb
        binding.tvAnswer.text=add.toString()
 }
}