package org.example.btvnonkiemtra.domain.repository;

import org.example.btvnonkiemtra.domain.entity.Positions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Positions, Integer>  {
}
