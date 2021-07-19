package Raices;

public class Raices {
	// Atributos
	private int a;
	private int b;
	private int c;

	// Constructor
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// 2 opciones de raiz cuadrada
	public void obtenerRaices() {
		double raiz1, raiz2;

		// Hacemos los calculos y asignamos
		raiz1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
		raiz2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);

		// Mostramos
		System.out.println("Resultado 1: " + raiz1 + " Resultado 2: " + raiz2);
	}

	// Buscamos la raiz unica si la tiene
	private void obtenerRaiz() {
		double raizUnica = (-b) / (2 * a);

		System.out.println("Resultado único: " + raizUnica);
	}

	// Devuelve el valor del disciminante (parte de dento de la raiz)
	private double getDiscriminante() {
		return (Math.pow(b, 2) - (4 * a * c));
	}

	// discriminante > 0 tiene mas de una solución
	private boolean tieneRaices() {
		return (getDiscriminante() > 0);
	}

	// resultado = 0 solo hay un resultado
	private boolean tieneRaiz() {
		return (getDiscriminante() == 0);
	}

	// Metodo para calcular
	public void calcular() {
		if (tieneRaices()) {// 2 soluciones
			obtenerRaices();
		} else if (tieneRaiz()) {// 1 solucion
			obtenerRaiz();
		} else {//En caso que no haya solucion mostrara el mensaje
			System.out.println("La ecuacion no tiene solucion");
		}
	}
}
