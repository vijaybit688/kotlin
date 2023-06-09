package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<EmployeeModelClass>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val EmployeeModelClass = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(EmployeeModelClass.image)

        // sets the text to the textview from our itemHolder class
        holder.name.text = EmployeeModelClass.name

        holder.role.text=EmployeeModelClass.role
        holder.itemView.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(v?.getContext(), "${holder.name.text}", Toast.LENGTH_SHORT).show();

            }
        })

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.circleImageView)
        var name: TextView = itemView.findViewById(R.id.name)
        val role:TextView=itemView.findViewById(R.id.role)
    }
}