package com.example.constraintui


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.constraintui.databinding.ItemForTopicBinding


class TopicAdapter(
    private val topics: List<TopicItem>,
): RecyclerView.Adapter<TopicAdapter.TopicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemForTopicBinding.inflate(inflater, parent, false)

        return TopicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TopicViewHolder, position: Int) {
        val topic = topics[position]
        val context = holder.itemView.context
        with(holder.binding){
            text.text = topic.text
            imageView.setImageResource(topic.image)
        }
    }

    override fun getItemCount(): Int {
        return topics.size
    }

    class TopicViewHolder(val binding: ItemForTopicBinding) : RecyclerView.ViewHolder(binding.root)
}
