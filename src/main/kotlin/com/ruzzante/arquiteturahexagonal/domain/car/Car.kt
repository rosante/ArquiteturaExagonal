package com.ruzzante.arquiteturahexagonal.domain.car

class Car(
    val id: Long? = null,
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
)