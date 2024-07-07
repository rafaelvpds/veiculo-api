package com.api.veicular.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.veicular.model.Veiculo;
import com.api.veicular.repository.VeiculosRepository;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    VeiculosRepository veiculosRepository;

    @GetMapping("/placas")
    public ResponseEntity<List<Veiculo>> findAll() {
        return ResponseEntity.ok(veiculosRepository.findAll());
    }

    @GetMapping("/placas/{placa}")
    public ResponseEntity<Veiculo> findByPlaca(@PathVariable String placa) {
        System.out.println(veiculosRepository.findByPlaca(placa));
        return ResponseEntity.ok(veiculosRepository.findByPlaca(placa));
    }

}
