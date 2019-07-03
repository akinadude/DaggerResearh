package ru.akinadude.dagger.di

import dagger.Module
import dagger.Provides
import ru.akinadude.dagger.car.DieselEngine
import ru.akinadude.dagger.car.Engine

@Module
class DieselEngineModule(private val horsePower: Int) {

    @Provides
    fun provideHorsePower(): Int = horsePower

    @Provides
    fun provideEngine(engine: DieselEngine): Engine = engine

}