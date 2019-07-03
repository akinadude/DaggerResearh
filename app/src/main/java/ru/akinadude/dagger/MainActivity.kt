package ru.akinadude.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.akinadude.dagger.car.Car
import ru.akinadude.dagger.di.DaggerCarComponent
import ru.akinadude.dagger.di.DieselEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        val component = DaggerCarComponent.builder()
            .horsePower(150)
            .engineCapacity(1400)
            .build()
        component.inject(this)

        car.drive()
        car2.drive()
    }
}
