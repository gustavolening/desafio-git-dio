package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		gato.setCor("azul");
		gato.setNome("azul?o");
		gato.setIdade(24);
		livros.setNome("O rei demonio");
		livros.setNumPaginas(350);
		int a = 3;
		int b = 5;

		System.out.println("A soma ?: " + (a + b));
		System.out.println(gato);
		System.out.println(livros);
	}

}

class Livros{
	private String nome;
	private Integer numPaginas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", numPaginas=" + numPaginas + "]";
	}
	
	
	
}
