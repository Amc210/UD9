import java.util.Random;

public class informacionCine {
	// Clases para cine

	// Muestra el cine con las letras (asientos ocupados O y asientos vacios -)
	public static void mostrarCine(char[][] salaPeli) {
		final int CAR = 65;//lo ha explicado adrian es el valor de A en ascii
		int caracter, maximo = salaPeli.length;

		for (int i = 0; i < salaPeli.length; i++, maximo--) {//va contando hacia atras del ultimo supero al primero y asigna el numero a la fila
			caracter = CAR;
			for (int j = 0; j < salaPeli[i].length; j++, caracter++) {
				System.out.print(maximo + "" + (char) caracter + "" + salaPeli[i][j] + " ");//Va asignando los caracteres a la posicion de la columna a para la primera y asi
			}
			System.out.println();
		}
	}

	// Para iniciar la matriz con una -
	public static void llenarSala(char[][] salaPeli) {
		int i, j;
		for (i = 0; i < salaPeli.length; i++) {
			for (j = 0; j < salaPeli[i].length; j++) {
				salaPeli[i][j] = '-';//Recorremos la matriz y la llenamos con el caracter -
			}
		}
	}

	public static int asientoAleatorio(int n) {
		Random rand = new Random();
		return ((int) (rand.nextDouble() * n)); //Creamos asientos aleatorios con Random
	}
}
