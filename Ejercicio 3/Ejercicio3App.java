import Libro.Libro;

public class Ejercicio3App {

	public static void main(String[] args) {
		//Llamamos a libro
		Libro libro1 = new Libro (677863298, "Narnia", "Juan", 126);
		Libro libro2 = new Libro (956545685, "Harry Potter", "J.K Rowling", 400);
		
		//Imprimimos la información
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		//Comparamos el numero de las paginas
		if (libro1.getnPaginas() > libro2.getnPaginas()) {
			System.out.println("El libro: " + libro1.getTitulo()+ ", tiene mas paginas");
		}else {
			System.out.println("El libro: " + libro2.getTitulo()+ ", tiene mas paginas");
		}
	}

}
