package com.elma.empcontrol

import com.elma.empcontrol.model.Employee
import com.elma.empcontrol.model.Uniform

interface UniformProvider {
    //fun getUniformFilterList()
    fun getUniformsFromEmployee(codEmployee: Employee): List<Uniform>
    fun addUniform(uniform: Uniform, codEmployee: Long): Uniform
    fun modifyUniform(uniform: Uniform): Uniform
    fun deleteUniform(codUniform: Long): Boolean
}