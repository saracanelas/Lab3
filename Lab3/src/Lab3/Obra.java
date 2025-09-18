/**
 * 
 */
package Lab3;
import java.util.ArrayList;
/**
 * 
 */
public class Obra {
	private String titulo;
	private String autor;
	private int data;
	private ArrayList <Pintura> pinturas;
	private ArrayList <Escultura> esculturas;
	/**
	 * @param titulo
	 * @param autor
	 * @param data
	 */
	public Obra(String titulo, String autor, int data) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.data = data;
		pinturas = new ArrayList <Pintura>;
		esculturas = new ArrayList <Escultura>;
	}
	
	
	
	
}
