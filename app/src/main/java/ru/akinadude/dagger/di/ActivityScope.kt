package ru.akinadude.dagger.di

import javax.inject.Scope

import kotlin.annotation.Retention
import kotlin.annotation.AnnotationRetention.RUNTIME

@Scope
@Retention(RUNTIME)
annotation class ActivityScope