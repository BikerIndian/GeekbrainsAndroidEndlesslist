package net.svichch.geekbrains.android.endlesslist.ui.list.paging

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import net.svichch.geekbrains.android.endlesslist.R
import net.svichch.geekbrains.android.endlesslist.data.HotEntity

class PagingAdapter : PagingDataAdapter<HotEntity, PagingAdapter.PagingViewHolder>(diffCallback) {
    override fun onBindViewHolder(holder: PagingViewHolder, position: Int) {
        holder.bindTo(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagingViewHolder {
        return PagingViewHolder(parent)
    }

    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<HotEntity>() {
            // Первый этап сравнения
            override fun areItemsTheSame(oldItem: HotEntity, newItem: HotEntity): Boolean {
                return oldItem.content == newItem.content
            }

            // Второй этап сравнения
            override fun areContentsTheSame(oldItem: HotEntity, newItem: HotEntity): Boolean {
                return oldItem.starNum == newItem.starNum
                        && oldItem.comment_size == newItem.comment_size
            }
        }
    }

    inner class PagingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.fragment_list_item, parent, false)
    ) {
        private val nameView = itemView.findViewById<TextView>(R.id.content)
        private val starNum = itemView.findViewById<TextView>(R.id.star_num)
        private val commentSize = itemView.findViewById<TextView>(R.id.comment_size)

        fun bindTo(item: HotEntity?) {

            nameView.text = item?.content
            starNum.text = item?.starNum
            commentSize.text = item?.comment_size
        }
    }
}


