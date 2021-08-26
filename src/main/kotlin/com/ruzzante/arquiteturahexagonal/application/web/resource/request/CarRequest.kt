package com.ruzzante.arquiteturahexagonal.application.web.resource.request

import com.ruzzante.arquiteturahexagonal.domain.car.Car
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class CarRequest(
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val placa: String,

    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val tipo: String,

    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val marca: String,

    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val modelo: String,

    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val ano: String,

    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val cor: String,

    @field:NotNull
    val kilometragem: Long,

    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val combustivel: String,

    val descricao: String,

    val vendido: Boolean,

    @field:NotNull
    val valor: Double,

    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val agencia: String
){
    // Converte o Request para o Objeto do Domain
    fun toCar() = Car(
        placa = placa,
        tipo = tipo,
        marca = marca,
        modelo = modelo,
        ano = ano,
        cor = cor,
        kilometragem = kilometragem,
        combustivel = combustivel,
        descricao = descricao,
        vendido = vendido,
        valor = valor,
        agencia = agencia
    )

    companion object {
        fun to(id: Long, request: CarRequest) = Car(
            id = id,
            placa = request.placa,
            tipo = request.tipo,
            marca = request.marca,
            modelo = request.modelo,
            ano = request.ano,
            cor = request.cor,
            kilometragem = request.kilometragem,
            combustivel = request.combustivel,
            descricao = request.descricao,
            vendido = request.vendido,
            valor = request.valor,
            agencia = request.agencia
        )
    }
}
