package com.example.kotlin_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.LinearLayout.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById(R.id.recyclerview) as RecyclerView
        //recyclerview.layoutManager = LinearLayoutManager(this, VERTICAL,false)
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayout.HORIZONTAL,false)

        val users = ArrayList<User>()
        users.add(User("Antony Ngugi","Computer Science"))
        users.add(User("Sharon Kangai", "BCom"))
        users.add(User("Kelvin Murimi","Economics"))
        users.add(User("Eric Mumo","IT"))
        users.add(User("Faith Mukami","Mechanical Engineering"))
        users.add(User("Victor Karanja","GeGIS"))
        users.add(User("Kelvin Murimi","BBA"))
        users.add(User("Kamau Sylvester","Computer Science"))
        users.add(User("Kelvin Murimi","BBIT"))
        users.add(User("Kelvin Murimi","Economics"))

        val adapter = RecyclerAdapter(users)
        recyclerview.adapter=adapter

    }
}
