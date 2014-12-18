package at.hm.sew.quackologie;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Die Adapterklasse für Gans. Sie ermöglicht die interaktion mit Gans als wäre
 * es eine Ente
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class GansAdapter implements Quakfaehig {
	Gans gans;
	SenderRing senderRing;

	/**
	 * Erzeugt einen Gansadapter für die übergebene Gans.
	 * 
	 * @param gans
	 *            die Gans mit der interagiert werden soll
	 */
	public GansAdapter(Gans gans) {
		this.gans = gans;
		senderRing = new SenderRing(this);
	}

	/**
	 * Führt das quaken der Gans, also schnattern aus und benachrichtigt den
	 * Beobachter.
	 */
	public void quaken() {
		gans.schnattern();
		benachrichtigeBeobachtende();
	}

	/**
	 * fügt den angegebenen Beobachter zu den Beobachtern des Senderrings hinzu
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}

	/**
	 * Benachrichtigt alle registrierten Beobachter
	 */
	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}

	/**
	 * Gibt einen String mit dem Text:"sich als Ente ausgebende Gans" zurück.
	 * 
	 * @return "sich als Ente ausgebende Gans"
	 */
	public String toString() {
		return "sich als Ente ausgebende Gans";
	}
}
