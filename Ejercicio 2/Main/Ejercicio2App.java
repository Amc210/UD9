package Main;

import Serie.Serie;
import Videojuego.Videojuego;

public class Ejercicio2App {

	public static void main(String[] args) {
		int numeroHoras = 0, instancia = 0, numHorasInicial = 0, suma = 0; // Videojuego
		int numeroTemporadas = 0, instancias = 0, numTemporadasInicial = 0;// serie

		// Iniciamos las posiciones
		// Lista de series
		Serie[] listaS = new Serie[5];
		listaS[0] = new Serie("Elite", 4, false, "Suspense", "Francisco Ramos");
		listaS[1] = new Serie("Doraemon", 4, false, "Manga", "Fujiko F. Fujio");
		listaS[2] = new Serie("Como defender a un asesino", 6, false, "Crimen", "Shonda Rhimes");
		listaS[3] = new Serie("Game of thrones", 8, false, "Drama", "George R. R. Martin");
		listaS[4] = new Serie("Las chicas gilmore", 7, false, "Comedia", "Amy Sherman-Palladino");

		// Lista de videojuegos
		Videojuego[] listaV = new Videojuego[5];
		listaV[0] = new Videojuego("Assassins Creed", 30, false, "	Acción-aventura", "Ubisoft");
		listaV[1] = new Videojuego("Los sims", 100, false, "Simulación", "EA");
		listaV[2] = new Videojuego("Fallout Shelter", 40, false, "Simulación", " Bethesda Game Studios");
		listaV[3] = new Videojuego("GTA V", 40, false, "	Acción-aventura", "Rockstar Games");
		listaV[4] = new Videojuego("Monopoly", 6, false, "Juego de mesa", "Hasbro");

		// Entregamos 1 serie i 1 videojuego
		listaS[3].entregar();
		listaV[4].entregar();

		// juego con mayor numero horas de juego
		for (int i = 0; i < listaV.length; i++) {
			numeroHoras = listaV[i].compararHoras(numeroHoras);
			if (numeroHoras > numHorasInicial) {
				instancia = i;
			}
			numHorasInicial = listaV[i].compararHoras(numeroHoras);
		}
		System.out.println(listaV[instancia].toString());

		// serie con mayor numero temporadas
		for (int i = 0; i < listaS.length; i++) {
			numeroTemporadas = listaS[i].compararTemporadas(numeroTemporadas);
			if (numeroTemporadas > numTemporadasInicial) {
				instancias = i;
			}
			numTemporadasInicial = listaS[i].compararTemporadas(numeroTemporadas);
		}
		System.out.println(listaS[instancias].toString());

		// Contar numero entregados
		for (int i = 0; i < listaV.length; i++) {
			if (listaV[i].isEntregado() == true) {
				System.out.println("Juego entregado: " + listaV[i].toString());
				suma++;
			}
			if (listaS[i].isEntregado() == true) {
				suma++;
			}
		}
		// mostramos el total de entregados
		System.out.println("Número de series y pelis entregados es " + suma);

		// Comparaciones llamando a compareTo
		listaS[1].compareTo(listaS[2]);
		listaV[2].compareTo(listaV[3]);
	}
}