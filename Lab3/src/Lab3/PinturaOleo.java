package Lab3;

/**
 * 
 */

public class PinturaOleo {
	private String tipoTela;

	/**
	 * @param tipoTela
	 */
	
	public PinturaOleo(String tipoTela) {
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
		return "PinturaOleo [tipoTela=" + tipoTela + "]";
	}
	
	
}
