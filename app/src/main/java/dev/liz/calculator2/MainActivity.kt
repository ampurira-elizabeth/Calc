package dev.liz.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import javax.security.auth.Subject

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnDivide:Button
    lateinit var btnModulus:Button
    lateinit var tilFirstNUmber:TextInputLayout
    lateinit var tilSecondNumber:TextInputLayout
    lateinit var etFirstNumber:TextInputEditText
    lateinit var etSecondNumber:TextInputEditText
    lateinit var tvAnswer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilFirstNUmber=findViewById(R.id.tilFirstNumber)
        tilSecondNumber=findViewById(R.id.tilSecondNumber)
        etFirstNumber=findViewById(R.id.etFirstNumber)
        etSecondNumber=findViewById(R.id.etSecondNumber)
        tvAnswer=findViewById(R.id.tvAnswer)




        btnAdd=findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener {
            var firstnumb=etFirstNumber.text.toString()
            var secondnumb=etSecondNumber.text.toString()
            Add(firstnumb.toInt(), secondnumb.toInt())


        }
        btnDivide=findViewById(R.id.btnDivision)
        btnDivide.setOnClickListener {
            var firstnumb=etFirstNumber.text.toString()
            var secondnumb=etSecondNumber.text.toString()
            Division(firstnumb.toInt(), secondnumb.toInt())


        }
        btnModulus=findViewById(R.id.btnModulus)
        btnModulus.setOnClickListener {
            var firstnumb=etFirstNumber.text.toString()
            var secondnumb=etSecondNumber.text.toString()
            Modulus(firstnumb.toInt(), secondnumb.toInt())

        }
        btnSubtract=findViewById(R.id.btnSubtract)
        btnSubtract.setOnClickListener {
            var firstnumb=etFirstNumber.text.toString()
            var secondnumb=etSecondNumber.text.toString()
            Subtraction(firstnumb.toInt(), secondnumb.toInt())

        }

    }
    fun Add(firstnumb:Int,secondnumb:Int){
        var add=firstnumb+secondnumb
        tvAnswer.text=add.toString()


    }
    fun Division(firstnumb:Int,secondnumb:Int){
        var add=firstnumb/secondnumb
        tvAnswer.text=add.toString()
    }
    fun Modulus(firstnumb:Int,secondnumb:Int){
        var add=firstnumb%secondnumb
        tvAnswer.text=add.toString()
    }
    fun Subtraction(firstnumb:Int,secondnumb:Int){
        var add=firstnumb-secondnumb
        tvAnswer.text=add.toString()


    }
//    fun validate(){
//        var firstname=etFirstNumber.text.toString()
//        var secondname=etSecondNumber.text.toString()
//        if (firstname.isBlank()) {
//            tilFirstNUmber.error = "First number required"
//        }
//        if (secondname.isBlank()) {
//            tilFirstNUmber.error = "Second name required"
//        }
//    }



}