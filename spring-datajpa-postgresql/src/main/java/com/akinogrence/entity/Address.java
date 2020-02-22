package com.akinogrence.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "user_address")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Address implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_user_address", allocationSize = 1)
    @GeneratedValue(generator = "seq_user_address", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 500, name = "address")
    private String address;

    @Enumerated
    private AddressType addressType;

    @Column(name = "isActive")
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "user_address_id")
        private User user;


}
