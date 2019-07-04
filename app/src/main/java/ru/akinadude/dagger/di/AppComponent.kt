package ru.akinadude.dagger.di

import dagger.Component
import ru.akinadude.dagger.car.Driver
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun gerDriver(): Driver
}