package org.example.btvnonkiemtra.domain.repository;


import org.example.btvnonkiemtra.domain.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
