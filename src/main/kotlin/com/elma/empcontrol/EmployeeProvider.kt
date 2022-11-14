package com.elma.empcontrol

import com.elma.empcontrol.model.Employee

interface EmployeeProvider {
    fun getEmployeeList() : List<Employee>
    fun getEmployee() : Employee
    fun modifyEmployee(employee: Employee) : Employee
    fun addEmployee(employee: Employee) : Employee
    fun deleteEmployee(codEmployee: Long) : Boolean
}