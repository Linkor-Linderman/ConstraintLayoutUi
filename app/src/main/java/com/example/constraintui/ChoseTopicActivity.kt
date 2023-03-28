package com.example.constraintui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.constraintui.databinding.ActivityChoseTopicBinding


class ChoseTopicActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChoseTopicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoseTopicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listOfTopic = listOf<TopicItem>(
            TopicItem("Reduce Stress", R.drawable.topic_reduce_stress),
            TopicItem("Improve Performance", R.drawable.topic_perfomance),
            TopicItem("Increase Happiness", R.drawable.topic_happiness),
            TopicItem("Reduce Anxiety", R.drawable.topic_reduxe),
            TopicItem("Personal Growth", R.drawable.topic_growth),
            TopicItem("Better Sleep", R.drawable.topic_sleep),
        )
        val recyclerView = binding.recyclerView

        val staggeredGridLayoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        recyclerView.layoutManager = staggeredGridLayoutManager

        val adapter = TopicAdapter(listOfTopic)
        recyclerView.adapter = adapter

        val itemOffset = resources.getDimensionPixelOffset(R.dimen.recycler_margin)
        recyclerView.addItemDecoration(ItemOffsetDecoration(itemOffset))
    }
}