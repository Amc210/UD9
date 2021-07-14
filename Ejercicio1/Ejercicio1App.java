import Electrodomestico.Electrodomestico;
import Lavadora.Lavadora;
import Television.Television;

public class Ejercicio1App {

	public static void main(String[] args) {
		int totalL = 0, totalT = 0, total = 0;
		
		//declaramos el array
		Electrodomestico [] lista = new Electrodomestico [10];
		
		//Declaramos las posiciones y cada objecto
		lista [0] = new Lavadora (150,"negro",'a', 100, 50);
		lista [1] = new Lavadora (100,"blanco",'f', 50, 30);
		lista [2] = new Television (300,"azul",'a', 10, 50, false);
		lista [3] = new Television (150,"rojo",'b', 100, 20, true);
		lista [4] = new Lavadora (250,"azul",'c', 150, 25);
		lista [5] = new Lavadora (120,"gris",'e', 100, 25);
		lista [6] = new Television (300,"negro",'a', 100, 50, false);
		lista [7] = new Television (100,"azul",'b', 120, 30, true);
		lista [8] = new Lavadora (200,"blanco",'f', 250, 30);
		lista [9] = new Lavadora (180,"azul",'e', 50, 15);
		
		//Recorremos el array y miramos si el objecto es una lavaora o una television
		for (int i = 0; i < lista.length; i++) {
			int precio = lista[i].precioFinal();
			
			if (lista[i] instanceof Lavadora) {
				totalL += precio;
			}
			if (lista[i] instanceof Television) {
				totalT += precio;
			}
			total += precio;
		}
		//mostramos los totales de la suma
		System.out.println("Total lavadoras: "+ totalL);
		System.out.println("Total televisiones: "+ totalT);
		System.out.println("Total de todas las sumas: "+ total);
		
		
		//pruevas de los objetos por separado
//		Lavadora lavadora1 = new Lavadora(150,"negro",'a', 100, 50);
//		Lavadora lavadora2 = new Lavadora(); //Valores por defecto
//		Television television1 = new Television();
//			
//		System.out.println(lavadora1.toString());
//		System.out.println(lavadora2.toString());
//		System.out.println("Precio final: " + lavadora1.precioFinal());
//		System.out.println("Precio final: " + lavadora2.precioFinal()); 
//		System.out.println(television1.toString());
//		System.out.println(television1.precioFinal());
	}

}
