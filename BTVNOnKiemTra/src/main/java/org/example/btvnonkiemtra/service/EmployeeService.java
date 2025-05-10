package org.example.btvnonkiemtra.domain.service;

import org.example.btvnonkiemtra.domain.dto.reponse.ResponseEmployeeDTO;

import java.util.List;

public interface EmployeeService {
    ResponseEmployeeDTO createEmployee (ResponseEmployeeDTO employeeDTO);
    ResponseEmployeeDTO updateEmployee (ResponseEmployeeDTO employeeDTO);
    ResponseEmployeeDTO getEmployeeById (int id);
    List<ResponseEmployeeDTO> getAllEmployees ();
    void deleteEmployee (int id);
}
