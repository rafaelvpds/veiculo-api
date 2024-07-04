package com.api.veicular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.veicular.model.Veiculo;
import com.api.veicular.repository.VeiculosRepository;

@SpringBootApplication
public class VeicularApplication implements ApplicationRunner {
	@Autowired
	VeiculosRepository veiculoRepository;

	public static void main(String[] args) {
		SpringApplication.run(VeicularApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		for (int i = 1; i <= 10; i++) {
			Veiculo veiculo = new Veiculo();
			veiculo.setPlaca("ABC" + i); // Exemplo de geração de placa dinâmica
			veiculo.setChassisNumber("1HGCM82633A00000" + i); // Exemplo de geração de número de chassi dinâmico
			veiculo.setRenavam(String.format("%09d", i)); // Exemplo de geração de RENAVAM com 9 dígitos
			veiculo.setYearManifactory("2020"); // Ano de fabricação fixo como exemplo
			veiculo.setYearModel("2021"); // Ano do modelo fixo como exemplo
			veiculo.setBrand("Marca " + i); // Exemplo de geração de marca dinâmica
			veiculo.setModel("Modelo " + i); // Exemplo de geração de modelo dinâmico
			veiculo.setProprietaryDocument(generateRandomCpf()); // Exemplo de geração de CPF aleatório
			veiculo.setProprietaryName("Proprietário " + i); // Exemplo de geração de nome de proprietário dinâmico

			veiculoRepository.save(veiculo);
		}
		throw new UnsupportedOperationException("Unimplemented method 'run'");
	}

	private String generateRandomCpf() {
		return String.format("%03d.%03d.%03d-%02d",
				(int) (Math.random() * 1000),
				(int) (Math.random() * 1000),
				(int) (Math.random() * 1000),
				(int) (Math.random() * 100));
	}

}
