package Television;

import Electrodomestico.Electrodomestico;

public class Television extends Electrodomestico {

	//Atributo
	private double pulgadas;
	private boolean tdt;
	
	//constante
	final double PULG = 20;
	final boolean TDT = false;
	
	//Constructor con atributos heredados
	public Television(int precioBase, String color, char consumo, double peso, double pulgadas, boolean tdt) {
		super(precioBase, color, consumo, peso);
		this.pulgadas = PULG;
		this.tdt = tdt;
	}
	
	//constructor por defecto
	public Television() {
		super();
		this.pulgadas = PULG;
		this.tdt = TDT;
	}
	
	//Constructores con precio y peso el resto por defecto
	public Television(int precioBase, double peso) {
		super(precioBase, peso);
		this.pulgadas = PULG;
		this.tdt = TDT;
	}
	
	//toString
	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", tdt=" + tdt + ", precioBase="
				+ precioBase + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + "]";
	}

	//Para calcular el precio final con el plus
	public int precioFinal() {
		precioBase = super.precioFinal();
		
		if (pulgadas > 40) {
			precioBase += ((super.getPrecioBase() * 30)/100);
		}
		if(tdt == true) {
			precioBase += 50;
		}
		return precioBase;
	}
}
