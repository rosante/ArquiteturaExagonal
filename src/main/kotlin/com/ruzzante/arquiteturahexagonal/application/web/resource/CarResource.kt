package com.ruzzante.arquiteturahexagonal.application.web.resource

import com.ruzzante.arquiteturahexagonal.application.web.resource.request.CarRequest
import com.ruzzante.arquiteturahexagonal.application.web.resource.response.CarResponse
import com.ruzzante.arquiteturahexagonal.domain.car.CarRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI
import javax.validation.Valid

private const val API_PATH = "/car"

@RestController
@RequestMapping(value = [API_PATH])
class CarResource (
    @Autowired private val repository: CarRepository
){

    @GetMapping
    fun getCars() = repository.getCars()
        .map{CarResponse.from(it)}
        .let{ ResponseEntity.ok().body(it) }

    @GetMapping("{id}")
    fun getCarDetails(@PathVariable("id") id:Long) = repository.getDetail(id)
        .let{ResponseEntity.ok().body(CarResponse.from(it))}

    fun insertCar(@Valid @RequestBody request: CarRequest) = request.toCar()
        .run {
            repository.insert(this)
        }
        .let{
            ResponseEntity
                .created(URI("$API_PATH/${it.id}"))
                .body(CarResponse.from(it))
        }
}