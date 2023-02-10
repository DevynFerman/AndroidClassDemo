package com.kroger.classdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.CharacterAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val transformers = mutableListOf<Transformer>()
        for (robot in 0..5) {
            transformers.add(createTransformer(transformers[robot]))
        }
        //val adapter = CharacterAdapter
    }

    private fun createTransformer(robot: Transformer): Transformer {
        //initialize the transformer here


    }
}