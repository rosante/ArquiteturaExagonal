package com.ruzzante.arquiteturahexagonal.application.web.resource.request

import com.ruzzante.arquiteturahexagonal.domain.optional.Optional
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class OptionalRequest(
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val direcaoHidraulica: Boolean,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val cambioAutomatico: Boolean,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val vidroEletrico: Boolean,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val travaEletrica: Boolean,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val som: Boolean,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val alarme: Boolean,
    @field:NotNull
    @field:NotBlank
    @field:NotEmpty
    val cameraDeRe: Boolean
){
    fun toOptional() = Optional(
        direcaoHidraulica = direcaoHidraulica,
        cambioAutomatico = cambioAutomatico,
        vidroEletrico = vidroEletrico,
        travaEletrica = travaEletrica,
        som = som,
        alarme = alarme,
        cameraDeRe = cameraDeRe
    )

}
