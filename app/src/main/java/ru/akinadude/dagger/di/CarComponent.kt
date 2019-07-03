package ru.akinadude.dagger.di

import dagger.BindsInstance
import dagger.Component
import ru.akinadude.dagger.MainActivity
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        //todo create constants for names
        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") capacity: Int): Builder

        fun build(): CarComponent
    }
}