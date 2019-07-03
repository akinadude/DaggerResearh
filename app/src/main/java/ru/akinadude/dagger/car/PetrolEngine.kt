package ru.akinadude.dagger.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horsePower") private val horsepower: Int,
    @Named("engineCapacity") private val capacity: Int
) : Engine {

    companion object {
        const val TAG = "Car"
    }

    override fun start() {
        Log.d(TAG, "Petrol engine starting, horsepower: $horsepower, capacity: $capacity")
    }
}