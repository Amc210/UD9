import java.util.Random;

public class Profesor extends Persona{
	private String materia;
	public static final String[] MATERIAS = {"Matematicas", "Filosofia", "Fisica"};
	     	
	public Profesor() {		
		this.materia = MATERIAS [(int) (Math.random() * (0 + 2))];
	}

	public boolean asistencia() {
		Random rand = new Random();
		boolean falta = false;
		
		// Genero un num random del 1 al 10
		if ((int) (rand.nextDouble() * 20 ) > 18) {
			falta = true;
		}
		
		return falta;

	}

	
	//toString
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", materia=" + materia + "]";
	}

	//gets y sets
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	
}
