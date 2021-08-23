package com.ruzzante.arquiteturahexagonal.application.web.request

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
    @field:NotBlank
    @field:NotEmpty
    val kilometragem: Long,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val combustivel: String,
    val descricao: String,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val vendido: Boolean,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val valor: Double,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val agencia: String,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val recursos: OpcionalRequest
)
