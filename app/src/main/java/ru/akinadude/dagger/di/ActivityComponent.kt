package ru.akinadude.dagger.di

import dagger.BindsInstance
import dagger.Component
import ru.akinadude.dagger.MainActivity
import javax.inject.Named

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [WheelsModule::class, PetrolEngineModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {

        //todo create constants for names
        @BindsInstance
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("engineCapacity") capacity: Int): Builder

        fun appComponent(component: AppComponent): Builder

        fun build(): ActivityComponent
    }
}