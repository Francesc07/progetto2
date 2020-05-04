
import java.util.*;

/**
 * Class Vagone
 */
public class Vagone {

	//
	// Fields
	//

	protected String idVagone;
	protected float pesoVuoto;

	//
	// Constructors
	//
	public Vagone(String idVagone, float pesoVuoto) {
		this.idVagone = idVagone;
		this.pesoVuoto = pesoVuoto;
	}
	//
	// Methods
	//

	//
	// Accessor methods
	//

	/**
	 * Set the value of idVagone
	 * 
	 * @param newVar the new value of idVagone
	 */
	public void setIdVagone(String newVar) {
		idVagone = newVar;
	}

	/**
	 * Get the value of idVagone
	 * 
	 * @return the value of idVagone
	 */
	public String getIdVagone() {
		return idVagone;
	}

	/**
	 * Set the value of pesoVuoto
	 * 
	 * @param newVar the new value of pesoVuoto
	 */
	public void setPesoVuoto(float newVar) {
		pesoVuoto = newVar;
	}

	/**
	 * Get the value of pesoVuoto
	 * 
	 * @return the value of pesoVuoto
	 */
	public float getPesoVuoto() {
		return pesoVuoto;
	}

	//
	// Other methods
	//

	/**
	 * @return float
	 */
	public float calcolaPeso() {
		return pesoVuoto;
	}

	@Override
	public String toString() {
		return "Vagone [idVagone=" + idVagone + ", pesoVuoto=" + pesoVuoto + "]";
	}

	public static void main(String[] args) {
		// VagoneMerci v=new VagoneMerci("gdxg", 23, pesoMerce, tipoMerce)
		Vagone v = new Vagone("normale1", 223);
		System.out.println(v);
	}
}
