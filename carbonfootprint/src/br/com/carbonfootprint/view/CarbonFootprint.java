package br.com.carbonfootprint.view;

import br.com.carbonfootprint.controller.Repositorio;
import br.com.carbonfootprint.model.Carro;
import br.com.carbonfootprint.model.Moto;
import br.com.carbonfootprint.model.Taxi;
import br.com.carbonfootprint.model.Veiculo;

public class CarbonFootprint {
	public static void main(String[] args) {
		Veiculo carro1 = new Carro(5000, 1.2);
		Veiculo carro2 = new Carro(3000, 2.0);
		Veiculo moto1 = new Moto(1500, 160);
		Veiculo moto2 = new Moto(1000, 250);
		Veiculo taxi1 = new Taxi(10000, 3);
		Veiculo taxi2 = new Taxi(20000, 4);
		
		Repositorio repositorio = new Repositorio();
		repositorio.adicionarVeiculo(carro1);
		repositorio.adicionarVeiculo(carro2);
		repositorio.adicionarVeiculo(moto1);
		repositorio.adicionarVeiculo(moto2);
		repositorio.adicionarVeiculo(taxi1);
		repositorio.adicionarVeiculo(taxi2);
		
		for (Veiculo veiculo : repositorio.getVeiculos()) {			
			System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println(veiculo);
			System.out.println("quantidade de carbono emitido: " + veiculo.getCarbonFootprint());
		}
		
	}
}
