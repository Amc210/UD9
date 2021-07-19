
public class Espectador {
	// Atributos
	private String nombre;
	private int edad;
	private double dinero;

	// Constructores
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	// calculo para restarle el precio de la entrada
	public void pagar(double precioEntrada) {
		dinero -= precioEntrada;
	}

	// Comprovamos que su edad es mayor a la minima
	public boolean tieneEdad(Pelicula pelicula) {
		boolean si = false;
		int edadMinima = 16;
		
		if (pelicula.getEdadMinima() < getEdad()) {
			si = true;
		} 
		return si;
	}

	// para comprovar si tiene dinero suficiente para pagar
	public boolean tieneDinero(Cine cine) {
		boolean suficiente = false;
		
		if (cine.getPrecioEntrada() > getDinero()) {
			suficiente = false;
		} else {
			suficiente = true;
		}
		
		return suficiente;
	}

	// gets y sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	// toString
	@Override
	public String toString() {
		return "El espectador " + nombre + " de " + edad + " años y " + dinero + " €";
	}

}
