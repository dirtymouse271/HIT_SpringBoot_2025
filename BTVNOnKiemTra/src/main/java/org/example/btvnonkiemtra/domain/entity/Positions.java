package org.example.btvnonkiemtra.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "positions")
public class Positions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false, insertable = false)
    private int id;

    @Column(name = "title", nullable = false, length = 100, unique = true)
    private String title;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private List<Employees> list = new ArrayList<>();
}
