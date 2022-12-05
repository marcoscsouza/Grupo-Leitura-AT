package br.com.marcoscsouza.leituraemgrupo.model.tests;

import br.com.marcoscsouza.leituraemgrupo.model.domain.Grupo;
import br.com.marcoscsouza.leituraemgrupo.model.domain.Leitura;

public class LeituraTest {

	public static void main(String[] args) {
		System.out.println("test");

		Grupo gp1 = new Grupo(5, "Joaquim", true);


		Leitura lt1 = new Leitura();

		lt1.setDetalhes("leitura em grupo de terror");
		lt1.setId(246);
		lt1.setEhPresencial(true);
		lt1.setGrupo(gp1);
		lt1.setLiteraturas(null);
		
		System.out.println(lt1);

	}

}
