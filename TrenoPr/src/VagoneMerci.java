

/**
 * Class VagoneMerci
 */
public class VagoneMerci extends Vagone {

  //
  // Fields
  //

  private float pesoMerce;
  private String tipoMerce;
  
  //
  // Constructors
  //
  public VagoneMerci(String idVagone, float pesoVuoto, float pesoMerce, String tipoMerce) {
		super(idVagone, pesoVuoto);
		this.pesoMerce = pesoMerce;
		this.tipoMerce = tipoMerce;
	}
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of pesoMerce
   * @param newVar the new value of pesoMerce
   */
  public void setPesoMerce (float newVar) {
    pesoMerce = newVar;
  }

/**
   * Get the value of pesoMerce
   * @return the value of pesoMerce
   */
  public float getPesoMerce () {
    return pesoMerce;
  }

  /**
   * Set the value of tipoMerce
   * @param newVar the new value of tipoMerce
   */
  public void setTipoMerce (String newVar) {
    tipoMerce = newVar;
  }

  /**
   * Get the value of tipoMerce
   * @return the value of tipoMerce
   */
  public String getTipoMerce () {
    return tipoMerce;
  }

  //
  // Other methods
  //
  
  /**
   * @return       float
   */
  public float calcolaPeso()
  {
	  return pesoVuoto+pesoMerce;
  }



  
 @Override
public String toString() {
	return "VagoneMerci [pesoMerce=" + pesoMerce + ", tipoMerce=" + tipoMerce + ", idVagone=" + idVagone
			+ ", pesoVuoto=" + pesoVuoto + "]";
}


public static void main(String[] args) {
	VagoneMerci v=new VagoneMerci("gdxg", 23, 244, "merci1");
	 //Vagone v=new Vagone("normale1", 223);
	 System.out.println(v);
}

}
