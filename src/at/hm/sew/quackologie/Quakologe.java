package at.hm.sew.quackologie;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Der Beobachter der Quakbeobachtungssubjekte.
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class Quakologe implements Beobachter {

	/**
	 * Gibt aus welche Ente gequackt hat.
	 * 
	 * @param ente
	 *            die Ente die gequackt hat
	 */
	public void aktualisieren(QuakBeobachtungsSubjekt ente) {
		System.out.println("Quakologe: " + ente + " hat gerade gequakt.");
	}

	/**
	 * Gibt einen String mit dem Text "Quakologe" zurück.
	 */
	public String toString() {
		return "Quakologe";
	}
}
