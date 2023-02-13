package com.kroger.classdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.CharacterAdapter

var transformerNames = listOf("Optimus Prime", "Bumblebee", "Ironhide", "Jazz", "Ratchet", "Megatron", "Starscream", "Soundwave", "Shockwave", "Unicron")
var transformerVehicle = listOf("Car", "Truck", "Airplane", "Jet", "Spaceship")
var transformerHeights = listOf("Small", "Tall", "Huge", "This mf big for real")
var transformerAlliance = listOf("Autobot", "Decepticon")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val transformers = mutableListOf<Transformer>()
        for (robot in 0..10) {
            transformers.add(createTransformer(robot))
        }
        val adapter = CharacterAdapter(transformers)
        recyclerView.adapter = adapter
    }

    private fun createTransformer(count : Int) = Transformer(
        name = transformerNames[count],
        image = 12, //TODO: Implement a drawable
        alliance = transformerAlliance.random(),
        vehicle = transformerVehicle.random(),
        height = transformerHeights.random()
    )
    }