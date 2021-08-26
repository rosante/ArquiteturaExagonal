package com.ruzzante.arquiteturahexagonal.domain.car

interface CarRepository {
    fun getDetail(id: Long): Car?
    fun getCars(): List<Car>
    fun insert(car: Car):Car
    fun delete(id: Long)
    fun update(car: Car): Car
}