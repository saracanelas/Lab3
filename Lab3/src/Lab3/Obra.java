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
	public ArrayList<Pintura> getPinturas(){
		return pinturas;
	}
	
	public void registarPintura(Pintura novaPintura) {
		pinturas.add(novaPintura);
	}
	public Arraylist<Escultura> getEsculturas(){
		return esculturas;
	}
	public void registarEscultura(Escultura novaEscultura) {
		esculturas.add(novaEscultura);
	}
}
