package com.example.ezcalculator

import android.icu.text.NumberFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.ezcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.additionButton.setOnClickListener { addition() }
        binding.subtractionButton.setOnClickListener { subtraction() }
        binding.multiplicationButton.setOnClickListener { multiplication() }
        binding.divisionButton.setOnClickListener { division() }
        binding.clearButton.setOnClickListener { clearFields() }
    }

    private fun clearFields() {
       // Clear first text entry field
        val stringInTextField = binding.firstNumber.text
        stringInTextField.clear()
        // Clear second text entry field
        val nextStringInTextField = binding.secondNumber.text
        nextStringInTextField.clear()

    }

    private fun division() {
        val stringInTextField = binding.firstNumber.text.toString()
        val n1 = stringInTextField.toDouble()
        val nextStringInTextField = binding.secondNumber.text.toString()
        val n2 = nextStringInTextField.toDouble()
        var result = n1 / n2
        java.text.NumberFormat.getNumberInstance()
        val formattedResult = java.text.NumberFormat.getNumberInstance().format(result)
        binding.resultBox.text = getString(R.string.result, formattedResult)
    }

    private fun multiplication() {
        val stringInTextField = binding.firstNumber.text.toString()
        val n1 = stringInTextField.toDouble()
        val nextStringInTextField = binding.secondNumber.text.toString()
        val n2 = nextStringInTextField.toDouble()
        var result = n1 * n2
        java.text.NumberFormat.getNumberInstance()
        val formattedResult = java.text.NumberFormat.getNumberInstance().format(result)
        binding.resultBox.text = getString(R.string.result, formattedResult)
    }

    private fun subtraction() {
        val stringInTextField = binding.firstNumber.text.toString()
        val n1 = stringInTextField.toDouble()
        val nextStringInTextField = binding.secondNumber.text.toString()
        val n2 = nextStringInTextField.toDouble()
        var result = n1 - n2
        java.text.NumberFormat.getNumberInstance()
        val formattedResult = java.text.NumberFormat.getNumberInstance().format(result)
        binding.resultBox.text = getString(R.string.result, formattedResult)
    }

    private fun addition() {
        val stringInTextField = binding.firstNumber.text.toString()
        val n1 = stringInTextField.toDouble()
        val nextStringInTextField = binding.secondNumber.text.toString()
        val n2 = nextStringInTextField.toDouble()
        var result = n1 + n2
        java.text.NumberFormat.getNumberInstance()
        val formattedResult = java.text.NumberFormat.getNumberInstance().format(result)
        binding.resultBox.text = getString(R.string.result, formattedResult)
    }
}
