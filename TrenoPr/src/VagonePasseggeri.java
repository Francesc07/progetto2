
/**
 * Class VagonePasseggeri
 */
public class VagonePasseggeri extends Vagone {

	//
	// Fields
	//

	private int numPasseggeri;
	private float pesoMedioPasseggeri;
	private int numMaxPasseggeri;

	//
	// Constructors
	//
	public VagonePasseggeri(String idVagone, float pesoVuoto, int numPasseggeri, float pesoMedioPasseggeri,
			int numMaxPasseggeri) {
		super(idVagone, pesoVuoto);
		this.numPasseggeri = numPasseggeri;
		this.pesoMedioPasseggeri = pesoMedioPasseggeri;
		this.numMaxPasseggeri = numMaxPasseggeri;
	}

	//
	// Methods
	//

	//
	// Accessor methods
	//

	/**
	 * Set the value of numPasseggeri
	 * 
	 * @param newVar the new value of numPasseggeri
	 */
	public void setNumPasseggeri(int newVar) {
		numPasseggeri = newVar;
	}

	/**
	 * Get the value of numPasseggeri
	 * 
	 * @return the value of numPasseggeri
	 */
	public int getNumPasseggeri() {
		return numPasseggeri;
	}

	/**
	 * Set the value of pesoMedioPasseggeri
	 * 
	 * @param newVar the new value of pesoMedioPasseggeri
	 */
	public void setPesoMedioPasseggeri(float newVar) {
		pesoMedioPasseggeri = newVar;
	}

	/**
	 * Get the value of pesoMedioPasseggeri
	 * 
	 * @return the value of pesoMedioPasseggeri
	 */
	public float getPesoMedioPasseggeri() {
		return pesoMedioPasseggeri;
	}

	/**
	 * Set the value of numMaxPasseggeri
	 * 
	 * @param newVar the new value of numMaxPasseggeri
	 */
	public void setNumMaxPasseggeri(int newVar) {
		numMaxPasseggeri = newVar;
	}

	/**
	 * Get the value of numMaxPasseggeri
	 * 
	 * @return the value of numMaxPasseggeri
	 */
	public int getNumMaxPasseggeri() {
		return numMaxPasseggeri;
	}
	
	public float calcolaPeso() {
		return (pesoMedioPasseggeri*numPasseggeri)+super.pesoVuoto;
	}

	@Override
	public String toString() {
		return "VagonePasseggeri [numPasseggeri=" + numPasseggeri + ", pesoMedioPasseggeri=" + pesoMedioPasseggeri
				+ ", numMaxPasseggeri=" + numMaxPasseggeri + ", idVagone=" + idVagone + ", pesoVuoto=" + pesoVuoto
				+ "]";
	}

	//
	// Other methods
	//

}
