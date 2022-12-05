package br.com.marcoscsouza.leituraemgrupo.model.domain;

import java.util.List;

public class Leitura {
	
	private int id;
	private String detalhes;
	private boolean ehPresencial;
	
	private Grupo grupo;
	private List<Literatura> literaturas;
	
	public Leitura() {
		
	}
	
	
	public Leitura(int id, String detalhes, boolean ehPresencial, Grupo grupo, List<Literatura> literaturas) {
		this.id = id;
		this.detalhes = detalhes;
		this.ehPresencial = ehPresencial;
		this.grupo = grupo;
		this.literaturas = literaturas;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public boolean isEhPresencial() {
		return ehPresencial;
	}
	public void setEhPresencial(boolean ehPresencial) {
		this.ehPresencial = ehPresencial;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public List<Literatura> getLiteraturas() {
		return literaturas;
	}
	public void setLiteraturas(List<Literatura> literaturas) {
		this.literaturas = literaturas;
	}


	@Override
	public String toString() {
		return String.format("%d ; %s ; %b ; %s ", id, detalhes, ehPresencial, grupo);
	}
	
	
	

}
