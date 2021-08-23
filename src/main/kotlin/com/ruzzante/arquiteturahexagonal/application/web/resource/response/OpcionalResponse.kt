package com.ruzzante.arquiteturahexagonal.application.web.resource.response

data class OpcionalResponse(
    val direcaoHidraulica: Boolean,
    val cambioAutomatico: Boolean,
    val vidroEletrico: Boolean,
    val travaEletrica: Boolean,
    val som: Boolean,
    val alarme: Boolean,
    val cameraDeRe: Boolean
)
