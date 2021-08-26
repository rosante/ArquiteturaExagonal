package com.ruzzante.arquiteturahexagonal.resource.car

import com.ruzzante.arquiteturahexagonal.domain.car.Car
import com.ruzzante.arquiteturahexagonal.domain.car.CarRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class CarRepositoryImpl(
    @Autowired private val repository: CarEntityRepository
) : CarRepository {
    override fun getDetail(id: Long): Car? =
        repository.findByIdOrNull(id)?.toCar()

    override fun getCars(): List<Car> =
        repository.findAll().map { it.toCar() }

    override fun insert(Car: Car): Car =
        repository.save(CarEntity.from(Car)).toCar()

    override fun delete(id: Long) = repository.deleteById(id)

    override fun update(Car: Car): Car =
        repository.save(CarEntity.from(Car)).toCar()
}