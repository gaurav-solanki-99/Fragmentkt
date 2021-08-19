package com.example.fragmentkt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

public  class ProjectsAdapter(var context: Context, var al:ArrayList<Projects>?) :
    RecyclerView.Adapter<ProjectsAdapter.ProjectsViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectsViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.single_layout_project,parent,false)

        return ProjectsViewHolder(view)

    }

    override fun getItemCount(): Int {


        if (al != null) {
            return al!!.size
        }
        else
        {
            return 0
        }

    }

    override fun onBindViewHolder(holder: ProjectsViewHolder, position: Int) {


        holder.text.setText(al?.get(position)?.id)
        holder.text.setText(al?.get(position)?.name)

    }

    class ProjectsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
         var text:TextView = itemView.findViewById(R.id.tvId)
        var tvProduct:TextView=itemView.findViewById(R.id.tvName)


    }
}