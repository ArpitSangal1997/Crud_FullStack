package com.crud.demo.Controller;

import com.crud.demo.Dto.EmployeeDto;
import com.crud.demo.Entity.Employee;
import com.crud.demo.Repository.EmployeeRepository;
import com.crud.demo.Service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crud")
@AllArgsConstructor
@CrossOrigin("*")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto employee1 = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<EmployeeDto>(employee1, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {
        EmployeeDto employee1 = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee1);
    }


    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployee() {
        List<EmployeeDto> employee1 =  employeeService.getAllEmployee();
        return ResponseEntity.ok(employee1);
    }


    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto , @PathVariable Long id) {
        EmployeeDto employee1 = employeeService.updateEmployee(employeeDto, id);
        return ResponseEntity.ok(employee1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Employee Deleted Successfully");
    }

}
