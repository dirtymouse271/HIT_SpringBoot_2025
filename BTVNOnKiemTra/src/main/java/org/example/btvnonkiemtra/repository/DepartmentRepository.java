package org.example.btvnonkiemtra.domain.repository;

import org.example.btvnonkiemtra.domain.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Departments, Integer> {
}
