package ru.akinadude.dagger.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {

    companion object {
        const val TAG = "Car"
    }

    override fun start() {
        Log.d(TAG, "Diesel engine starting, horse power: $horsePower")
    }
}