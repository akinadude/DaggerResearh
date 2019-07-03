package ru.akinadude.dagger.car

import android.util.Log
import javax.inject.Inject

open class Car @Inject constructor(
    private val engine: Engine,
    private val wheels: Wheels,
    private val driver: Driver
) {

    companion object {
        const val TAG = "Car"
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver drives $this")
    }
}