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
        Veiculo newVeiculo = new Veiculo();
        newVeiculo.setBrand(veiculo.getBrand());
        newVeiculo.setChassisNumber(veiculo.getChassisNumber());
        newVeiculo.setModel(veiculo.getModel());
        newVeiculo.setPlaca(veiculo.getPlaca());
        newVeiculo.setProprietaryDocument(veiculo.getProprietaryDocument());
        newVeiculo.setProprietaryName(veiculo.getProprietaryName());
        newVeiculo.setYearManifactory(veiculo.getYearManifactory());
        newVeiculo.setYearModel(veiculo.getYearModel());
        newVeiculo.setRenavam(veiculo.getRenavam());
        repository.save(newVeiculo);

        return newVeiculo;
    }
}
