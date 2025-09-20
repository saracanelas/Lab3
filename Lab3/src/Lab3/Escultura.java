/**
 * 
 */
package Lab3;

/**
 * 
 */

public class Escultura {
	private String material;

	/**
	 * @param material
	 */
	public Escultura(String material) {
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
		return "Escultura [material=" + material + "]";
	}

}
