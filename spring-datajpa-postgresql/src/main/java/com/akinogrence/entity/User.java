package com.akinogrence.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;



@Entity
@Table(name = "users")//I tried "user" but this keyword is a reserved in Postgres!
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class User {

    @Id
    @SequenceGenerator(name = "seq_user", allocationSize = 1)
    @GeneratedValue(generator = "seq_user", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, name = "name")
    private String name;

    @Column(length = 100, name = "surname")
    private String surname;

    @OneToMany
    @JoinColumn(name = "user_address_id")
    private List<Address> addresses;
}