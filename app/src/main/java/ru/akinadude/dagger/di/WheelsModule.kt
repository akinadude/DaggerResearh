package ru.akinadude.dagger.di

import dagger.Module
import dagger.Provides
import ru.akinadude.dagger.car.Rims
import ru.akinadude.dagger.car.Tires
import ru.akinadude.dagger.car.Wheels

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims = Rims()

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
}