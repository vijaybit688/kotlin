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

            data.add(EmployeeModelClass("Heena Relwani","Android Developer",R.drawable.a))
            data.add(EmployeeModelClass("Sourabh Singh","Associate SDE",R.drawable.b))
            data.add(EmployeeModelClass("Raveen Deep","Software Developer",R.drawable.c))
            data.add(EmployeeModelClass("Shilpi Verma","Web Developer",R.drawable.d))
            data.add(EmployeeModelClass("Neha Narware","HR at CodeNicely",R.drawable.e))
            data.add(EmployeeModelClass("Heena Relwani","HR at CodeNicely",R.drawable.f))


        val adapter=CustomAdapter(data)

        recyclerView.adapter=adapter




    }
}