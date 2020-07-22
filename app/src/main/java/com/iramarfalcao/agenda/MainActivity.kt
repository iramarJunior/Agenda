package com.iramarfalcao.agenda

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contacts_listView.adapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, getContacts())
    }

    private fun getContacts(): List<String> {
        return listOf(
            "Junior",
            "Sueleny",
            "Rêgo"
        )
    }
}
