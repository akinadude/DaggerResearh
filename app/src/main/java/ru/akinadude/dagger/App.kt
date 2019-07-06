package ru.akinadude.dagger

import android.app.Application
import ru.akinadude.dagger.di.component.AppComponent
import ru.akinadude.dagger.di.component.DaggerAppComponent

class App: Application() {

    private lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.create()
    }

    fun getAppComponent(): AppComponent = component
}