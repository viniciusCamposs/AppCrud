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
@Table(name="telephone")
@Getter
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idTelephone")
    private int idTelephone;

    @Setter
    @Column(name="ddd")
    private String ddd;

    @Setter
    @Column(name="telNumber")
    private String telNumber; 

    @Setter
    @Column(name="type")
    private ClientEnum type;

    @ManyToOne
    @JoinColumn(name="client_id")
    @JsonBackReference
    private Client client;
    
}
