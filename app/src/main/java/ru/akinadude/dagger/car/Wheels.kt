package ru.akinadude.dagger.car

//Imagine that this class is from third party library and we can't change its code.
class Wheels constructor(private val rims: Rims, private val tires: Tires)