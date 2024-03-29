package ru.akinadude.dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.akinadude.dagger.car.Car
import ru.akinadude.dagger.di.module.DieselEngineModule
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

        //todo note: driver lives as long as application lives.
        // It is application wide singleton.

        //todo But maybe we would want to have some object whose lifecycle is bound to activity or fragment lifecycle.
        // The solution is custom scopes.

        //todo @Scope annotations make sense within a component.

        // Introducing subcomponents

        val component = (application as App).getAppComponent()
            .getActivityComponent(DieselEngineModule(120))
        component.inject(this)

        car.drive()
        car2.drive()
    }
}
