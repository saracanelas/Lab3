/**
 * 
 */
package Lab3;

/**
 * 
 */

import java.util.ArrayList;

public class Pintura {
	private String tecnica;
	private ArrayList<PinturaOleo> oleos;
	
	/**
	 * @param tecnica
	 * @param oleos
	 */
	
	public Pintura(String tecnica, ArrayList<PinturaOleo> oleos) {
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
	
	
}
