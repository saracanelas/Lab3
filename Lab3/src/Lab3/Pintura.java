/**
 * 
 */
package Lab3;

/**
 * 
 */

import java.util.ArrayList;

public class Pintura extends Obra {
	private String tecnica;
	private ArrayList<PinturaOleo> oleos;
	
	/**
	 * @param titulo
	 * @param autor
	 * @param data
	 * @param tecnica
	 * @param oleos
	 */
	public Pintura(String titulo, String autor, int data, String tecnica, ArrayList<PinturaOleo> oleos) {
		super(titulo, autor, data);
		this.tecnica = tecnica;
		this.oleos = oleos;
	}

	/**
	 * @return the tecnica
	 */
	public String getTecnica() {
		return tecnica;
	}

	/**
	 * @return the oleos
	 */
	public ArrayList<PinturaOleo> getOleos() {
		return oleos;
	}

	@Override
	public String toString() {
		return "Pintura [tecnica=" + tecnica + ", oleos=" + oleos + "]";
	}
	
    public void registarPinturaOleo(PinturaOleo oleo) {
        oleos.add(oleo);
    }
	
}
