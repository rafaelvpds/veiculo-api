package com.api.veicular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.veicular.model.Veiculo;

public interface VeiculosRepository extends JpaRepository<Veiculo, Long> {

    Veiculo findByPlaca(String placa);

    Veiculo findByChassisNumber(String chassisNumber);
}
