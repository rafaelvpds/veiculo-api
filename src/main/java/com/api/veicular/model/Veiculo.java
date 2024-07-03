package com.api.veicular.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "veiculos")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String placa;

    @Column(name = "chassis")
    private String chassisNumber;

    private String renavam;

    private String yearManifactory;

    private String yearModel;

    private String brand;

    private String model;

    private String proprietaryDocument;

    private String proprietaryName;

}
