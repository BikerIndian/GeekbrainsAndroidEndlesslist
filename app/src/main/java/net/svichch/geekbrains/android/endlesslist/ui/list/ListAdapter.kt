package net.svichch.geekbrains.android.endlesslist.ui.list

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import net.svichch.geekbrains.android.endlesslist.databinding.FragmentListItemBinding
import net.svichch.geekbrains.android.endlesslist.network.api.hot.Child

class ListAdapter(
    private val values: List<Child>
) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.commentSize.text = (item.data?.numComments ?: "0").toString()
        holder.content.text = item.data?.title ?: "No info"
        holder.starNum.text = (item.data?.numCrossposts ?: "0").toString()
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val commentSize: TextView = binding.commentSize
        val content: TextView = binding.content
        val starNum: TextView = binding.starNum

        override fun toString(): String {
            return super.toString() + " '" + content.text + "'"
        }
    }

}