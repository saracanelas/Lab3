/**
 * 
 */
package Lab3;

/**
 * 
 */

public class Escultura extends Obra {
	private String material;
	
	/**
	 * @param titulo
	 * @param autor
	 * @param data
	 * @param material
	 */
	public Escultura(String titulo, String autor, int data, String material) {
		super(titulo, autor, data);
		this.material = material;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return super.toString() + "Material= " + material;
	}

}
