package com.elma.empcontrol.model

import java.util.*

data class Uniform (
    var codUniform: Long,
    var codEmployee: Long,
    var deliveryDate: Date,
    var tallaSup: String,
    var tallaInf: String,
    var tallaCalzado: Int,
    var tipoCalzado: String,
    var observations: String
)