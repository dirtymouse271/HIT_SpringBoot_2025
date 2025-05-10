package org.example.btvnonkiemtra.domain.service;

import org.example.btvnonkiemtra.domain.dto.reponse.ResponseDepartmentDTO;

import java.util.List;

public interface DepartmentService {
    ResponseDepartmentDTO createDepartment(ResponseDepartmentDTO responseDepartmentDTO);
    ResponseDepartmentDTO updateDepartment(ResponseDepartmentDTO responseDepartmentDTO);
    List<ResponseDepartmentDTO> getAllDepartments();
    ResponseDepartmentDTO getDepartmentById(int id);
    void deleteDepartmentById(int id);
}
