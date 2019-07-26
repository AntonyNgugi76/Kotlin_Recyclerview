package com.example.kotlin_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter (val userList:ArrayList<User>):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user:User =userList[position]

        holder.textViewName.text = user.name
        holder.textViewCourse.text=user.course

    }


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById(R.id.tViewname) as TextView
        val textViewCourse = itemView.findViewById(R.id.tViewcourse) as TextView

    }

}