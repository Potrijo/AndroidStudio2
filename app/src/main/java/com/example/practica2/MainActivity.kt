package com.example.practica2

import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

private const val TAG = "MyActivity"

class MainActivity : AppCompatActivity() {

    var textazo = ""
    var numeroVista = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultat = findViewById<TextView>(R.id.textView2)


        var btn = findViewById<Button>(R.id.button19)
        var btnRestar = findViewById<Button>(R.id.button20)
        var btnAug = findViewById<Button>(R.id.button21)
        var btnDism = findViewById<Button>(R.id.button23)
        var btnAmag = findViewById<Button>(R.id.button25)
        var btnMost = findViewById<Button>(R.id.button24)
        var btnColorText = findViewById<Button>(R.id.button26)
        var btnColorFons = findViewById<Button>(R.id.button27)

        btn.setOnClickListener {

            var resultat = findViewById<TextView>(R.id.textView2)

            var cadena: String = resultat.text.toString()

            numeroVista = cadena.toInt() + 1

            resultat.setText(numeroVista.toString()) // Do something in response to button click
        }

        btnRestar.setOnClickListener{
            var resultat = findViewById<TextView>(R.id.textView2)

            var cadena: String = resultat.text.toString()

            numeroVista = cadena.toInt() - 1

            resultat.setText(numeroVista.toString())
        }

        btnAug.setOnClickListener{
            var resultat = findViewById<TextView>(R.id.textView2)

            resultat.setTextSize(TypedValue.COMPLEX_UNIT_PX, resultat.textSize + 50)

        }

        btnDism.setOnClickListener{
            var resultat = findViewById<TextView>(R.id.textView2)

            resultat.setTextSize(TypedValue.COMPLEX_UNIT_PX, resultat.textSize - 50)

        }

        btnAmag.setOnClickListener {
            var resultat = findViewById<TextView>(R.id.textView2)

            resultat.setVisibility(View.INVISIBLE);

        }

        btnMost.setOnClickListener {
            var resultat = findViewById<TextView>(R.id.textView2)

            resultat.setVisibility(View.VISIBLE);

        }

        btnColorFons.setOnClickListener {
            var resultat = findViewById<ConstraintLayout>(R.id.mainLayout)
            val random1 = (-1000000..0).shuffled().first() // or .last() doesn't matter

            Log.d(TAG, random1.toString())
            resultat.setBackgroundColor(random1)
        }

       btnColorText.setOnClickListener{
            var resultat =findViewById<TextView>(R.id.textView2)
            val random1 = (-100000..0).shuffled().first() // or .last() doesn't matter
            resultat.setTextColor(random1);
        }




    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")


    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")


    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "OnSaveInstanceSte")
        var restoreTextView = findViewById<TextView>(R.id.textView2)

        outState.putString("numeroVista", restoreTextView.text.toString())

        super.onSaveInstanceState(outState)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "OnRestore")

        var restoreTextView = findViewById<TextView>(R.id.textView2)

        restoreTextView.text = savedInstanceState.getString("numeroVista")

        super.onRestoreInstanceState(savedInstanceState)

    }

}