package com.example.listviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>()
        repeat(16) {
            val index = it + 1;
            items.add(
                ItemModel("Doulingo", "It's time for your daily English lesson. Take 5 minutes now to complete it.",
                    "8:00 AM")
            )
        }

        findViewById<ListView>(R.id.list_view).adapter = ItemAdapter(items)
    }
}