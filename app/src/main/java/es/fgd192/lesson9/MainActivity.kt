package es.fgd192.lesson9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {
    private var spnrCity: Spinner? = null
    private var textv: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        setupSpinner()
        CityColektion()
    }

    private fun initView() {
        spnrCity = findViewById(R.id.spnrCity)
        textv = findViewById(R.id.textv)
    }

    private fun setupSpinner() {
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.City,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spnrCity?.adapter = adapter
    }

    private fun CityColektion() {
        spnrCity?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                if (position != 0) {
                    when(position){
                        1 -> textv?.setText(parent.getItemAtPosition(position).toString())
                        3 -> textv?.setText(parent.getItemAtPosition(position).toString())
                        4 -> textv?.setText(parent.getItemAtPosition(position).toString())
                        5 -> textv?.setText(parent.getItemAtPosition(position).toString())
                        6 -> textv?.setText(parent.getItemAtPosition(position).toString())
                        7 -> textv?.setText(parent.getItemAtPosition(position).toString())
                        8 -> textv?.setText(parent.getItemAtPosition(position).toString())
                        9 -> textv?.setText(parent.getItemAtPosition(position).toString())
                        10 -> textv?.setText(parent.getItemAtPosition(position).toString())
                    }
                }
            }
        }
    }
}
