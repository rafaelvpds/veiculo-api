package com.api.veicular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.veicular.Services.VeiculosService;
import com.api.veicular.model.Veiculo;

@SpringBootApplication
public class VeicularApplication implements CommandLineRunner {

	@Autowired
	private VeiculosService service;

	public static void main(String[] args) {
		SpringApplication.run(VeicularApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Veiculo veiculo1 = new Veiculo();
		veiculo1.setId(1L);
		veiculo1.setBrand("Toyota");
		veiculo1.setChassisNumber("1HGBH41JXMN109186");
		veiculo1.setModel("Corolla");
		veiculo1.setPlaca("ABC1234");
		veiculo1.setProprietaryDocument("090.614.410-80");
		veiculo1.setProprietaryName("Auto João Silva Prime");
		veiculo1.setYearManifactory("2020");
		veiculo1.setYearModel("2021");
		veiculo1.setRenavam("12345678900");

		Veiculo veiculo2 = new Veiculo();
		veiculo2.setId(2L);
		veiculo2.setBrand("Honda");
		veiculo2.setChassisNumber("2HGCM82633A123456");
		veiculo2.setModel("Civic");
		veiculo2.setPlaca("DEF5678");
		veiculo2.setProprietaryDocument("940.247.080-82");
		veiculo2.setProprietaryName("Maria Souza");
		veiculo2.setYearManifactory("2019");
		veiculo2.setYearModel("2020");
		veiculo2.setRenavam("23456789012");

		Veiculo veiculo3 = new Veiculo();
		veiculo3.setId(3L);
		veiculo3.setBrand("Ford");
		veiculo3.setChassisNumber("3HGCM82633A654321");
		veiculo3.setModel("Focus");
		veiculo3.setPlaca("GHI9012");
		veiculo3.setProprietaryDocument("098.959.180-89");
		veiculo3.setProprietaryName("Carlos Pereira");
		veiculo3.setYearManifactory("2018");
		veiculo3.setYearModel("2019");
		veiculo3.setRenavam("34567890123");

		Veiculo veiculo4 = new Veiculo();
		veiculo4.setId(4L);
		veiculo4.setBrand("Chevrolet");
		veiculo4.setChassisNumber("4T1BG22K9WU123456");
		veiculo4.setModel("Cruze");
		veiculo4.setPlaca("JKL3456");
		veiculo4.setProprietaryDocument("465.319.580-30");
		veiculo4.setProprietaryName("Ana Costa");
		veiculo4.setYearManifactory("2017");
		veiculo4.setYearModel("2018");
		veiculo4.setRenavam("45678901234");

		Veiculo veiculo5 = new Veiculo();
		veiculo5.setId(5L);
		veiculo5.setBrand("Hyundai");
		veiculo5.setChassisNumber("5NPEB4AC8BH123456");
		veiculo5.setModel("Elantra");
		veiculo5.setPlaca("MNO7890");
		veiculo5.setProprietaryDocument("552.148.950-97");
		veiculo5.setProprietaryName("Paulo Mendes");
		veiculo5.setYearManifactory("2021");
		veiculo5.setYearModel("2022");
		veiculo5.setRenavam("56789012345");

		Veiculo veiculo6 = new Veiculo();
		veiculo6.setId(6L);
		veiculo6.setBrand("Nissan");
		veiculo6.setChassisNumber("6NPEB4AC8BH789012");
		veiculo6.setModel("Sentra");
		veiculo6.setPlaca("PQR1234");
		veiculo6.setProprietaryDocument("578.531.540-89");
		veiculo6.setProprietaryName("Ricardo Lima");
		veiculo6.setYearManifactory("2022");
		veiculo6.setYearModel("2023");
		veiculo6.setRenavam("67890123456");

		Veiculo veiculo7 = new Veiculo();
		veiculo7.setId(7L);
		veiculo7.setBrand("Volkswagen");
		veiculo7.setChassisNumber("7HGBH41JXMN987654");
		veiculo7.setModel("Jetta");
		veiculo7.setPlaca("STU5678");
		veiculo7.setProprietaryDocument("126.264.990-05");
		veiculo7.setProprietaryName("Fernanda Oliveira");
		veiculo7.setYearManifactory("2016");
		veiculo7.setYearModel("2017");
		veiculo7.setRenavam("78901234567");

		service.create(veiculo1);
		service.create(veiculo2);
		service.create(veiculo3);
		service.create(veiculo4);
		service.create(veiculo5);
		service.create(veiculo6);
		service.create(veiculo7);

	}
}