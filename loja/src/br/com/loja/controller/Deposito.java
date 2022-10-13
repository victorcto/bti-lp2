package br.com.loja.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.loja.model.Produto;

public class Deposito {
	private List<Produto> produtos = new ArrayList<>();

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public int informarQtdProdutos() {
		return produtos.size();
	}
	
	public String ehVazio() {
		return produtos.isEmpty() ? "SIM" : "NÃO";
	}
	
	public Produto maiorPreco() {
		Produto produtoAux = new Produto();
		produtoAux.setPreco(0);
		
		for (Produto p : produtos) {
			if (p.getPreco() > produtoAux.getPreco()) {
				produtoAux = p;
			}
		}
		
		return produtoAux;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
}
