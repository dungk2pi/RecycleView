package com.example.android

import android.os.Bundle
import android.widget.ListView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_view)

        var list : ArrayList<Message> = ArrayList<Message>()

        list.add(Message("Vu Minh Dung", "Android", "10:00 AM"))
        list.add(Message("Vu Minh Dung", "Android", "9:30 AM"))
        list.add(Message("Vu Minh Dung", "Android", "9:00 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:40 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:30 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:03 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:00 AM"))
        list.add(Message("Vu Minh Dung", "Android", "9:00 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:40 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:30 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:03 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:00 AM"))
        list.add(Message("Vu Minh Dung", "Android", "9:00 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:40 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:30 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:03 AM"))
        list.add(Message("Vu Minh Dung", "Android", "8:00 AM"))


        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = Adapter(list)
    }
}

