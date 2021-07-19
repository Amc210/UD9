public class Cine {
	//atributos
	private Pelicula pelicula;
	private double precioEntrada;
	
	//contructor
	public Cine (Pelicula pelicula, double precio) {
		this.pelicula = pelicula;
		this.precioEntrada = precio;
	}

	//gets y sets
	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
}