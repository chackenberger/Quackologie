package at.hm.sew.quackologie;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Implementierung einer Gans die schnattern kann.
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class Gans {

	/**
	 * Der Laut einer Gans, entspricht dem quaken einer Ente
	 */
	public void schnattern() {
		System.out.println("Schnatter");
	}

	/**
	 * Gibt einen String zurück, der sagt was es ist, eine Gans
	 * 
	 * @return "Gans"
	 */
	public String toString() {
		return "Gans";
	}
}
