package com.filippich.spring.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data //gettery, settery i metody klasy Object
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Contact
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String tel;
    private int age;
    private double height;
    private double weight;
    private double slary;

    @ManyToOne(cascade = {
            CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinColumn(name = "fk_job_category")
    private JobCategory jobCategory;
}
