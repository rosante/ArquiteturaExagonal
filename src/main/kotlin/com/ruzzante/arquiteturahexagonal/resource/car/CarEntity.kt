package com.ruzzante.arquiteturahexagonal.resource.car

import com.ruzzante.arquiteturahexagonal.domain.car.Car
import javax.persistence.*

@Entity
@Table(name="car")
data class CarEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column(nullable =false)
    val placa: String,
    @Column(nullable =false)
    val tipo: String,
    @Column(nullable =false)
    val marca: String,
    @Column(nullable =false)
    val modelo: String,
    @Column(nullable =false)
    val ano: String,
    @Column(nullable =false)
    val cor: String,
    @Column(nullable =false)
    val kilometragem: Long,
    @Column(nullable =false)
    val combustivel: String,
    val descricao: String?,
    @Column(nullable =false)
    val vendido: Boolean,
    @Column(nullable =false)
    val valor: Double,
    @Column(nullable =false)
    val agencia: String,
){
    fun toCar() = Car(
        id = id,
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
    companion object{
        fun from(car: Car) = CarEntity(
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
