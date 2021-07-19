
public abstract class Persona {
	// atributos
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean falta;

	private final String[] NHOMBRE = { "Juan", "Antonio", "Eric", "Pedro", "Pablo" }; // Array de alumnos
	private final String[] NMUJER = { "Alicia", "Laura", "Anna", "Carla", "Nuria" };// Array de alumnas
	private final int M = 0; // asignamos al sexo un numero
	private final int H = 1;

	// constructor
	public Persona() {
		int sexo;
		sexo = (int) (Math.random() * (0 + 1));// generamos un numero aleatorio para el sexo

		// Comprovamos si es hombre o mujer con la constante creada
		if (sexo == H) {
			nombre = NHOMBRE[(int) (Math.random() * NHOMBRE.length)];
			sexo = 'H';
		}
		if (sexo == M) {
			nombre = NMUJER[(int) (Math.random() * NMUJER.length)];
			sexo = 'M';
		}

		asistencia(); // comprovamos la asistencia
	}

	public abstract boolean asistencia(); // Tendran que implementarlo las clases hijas con sus datos

	public void edadRandom() {
		int edad;
		edad = (int) (Math.random() * (0 + 30));// Rango edad

		if (edad < 30) { // Si es menor a 30 no asigna el valor
			setEdad(edad);
		} else {
			setEdad(edad); // en caso contrario no
		}

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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isFalta() {
		return falta;
	}

	public void setFalta(boolean falta) {
		this.falta = falta;
	}

}
