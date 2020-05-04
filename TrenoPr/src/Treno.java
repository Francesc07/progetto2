//modifica 1
import java.util.*;

/**
 * Class Treno
 */
public class Treno {

	//
	// Fields
	//

	private String modello;
	private float velocitaMassima;
	private int numVagoni;
	private Vagone[] vagoni;

	//
	// Constructors
	//
	public Treno(String modello, float velocitaMassima) {
		this.modello = modello;
		this.velocitaMassima = velocitaMassima;
		numVagoni = 0;
		vagoni = new Vagone[15];
	}
	//
	// Methods
	//

	//
	// Accessor methods
	//

	/**
	 * Set the value of modello
	 * 
	 * @param newVar the new value of modello
	 */
	public void setModello(String newVar) {
		modello = newVar;
	}

	/**
	 * Get the value of modello
	 * 
	 * @return the value of modello
	 */
	public String getModello() {
		return modello;
	}

	/**
	 * Set the value of velocitaMassima
	 * 
	 * @param newVar the new value of velocitaMassima
	 */
	public void setVelocitaMassima(float newVar) {
		velocitaMassima = newVar;
	}

	/**
	 * Get the value of velocitaMassima
	 * 
	 * @return the value of velocitaMassima
	 */
	public float getVelocitaMassima() {
		return velocitaMassima;
	}

	/**
	 * Set the value of numVagoni
	 * 
	 * @param newVar the new value of numVagoni
	 */
	public void setNumVagoni(int newVar) {
		numVagoni = newVar;
	}

	/**
	 * Get the value of numVagoni
	 * 
	 * @return the value of numVagoni
	 */
	public int getNumVagoni() {
		return numVagoni;
	}

	/**
	 * Get the value of vagoni
	 * 
	 * @return the value of vagoni
	 */
	public Vagone[] getVagoni() {
		return vagoni;
	}

	//
	// Other methods
	//
	/**
	 * @return boolean
	 * @param idVagone
	 * @param pesoVuoto
	 * @param pesoMerce
	 * @param tipoMerce
	 */
	public boolean addVagoneMerci(String idVagone, float pesoVuoto, float pesoMerce, String tipoMerce) {
		if (numVagoni < 15) {
			VagoneMerci v = new VagoneMerci(idVagone, pesoVuoto, pesoMerce, tipoMerce);
			vagoni[numVagoni] = v;
			numVagoni++;
			return true;
		}
		return false;
	}

	/**
	 * @return boolean
	 * @param idVagone
	 * @param pesoVuoto
	 * @param numMaxPasseggeri
	 * @param pesoMedioPasseggeri
	 * @param numPasseggeri
	 */
	public boolean addVagonePasseggeri(String idVagone, float pesoVuoto, int numMaxPasseggeri,
			float pesoMedioPasseggeri, int numPasseggeri) {
		if (numVagoni < 15) {
			VagonePasseggeri v = new VagonePasseggeri(idVagone, pesoVuoto, numPasseggeri, pesoMedioPasseggeri,
					numMaxPasseggeri);
			vagoni[numVagoni] = v;
			numVagoni++;
			return true;
		}
		return false;
	}

	/**
	 * @return boolean
	 * @param vagone
	 */
	public boolean addVagone(Vagone vagone) {
		if (numVagoni < 15) {
			vagoni[numVagoni] = vagone;
			numVagoni++;
			return true;
		}
		return false;
	}

	/**
	 * @return float
	 */
	public float calcolaPesoTreno() {
		float pesoTotale = 0;
		for (int i = 0; i < numVagoni; i++)
			pesoTotale += vagoni[i].calcolaPeso();
		return pesoTotale;
	}

	/**
	 * @return boolean
	 * @param idVagone
	 */
	public boolean eliminaVagone(String idVagone) {
		boolean trovato = false;
		for (int i = 0; i < numVagoni; i++)
			if (vagoni[i].getIdVagone().compareToIgnoreCase(idVagone) == 0) {
				for (int j = i; j < numVagoni - 1; j++)
					vagoni[j] = vagoni[j + 1];
				numVagoni--;
				trovato = true;
			}
		return trovato;
	}

	/**
	 * @return Vagone
	 * @param idVagone
	 */
	public Vagone cerca(String idVagone) {
		for (int i = 0; i < numVagoni; i++)
			if (vagoni[i].getIdVagone().compareToIgnoreCase(idVagone) == 0)
				return vagoni[i];
		return null;
	}

	/**
	 * @return Vagone[]
	 * @param tipoMerce
	 */
	public Vagone[] cercaVagoneMerci(String tipoMerce) {
		Vagone[] vTrovati = new Vagone[numVagoni];
		int contTrovati = 0;
		for (int i = 0; i < numVagoni; i++)
			if (vagoni[i] instanceof VagoneMerci) {
				VagoneMerci v = (VagoneMerci) vagoni[i];
				if (v.getTipoMerce().compareToIgnoreCase(tipoMerce) == 0) {
					vTrovati[contTrovati] = v;
					contTrovati++;
				}
			}
		return vTrovati;
	}

	/**
	 * @return Vagone[]
	 * @param numPasseggeri
	 */
	public Vagone[] cercaVagonePasseggeri(int numPasseggeri) {
		Vagone[] vTrovati = new Vagone[numVagoni];
		int contTrovati = 0;
		for (int i = 0; i < numVagoni; i++)
			if (vagoni[i] instanceof VagonePasseggeri) {
				VagonePasseggeri v = (VagonePasseggeri) vagoni[i];
				if (v.getNumPasseggeri() == numPasseggeri) {
					vTrovati[contTrovati] = v;
					contTrovati++;
				}
			}
		return vTrovati;
	}

	public String getToString(Vagone[] v) {
		String s = "";
		for (int i = 0; i < v.length; i++)
			if (v[i] != null)
				s += v[i].toString() + "\n";
		return s;
	}

	@Override
	public String toString() {
		String s = "Modello: " + this.modello + "\nVelocità massima: " + this.velocitaMassima + "\nNumero di vagoni: "
				+ this.numVagoni + "\nVagoni:\n";
		for (int i = 0; i < this.numVagoni; i++)
			s += (i+1)+") "+vagoni[i].toString() + "\n";
		return s;
	}

	public static void main(String[] args) {
		Treno t = new Treno("Freccia Rossa", 250);
		if (t.addVagoneMerci("123A", 50, 100, "Tipo1"))
			System.out.println("Vagone aggiunto correttamente");
		else
			System.out.println("Numero massimo di vagoni raggiunto");
		if (t.addVagoneMerci("123AA", 60, 200, "Tipo1"))
			System.out.println("Vagone aggiunto correttamente");
		else
			System.out.println("Numero massimo di vagoni raggiunto");
		if (t.addVagonePasseggeri("123B", 40, 100, 70, 80))
			System.out.println("Vagone aggiunto correttamente");
		else
			System.out.println("Numero massimo di vagoni raggiunto");
		Vagone[] v = t.cercaVagoneMerci("Tipo1");
		System.out.println("\nStiamo eseguendo la ricerca...\n" + t.getToString(v));
		Vagone[] vP = t.cercaVagonePasseggeri(80);
		System.out.println("Stiamo eseguendo la ricerca...\n" + t.getToString(vP));
		System.out.println("Stiamo eseguendo la ricerca...\n" + t.cerca("123A"));
		System.out.println("\nPeso totale del treno (approssimativo): " + t.calcolaPesoTreno() + " Kg");
		System.out.println("\nEcco tutti i dati del treno:\n" + t);
		if(t.eliminaVagone("123AA"))
			System.out.println("Vagone eliminato correttamente");
		else
			System.out.println("Non abbiamo trovato un vagone con questo codice identificativo");
		System.out.println("\nEcco tutti i dati del treno:\n" + t);
	}
}
