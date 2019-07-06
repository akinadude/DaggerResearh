package ru.akinadude.dagger.di.module

import dagger.Module
import dagger.Provides
import ru.akinadude.dagger.car.Driver
import javax.inject.Singleton

@Module
object DriverModule {

    @JvmStatic
    @Provides
    @Singleton
    fun provideDriver(): Driver = Driver()
}