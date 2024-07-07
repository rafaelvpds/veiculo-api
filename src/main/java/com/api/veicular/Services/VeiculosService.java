package com.api.veicular.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.veicular.model.Veiculo;
import com.api.veicular.repository.VeiculosRepository;

@Service
public class VeiculosService {
    @Autowired
    VeiculosRepository repository;

    public Veiculo create(Veiculo veiculo) {

        return repository.save(veiculo);
    }
}
