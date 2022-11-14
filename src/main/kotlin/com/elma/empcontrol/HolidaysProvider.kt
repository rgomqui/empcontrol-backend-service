package com.elma.empcontrol

import com.elma.empcontrol.model.Holidays

interface HolidaysProvider {
   // fun getHolidaysFilterList(filter: Map<String, String>) : List<Holidays>
    fun getHolidaysEmployee(codEmployee: Long) : List<Holidays>
    fun addHolidays(holidays: Holidays) : Holidays
    fun modifyHolidays(holidays: Holidays) : Holidays
    fun deleteHolidays(codHolidays: Long) : Boolean
}