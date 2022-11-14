package com.elma.empcontrol.model

import java.util.*

data class Holidays(
    var codHolidays: Long,
    var codEmployee: Long,
    var typeHolidays: String,
    var totalDays: Int,
    var initialDate: Date,
    var finishDate: Date,
    var observations: String
)
