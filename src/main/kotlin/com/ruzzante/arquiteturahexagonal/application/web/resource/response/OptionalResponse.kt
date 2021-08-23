package com.ruzzante.arquiteturahexagonal.application.web.resource.response

import com.ruzzante.arquiteturahexagonal.domain.car.Car
import com.ruzzante.arquiteturahexagonal.domain.optional.Optional

data class OptionalResponse(
    val direcaoHidraulica: Boolean,
    val cambioAutomatico: Boolean,
    val vidroEletrico: Boolean,
    val travaEletrica: Boolean,
    val som: Boolean,
    val alarme: Boolean,
    val cameraDeRe: Boolean
){
    companion object{
        fun from(optional: Optional) = OptionalResponse(
            direcaoHidraulica = optional.direcaoHidraulica,
            cambioAutomatico = optional.cambioAutomatico,
            vidroEletrico = optional.vidroEletrico,
            travaEletrica = optional.travaEletrica,
            som = optional.som,
            alarme = optional.alarme,
            cameraDeRe = optional.cameraDeRe
        )
    }
}
