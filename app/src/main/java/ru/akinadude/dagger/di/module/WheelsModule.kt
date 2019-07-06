package ru.akinadude.dagger.di.module

import dagger.Module
import dagger.Provides
import ru.akinadude.dagger.car.Rims
import ru.akinadude.dagger.car.Tires
import ru.akinadude.dagger.car.Wheels

@Module
object WheelsModule {

    @JvmStatic
    @Provides
    fun provideRims(): Rims = Rims()

    @JvmStatic
    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    @JvmStatic
    @Provides
    fun provideWheels(rims: Rims, tires: Tires) = Wheels(rims, tires)
}