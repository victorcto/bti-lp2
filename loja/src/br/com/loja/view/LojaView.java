package br.com.loja.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import br.com.loja.controller.Deposito;
import br.com.loja.model.Produto;
import br.com.loja.model.ProdutoDuravel;
import br.com.loja.model.ProdutoNaoDuravel;

public class LojaView {

	public static void main(String[] args) throws ParseException, InterruptedException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

		ProdutoDuravel produto1 = new ProdutoDuravel("Notebook Acer Aspire 5", 3500.0, "Acer",
				"AMD RYZEN 7500U, 8GB RAM, 240GB SSD", sdf.parse("21-11-2020"), 5);
		ProdutoDuravel produto2 = new ProdutoDuravel("Iphone 12 pro max", 8500.0, "Apple",
				"O Apple iPhone 12 Pro Max é um dos smartphones iOS mais avançados e completos que existem em circulação.",
				sdf.parse("11-08-2020"), 5);
		ProdutoDuravel produto3 = new ProdutoDuravel("Geladeira Electrolux", 3500.0, "Electrolux",
				"A mais gelada do Brasil", sdf.parse("02-05-2019"), 10);

		ProdutoNaoDuravel produto4 = new ProdutoNaoDuravel("Chocolate Cacau Show", 50.0, "Cacau Show", "50% cacau",
				sdf.parse("21-10-2021"), sdf.parse("11-08-2023"), "Comida");
		ProdutoNaoDuravel produto5 = new ProdutoNaoDuravel("Shampoo Clear", 20.0, "Clear", "0 caspas",
				sdf.parse("2-7-2022"), sdf.parse("11-08-2023"), "Higiene pessoal");
		ProdutoNaoDuravel produto6 = new ProdutoNaoDuravel("Salgadinho cheetos", 5.50, "Cheetos",
				"Melhor salgadinho do Brasil", sdf.parse("21-12-2022"), sdf.parse("21-12-2023"), "Comida");
		
		Deposito deposito = new Deposito();
		
		deposito.adicionarProduto(produto1);
		deposito.adicionarProduto(produto2);
		deposito.adicionarProduto(produto3);
		deposito.adicionarProduto(produto4);
		deposito.adicionarProduto(produto5);
		deposito.adicionarProduto(produto6);
		
		System.out.println("Lista de produtos: ");
		for (Produto produto : deposito.getProdutos()) {
			System.out.println(produto);
		}
		
		System.out.println("\nRemovendo um produto...");
		Thread.sleep(250);
		deposito.removerProduto(produto6);
		System.out.println("Produto removido!");
		
		System.out.println("\nQuantidade de produto no depósito: " + deposito.informarQtdProdutos());
		System.out.println("\nO depósito está vazio? " + deposito.ehVazio());
		System.out.println("\nQual o produto com o maior preço?");
		System.out.println(deposito.maiorPreco());
	}
}
