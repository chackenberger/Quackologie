package at.hm.sew.quackologie;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Implementation einer Moorente, implementiert Quakfaehig.
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class MoorEnte implements Quakfaehig {
	SenderRing senderRing;

	/**
	 * Erzeugt eine Moorente und ordnet sie einem Senderring zu.
	 */
	public MoorEnte() {
		senderRing = new SenderRing(this);
	}

	/**
	 * Gibt den Moorenteneigenen Laut "Quak" aus und benachrichtigt die
	 * Beobachter.
	 */
	public void quaken() {
		System.out.println("Quak");
		benachrichtigeBeobachtende();
	}

	/**
	 * Fügt den Beobachter dem Senderring hinzu.
	 * 
	 * @param beobachter
	 *            der hinzuzufügende Beobachter.
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}

	/**
	 * Benachrichtigt die registrierten Beobachter.
	 */
	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}

	/**
	 * Gibt einen String mit dem Text "Moorente" zurück.
	 * 
	 * @return "Moorente"
	 */
	public String toString() {
		return "Moorente";
	}
}
