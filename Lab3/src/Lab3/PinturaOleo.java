package Lab3;


/**
 * 
 */

public class PinturaOleo extends Pintura {
	private String tipoTela;

	/**
	 * @param titulo
	 * @param autor
	 * @param data
	 * @param tecnica
	 * @param oleos
	 * @param tipoTela
	 */
	public PinturaOleo(String titulo, String autor, int data, String tecnica, String tipoTela) {
		super(titulo, autor, data, tecnica);
		this.tipoTela = tipoTela;
	}

	/**
	 * @return the tipoTela
	 */
	public String getTipoTela() {
		return tipoTela;
	}

	@Override
	public String toString() {
		return super.toString() + " Tipo de Tela= " + tipoTela;
		
	}
	
	
}
