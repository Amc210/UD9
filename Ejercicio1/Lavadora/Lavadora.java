package Lavadora;

import Electrodomestico.Electrodomestico;

public class Lavadora extends Electrodomestico {
	
	//Atributo propio
	private int carga;
	
	//Constante 
	final int CARGA = 50;
	
	//Constructor por defecto
	public Lavadora() {
		super();
		this.carga = CARGA;
	}
	
	//Constructores con precio y peso el resto por defecto
	public Lavadora(int precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA;
	}
		
	@Override
	public String toString() {
		return "Lavadora [carga = " + carga + ", precioBase = " + precioBase + ", color = " + color
				+ ", consumo = " + consumo + ", peso = " + peso + "]";
	}

	//Constructor con valores heredados
	public Lavadora(int precioBase, String color, char consumo, double peso, int carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
	}
	
	//Metodo de precio final y llamamos al super del precio final de electrodomestico
	public int precioFinal() {
		precioBase = super.precioFinal();
		
		if (carga > 30) {
			precioBase += 50;
		}
		return precioBase;
	}
	
	//get y set
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	

}
