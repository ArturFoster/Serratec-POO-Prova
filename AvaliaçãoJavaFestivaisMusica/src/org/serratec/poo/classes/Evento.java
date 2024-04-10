package org.serratec.poo.classes;

import java.time.LocalDate;

public class Evento {
	private LocalDate data;
	private String horario;
	private Artista artista;
	
	public Evento(LocalDate data, String horario, Artista artista) {
	
		this.data = data;
		this.horario = horario;
		this.artista = artista;
	}

	public LocalDate getData() {
		return data;
	}

	public String getHorario() {
		return horario;
	}

	public Artista getArtista() {
		return artista;
	}

	@Override
	public String toString() {
		return 	"\nData: " + data + 
				"\nHorario: " + horario + 
				artista;
	}
	
	
}
