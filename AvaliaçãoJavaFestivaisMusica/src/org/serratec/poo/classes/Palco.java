package org.serratec.poo.classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {
	private String nomePalco;
	private int capacidade;
	private List<Evento> evento = new ArrayList<>();
	
	public Palco(String nomePalco, int capacidade) {
		
		this.nomePalco = nomePalco;
		this.capacidade = capacidade;
	}

	public String getNomePalco() {
		return nomePalco;
	}

	public int getCapacidade() {
		return capacidade;
	}
	
	public void setEvento(List<Evento> evento) {
		this.evento = evento;
	}

	public List<Evento> getEvento() {
		return evento;
	}
	
	public void exibirEvento() {
		for (Evento evento2 : evento) {
			System.out.println(evento2);
		}
	}
	
	public void adicionarEvento(Evento novoEvento){
		this.evento.add(novoEvento);
	}
	@Override
	public String toString() {
		return "\n-----Palco-----"+ 
				"\nNome do Palco: " + nomePalco + 
				"\nCapacidade: " + capacidade + 
				evento;
	}
}
