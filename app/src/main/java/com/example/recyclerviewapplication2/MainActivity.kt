package com.example.recyclerviewapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var homeRecyclerViewAdapter: HomeRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            homeRecyclerViewAdapter = HomeRecyclerViewAdapter(getData())
            homeRV.adapter = homeRecyclerViewAdapter
            homeRV.layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun getData(): MutableList<Email> {
        val listItem = ArrayList<Email>()
        listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
        listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
        listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
        listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
        listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
        listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
        listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
        listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
        listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
        listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
        listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
        listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
        listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
        listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
        listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
        listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
        listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
        listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
        return listItem
    }
}