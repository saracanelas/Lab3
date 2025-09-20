package Lab3;

import java.util.ArrayList;

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
	public PinturaOleo(String titulo, String autor, int data, String tecnica, ArrayList<PinturaOleo> oleos,
			String tipoTela) {
		super(titulo, autor, data, tecnica, oleos);
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
