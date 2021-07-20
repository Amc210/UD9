
public class Aula {
	// Atributos
	private int id;
	private String materia;
	private Alumno[] alumno;
	private Profesor profe;
	private final int MAX = 30; // Constante
	public static final String[] MATERIAS = { "Matematicas", "Filosofia", "Fisica" };

	// constructor
	public Aula() {
		this.id = 1;
		this.materia = MATERIAS[(int) (Math.random() * (0 + 2))];
		this.alumno = new Alumno[MAX];
		crearAlumno();
		this.profe = new Profesor();
	}

	private void crearAlumno() {
		for (int i = 0; i < alumno.length; i++) {
			alumno[i] = new Alumno();
		}

	}

	private boolean alumnosAsisten() {

		int cont = 0;

		// contamos las asistencias
		for (int i = 0; i < alumno.length; i++) {
			if (alumno[i].isFalta() == true) {
				cont++;
			}
		}

		// Muestra la asistencia total
		System.out.println("Faltan " + cont + " alumnos");

		return (cont >= ((int) (alumno.length / 2)));

	}

	public boolean Clase() {

		// comprovamos si el profe esta si el aula y asignatura son la misma y si la
		// asistencia es suficiente
		if (profe.isFalta() == true) {
			System.out.println("El profesor no esta");
			return false;
		} else if (!profe.getMateria().equalsIgnoreCase(materia)) {
			System.out.println("La materia y  aula no es la misma");
			return false;
		} else if (alumnosAsisten()) {
			System.out.println("La asistencia es insuficiente");
			return false;
		} else {
			System.out.println("Se puede dar clase"); // En caso que todo sea correto mostrar el mensaje
			return true;
		}
	}

	public void nota() {

		int aprovados = 0;
		int aprovadas = 0;

		System.out.println("Lista alumnos: ");
		for (int i = 0; i < alumno.length; i++) {
			// Comprobamos si el alumno esta aprobado
			if (alumno[i].getNotaActual() >= 5) {
				// Segun el sexo, aumentara uno o otro
				if (alumno[i].getSexo() == 'H') {
					aprovados++;
				}
				if (alumno[i].getSexo() == 'M') {
					aprovadas++;
				}
				System.out.println(alumno[i].toString());
			}
		}
		System.out.println("Hay " + aprovados + " chicos aprovados y " + aprovadas + " chicas aprobadas");
	}

	// gets y sets
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Alumno[] getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno[] alumno) {
		this.alumno = alumno;
	}

	public Profesor getProfe() {
		return profe;
	}

	public void setProfe(Profesor profe) {
		this.profe = profe;
	}

}
