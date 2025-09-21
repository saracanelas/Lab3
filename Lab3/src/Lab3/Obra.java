/**
 * 
 */
package Lab3;
/**
 * 
 */
public class Obra {
	private String titulo;
	private String autor;
	private int data;
	
	
	/**
	 * @param titulo
	 * @param autor
	 * @param data
	 */
	public Obra(String titulo, String autor, int data) {
		this.titulo = titulo;
		this.autor = autor;
		this.data = data;
	
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	
	
	@Override
	public String toString() {
		return "Obra: Título=" + titulo + ", Autor= " + autor + ", Ano de criação= " + data;
	}
	
}
