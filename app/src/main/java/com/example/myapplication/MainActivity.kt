package com.example.myapplication

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FF13163C")))


        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager=LinearLayoutManager(this)

        val data =ArrayList<EmployeeModelClass>()
        for (i in 1..10){
            data.add(EmployeeModelClass("Vijay $i","Android Developer",R.drawable.ic_launcher_foreground))
                    }

        val adapter=CustomAdapter(data)

        recyclerView.adapter=adapter




    }
}