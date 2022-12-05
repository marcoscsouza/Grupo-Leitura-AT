package br.com.marcoscsouza.leituraemgrupo.model.tests;

import br.com.marcoscsouza.leituraemgrupo.model.domain.Grupo;

public class GrupoTest {
	public static void main(String[] args) {
		System.out.println("test");
		
		Grupo gp1 = new Grupo(5, "Joaquim", true);
		
		System.out.println(gp1.toString());

	}

}
