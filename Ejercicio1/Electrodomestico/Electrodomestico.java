package Electrodomestico;

public class Electrodomestico {

		//atributos
		protected int precioBase;
		protected String color;
		protected char consumo; //Cambio del ejercicio anterior
		protected double peso;
		
		//CONTANTES
		final String COLOR = "blanco";
		final char CONSUMO = 'f';
		final double PESO = 5;
		final int PRECIO = 100;
		
		//Constructor con atributos
		public Electrodomestico(int precioBase, String color, char consumo, double peso) {
			this.precioBase = precioBase;
			this.color = comprovarColor (color);
			this.consumo = comprovarConsumoEnergetico (consumo);
			this.peso = peso;
		}
		
		//Constructores con precio y peso el resto por defecto
		public Electrodomestico(int precioBase, double peso) {
			this.precioBase = precioBase;
			this.color = COLOR;
			this.consumo = CONSUMO;
			this.peso = peso;
		}
		
		//constructor valores por defecto
		public Electrodomestico() {
			this.precioBase = PRECIO;
			this.color = COLOR;
			this.consumo = CONSUMO;
			this.peso = PESO;
		}
		
		//toString
		@Override
		public String toString() {
			return "precioBase = " + precioBase + ", color = " + color + ", consumo = " + consumo + ", peso = "
					+ peso;
		}

		//Comprovamos las opciones de color
		private String comprovarColor (String color) {
			color = color.toLowerCase();
			String colorSeguro;
			switch (color) {
			case "blanco":
				colorSeguro = "blanco";
				break;
			case "negro":
				colorSeguro = "negro";
				break;
			case "rojo":
				colorSeguro = "rojo";
				break;
			case "azul":
				colorSeguro = "azul";
				break;	
			case "gris":
				colorSeguro = "gris";
				break;
			default: 
				colorSeguro = "blanco";
				break;
			}
			return colorSeguro;
		}
		
		//Comprovamos las opciones de la letra
		private char comprovarConsumoEnergetico (char consumo) {
			//consumo = consumo.toLowerCase();
			char consumoSeguro;
			
			switch (consumo) {
			case 'a':
				consumoSeguro = 'a';
				break;
			case 'b':
				consumoSeguro = 'b';
				break;
			case 'c':
				consumoSeguro = 'c';
				break;
			case 'd':
				consumoSeguro = 'd';
				break;	
			case 'e':
				consumoSeguro = 'e';
				break;
			case 'f':
				consumoSeguro = 'f';
				break;
			default: 
				consumoSeguro = 'a';
				break;
			}
			return consumoSeguro;
		}
		
		public int precioFinal() {
						
			//Segun el consumo aplicamos el plus
			switch (consumo) {
			case 'a':
				precioBase += 100;
				break;
			case 'b':
				precioBase += 80;
				break;
			case 'c':
				precioBase += 60;
				break;
			case 'd':
				precioBase += 50;
				break;	
			case 'e':
				precioBase += 30;
				break;
			case 'f':
				precioBase += 10;
				break;
			}
			
			//miramos el peso y aplicamos el plus
			if (peso <= 20) {
				precioBase += 10;
			}
			else if (peso <= 49) {
				precioBase += 50;
			}
			else if (peso <= 79) {
				precioBase += 80;
			}
			else {
				precioBase += 100;
			}
			
			//devolvemos el precio pero con el plus
			return precioBase;
		}
		
		//Getts y setts
		public double getPrecioBase() {
			return precioBase;
		}

		public void setPrecioBase(int precioBase) {
			this.precioBase = precioBase;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public char getConsumo() {
			return consumo;
		}

		public void setConsumo(char consumo) {
			this.consumo = consumo;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

	}
