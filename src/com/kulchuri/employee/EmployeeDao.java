package com.kulchuri.employee;

import java.util.ArrayList;

public interface EmployeeDao {
	boolean addEmployee(EmployeeDto dto);

	boolean updateEmployee(EmployeeDto dto);

	boolean deleteEmployee(int eno);

	EmployeeDao getEmployeeDto(int eno);

	ArrayList<EmployeeDto> getAllEMployeeS();
}
