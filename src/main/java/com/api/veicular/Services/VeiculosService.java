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
        Veiculo newVeiculos = new Veiculo();
        newVeiculos.setBrand(veiculo.getBrand());
        newVeiculos.setChassisNumber(veiculo.getChassisNumber());
        newVeiculos.setModel(veiculo.getModel());
        newVeiculos.setPlaca(veiculo.getPlaca());
        newVeiculos.setProprietaryDocument(veiculo.getProprietaryDocument());
        newVeiculos.setProprietaryName(veiculo.getProprietaryName());
        newVeiculos.setYearManifactory(veiculo.getYearManifactory());
        newVeiculos.setYearModel(veiculo.getYearModel());
        newVeiculos.setRenavam(veiculo.getRenavam());
        repository.save(newVeiculos);

        return newVeiculos;
    }
}
