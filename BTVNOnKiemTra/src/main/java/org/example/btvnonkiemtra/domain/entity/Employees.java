package org.example.btvnonkiemtra.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

    @Getter
    @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, updatable = false, insertable = false)
    private int id;

    @Column(name = "fullname", nullable = false, length = 100)
    private String fullName;

    @Column(name = "date_of_birth")
    private LocalDateTime dateOfBirth;

    @Column(name = "hire_date")
    private LocalDateTime hireDate;

    @Column(name = "salary",precision = 10, scale = 2)
    private BigDecimal salary;

    @ManyToOne
    @JoinColumn(name="user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments department;

    @ManyToOne
    @JoinColumn(name="positions_id")
    private Positions position;
}
