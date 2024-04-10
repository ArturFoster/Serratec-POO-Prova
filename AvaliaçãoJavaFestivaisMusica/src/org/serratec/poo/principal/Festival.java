package org.serratec.poo.principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.classes.Artista;
import org.serratec.poo.classes.Banda;
import org.serratec.poo.classes.Cantor;
import org.serratec.poo.classes.Dj;
import org.serratec.poo.classes.Evento;
import org.serratec.poo.classes.Genero;
import org.serratec.poo.classes.Palco;

public class Festival {
	public static void main(String[] args) {
		
		Banda banda1 = new Banda("Imagine Dragons",Genero.INDIE, 200.00);
		Cantor cantor1 = new Cantor("Sabrina Carpenter",Genero.POP,180.00);
		Dj dj1 = new Dj("Alok", Genero.ELETRONICA, 180.00);
		
		//-------------------------------------------------------------
		
		Palco palco1 = new Palco("Palco Principal",50000);
		Palco palco2 = new Palco("Palco POP",40000);
		Palco palco3 = new Palco("Palco Eletronico", 35000);
		
		//-------------------------------------------------------------
		
		LocalDate dataShow = LocalDate.parse("2024-04-12");
		palco1.adicionarEvento(new Evento(dataShow,"20:00",cantor1));
		
		dataShow = LocalDate.parse("2024-04-14");
		palco2.adicionarEvento(new Evento(dataShow,"19:00",banda1));
		
		dataShow = LocalDate.parse("2024-04-16");
		palco3.adicionarEvento(new Evento(dataShow,"18:00",dj1));
		
		//-------------------------------------------------------------
		
		System.out.println(palco1);
		System.out.println(palco2);
		System.out.println(palco3);
		
		//palco1.exibirLista();
		
		
		
		
		
		
		/*List<Artista> lineUp  = new ArrayList<>();
		List<Palco> programaPalco = new ArrayList<>();
		
		lineUp.add(new Banda("Imagine Dragons",Genero.INDIE, 200.00));
		lineUp.add(new Cantor("Sabrina Carpenter",Genero.POP,180.00));
		lineUp.add(new Dj("Alok", Genero.ELETRONICA, 180.00));
		
		LocalDate dataShow = LocalDate.parse("2024-04-12");
		programaPalco.add(new Palco("Palco Principal",50000,dataShow,"20:00", lineUp.get(0)));
		dataShow = LocalDate.parse("2024-04-15");
		programaPalco.add(new Palco("Palco Pop",40000,dataShow,"19:00",lineUp.get(1)));
		dataShow = LocalDate.parse("2024-04-16");
		programaPalco.add(new Palco("Palco Eletronico",35000,dataShow,"18:00",lineUp.get(2)));
		
		*/
	}
}
