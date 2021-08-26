package com.ruzzante.arquiteturahexagonal.application.web.resource.response

import com.ruzzante.arquiteturahexagonal.domain.car.Car

data class CarResponse (
    val id: Long?,
    val placa: String,
    val tipo: String,
    val marca: String,
    val modelo: String,
    val ano: String,
    val cor: String,
    val kilometragem: Long,
    val combustivel: String,
    val descricao: String?,
    val vendido: Boolean,
    val valor: Double,
    val agencia: String
){
    companion object {
        fun from(car: Car) = CarResponse(
            id = car.id,
            placa = car.placa,
            tipo = car.tipo,
            marca = car.marca,
            modelo = car.modelo,
            ano = car.ano,
            cor = car.cor,
            kilometragem = car.kilometragem,
            combustivel = car.combustivel,
            descricao = car.descricao,
            vendido = car.vendido,
            valor = car.valor,
            agencia = car.agencia
        )
    }
}
