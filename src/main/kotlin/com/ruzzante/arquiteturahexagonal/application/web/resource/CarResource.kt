package com.ruzzante.arquiteturahexagonal.application.web.resource

import com.ruzzante.arquiteturahexagonal.application.web.resource.request.CarRequest
import com.ruzzante.arquiteturahexagonal.application.web.resource.response.CarResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import sun.security.provider.certpath.OCSPResponse
import javax.validation.Valid

@RestController
@RequestMapping(value = ["/car"])
class CarResource {

    @GetMapping
    fun getCars(): ResponseEntity<List<CarResponse>> =
        ResponseEntity.ok().body(emptyList<CarResponse>())

    @GetMapping("{id}")
    fun getCarDetails(@PathVariable("id") id:Long): ResponseEntity<CarResponse> =
        ResponseEntity.ok().build<CarResponse>()

    fun insertCar(@Valid @RequestBody request: CarRequest) = OCSPResponse.ResponseStatus.SUCCESSFUL
}