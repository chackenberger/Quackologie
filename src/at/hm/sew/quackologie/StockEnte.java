package at.hm.sew.quackologie;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Implementierung einer Stockente, implementiert Quakfaehig
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class StockEnte implements Quakfaehig {
	SenderRing senderRing;

	/**
	 * Erzeugt eine Stockente und übergibt sie dem Senderring
	 */
	public StockEnte() {
		senderRing = new SenderRing(this);
	}

	/**
	 * Gibt den Stockenteneigenen Laut "Quak" aus und benachrichtigt die
	 * Beobachter.
	 */
	public void quaken() {
		System.out.println("Quak");
		benachrichtigeBeobachtende();
	}

	/**
	 * Fügt den angegebenen Beobachter dem senderring hinzu
	 * 
	 * @param beobachter
	 *            der hinzuzufügende Beobachter
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}

	/**
	 * Benachrichtigt alle Beobachter
	 */
	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}

	/**
	 * Gibt einen String mit dem Text "Stockente" zurück.
	 */
	public String toString() {
		return "Stockente";
	}
}
