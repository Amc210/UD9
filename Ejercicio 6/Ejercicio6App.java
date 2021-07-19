import java.util.Random;
import java.util.Scanner;

public class Ejercicio6App {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Atributos
		int filas = 8, columnas = 9;
		boolean espectador;
		double precio = 5.50;
		// Llamamos a pelicula y cine
		Pelicula pelicula = new Pelicula("La vida de pi", 120, 16, "Ang Lee");// nombre duracion edad minima director
		Cine cine = new Cine(pelicula, precio);

		// Sala de la pelicula
		char[][] salaPeli = new char[filas][columnas];
		int asientosTotal = filas * columnas;

		// preguntamos edad y dinero
		System.out.println("Nombre? ");
		String nombre = teclado.next();// preguntamos nombre
		System.out.println("Edad? ");
		int edad = teclado.nextInt();// preguntamos edad
		System.out.println("Cuanto dinero llevas? ");
		int dineroCliente = teclado.nextInt();// preguntamos el dinero que lleva

		informacionCine.llenarSala(salaPeli);// llamamos a llenar sala con la informacion

		do {
			espectador = false; // asignamos valor
			Espectador espec = new Espectador(nombre, edad, dineroCliente);// creamos un espectador
			int f, c;

			if (espec.tieneDinero(cine) && (espec.tieneEdad(pelicula))) { // Si tiene dinero suficiente y edad correcta entra
				boolean noSitio = false;// iniciamos a false

				while (noSitio) {// Si hay sitio entra
					f = informacionCine.asientoAleatorio(filas); // Fila aleatoria
					c = informacionCine.asientoAleatorio(columnas); // Columna aleatoria
					
					if (salaPeli[f][c] == '-') { // Comparamos lo que hay en esa posicion de la matriz con el caracter -
						salaPeli[f][c] = 'O'; // asignamos a la posicion una O marcando que esta ocupado
						System.out.println("Compra realizada"); // Mostramos mensaje
						noSitio = true; // salimos del bucle poniendo la variable a true
						asientosTotal--; // Restamos el asiento al total de asientos
						System.out.println("hola");
					}
				}
			} else {
				// SI la informacion no es valida para entrar mostramos su informacion
				System.out.println("No puedes entrar: Tienes " + espec.getEdad() + " y la edad minima es "
						+ pelicula.getEdadMinima() + ", y tienes " + espec.getDinero()
						+ "€ y el precio de la entrada es " + cine.getPrecioEntrada() + "€");
			}

			// Preguntamos si quiere generar mas usuarios
			System.out.println("Hay mas espectadores? (true / false)");
			boolean pregEspectadores = teclado.nextBoolean();

			if (pregEspectadores == true) {// En caso de que si haya mas espectadores volvemos a preguntar
				espectador = true;
				System.out.println("Nombre? ");
				nombre = teclado.next();// preguntamos nombre
				System.out.println("Edad? ");
				edad = teclado.nextInt();// preguntamos edad
				System.out.println("Cuanto dinero llevas? ");
				dineroCliente = teclado.nextInt();// preguntamos el dinero que lleva

				informacionCine.llenarSala(salaPeli);// llenamos la sala de nuevo
			}

		} while (espectador && asientosTotal != 0); // si hay 0 asientos o no hay mas espectadores salimos

		// Mostramos el cine
		informacionCine.mostrarCine(salaPeli);
	}

}
