package com.crud.demo.Service;


import com.crud.demo.Dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long id);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto updateEmployee(EmployeeDto employeeDto, Long id);

    void deleteEmployee(Long id);
}
