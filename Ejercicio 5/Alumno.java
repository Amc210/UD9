import java.util.Random;

public class Alumno extends Persona {
	private int notaActual;

	// constructor
	public Alumno() {		
		this.notaActual = (int) (Math.random() * (0 + 10));//generamos una nota al azar
		super.setEdad((int) (Math.random() * (0 + 29)));//Generamos una edad al azar
	}

	public boolean asistencia() {
		Random rand = new Random();
		boolean falta = false;
		
		// Genero un num random del 1 al 10
		if ((int) (rand.nextDouble() * 10 + 1) > 5) {
			falta = true;
		}
		
		return falta;

	}

	// gets y sets
	public int getNotaActual() {
		return notaActual;
	}

	public void setNotaActual(int notaActual) {
		this.notaActual = notaActual;
	}

	@Override
	public String toString() {
		return "Alumno [nombre = " + super.getNombre() + "/ notaActual = " + notaActual + "]";
	}
	

}
