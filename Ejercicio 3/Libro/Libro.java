package Libro;

public class Libro {
	//Declaramos lo satributos
	private int ISBN;
	private String titulo;
	private String autor;
	private int nPaginas;
	
	
	//Constructor
	public Libro(int iSBN, String titulo, String autor, int nPaginas) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
	}

	//toString
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + ISBN + " creado por " + autor + " tiene " + nPaginas + " páginas.";
	}
	
	//Get y set
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getnPaginas() {
		return nPaginas;
	}
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	
	
	
	
	
	
	
	
	
}
