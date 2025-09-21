/**
 * 
 */
package Lab3;

/**
 * 
 */


public class Pintura extends Obra {
	private String tecnica;
	
	/**
	 * @param titulo
	 * @param autor
	 * @param data
	 * @param tecnica
	 * @param oleos
	 */
	public Pintura(String titulo, String autor, int data, String tecnica) {
		super(titulo, autor, data);
		this.tecnica = tecnica;
	}

	/**
	 * @return the técnica
	 */
	public String getTecnica() {
		return tecnica;
	}



	@Override
	public String toString() {
		return super.toString() + "Técnica= " + tecnica;
	}
	
  
    }
	

