package com.example.demo.model;

import com.example.demo.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private Date birthday;
    @NotNull
    private Gender gender;
    @NotNull
    private String email;
    @NotNull
    private String phone;
    @NotNull
    @ManyToOne
    @JoinColumn(name ="classs",referencedColumnName = "id")
    private Class classs;
}
