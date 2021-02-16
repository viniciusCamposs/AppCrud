package com.crud.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="adress")
@Getter
public class Adress {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAdress")
    private int idAdress;

    @Setter
    @Column(name="cep")
    private String cep;

    @Setter
    @Column(name="number")
    private int number;

    @Setter
    @Column(name="complement")
    private String complement;

    @Setter
    @Column(name="street")
    private String street;

    @Setter
    @Column(name="neighborhood")
    private String neighborhood;

    @Setter
    @Column(name="city")
    private String city;

    @Setter
    @Column(name="state")
    private String state;


    @ManyToOne()
    @JoinColumn(name="client_id")
    @JsonBackReference
    private Client client;

}
