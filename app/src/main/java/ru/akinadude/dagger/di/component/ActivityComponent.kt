package ru.akinadude.dagger.di.component

import dagger.Subcomponent
import ru.akinadude.dagger.MainActivity
import ru.akinadude.dagger.di.module.DieselEngineModule
import ru.akinadude.dagger.di.module.WheelsModule
import ru.akinadude.dagger.di.scope.ActivityScope

@ActivityScope
@Subcomponent(modules = [WheelsModule::class, DieselEngineModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

    //subcomponents also have builders, but we'll see it in the next video
}