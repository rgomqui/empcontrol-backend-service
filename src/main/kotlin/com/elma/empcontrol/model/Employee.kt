package com.elma.empcontrol.model

data class Employee (
    var cod: Long,
    var nombre: String,
    var apellido1: String,
    var apellido2: String,
    var telefono: String,
    var dni: String,
    var uniform: ArrayList<Uniform>,
    var holidays: ArrayList<Holidays>,
    var observations: String
)