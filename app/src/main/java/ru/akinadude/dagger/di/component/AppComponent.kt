package ru.akinadude.dagger.di.component

import dagger.Component
import ru.akinadude.dagger.car.Driver
import ru.akinadude.dagger.di.module.DieselEngineModule
import ru.akinadude.dagger.di.module.DriverModule
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getActivityComponent(dieselEngineModule: DieselEngineModule): ActivityComponent
}