package ru.akinadude.dagger.di.module

import dagger.Binds
import dagger.Module
import ru.akinadude.dagger.car.Engine
import ru.akinadude.dagger.car.PetrolEngine

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine): Engine
}