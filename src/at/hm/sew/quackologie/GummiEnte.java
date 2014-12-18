package at.hm.sew.quackologie;

/**
 * Implementierung einer Gummiente, implementiert Quakfaehig.
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class GummiEnte implements Quakfaehig {
	SenderRing senderRing;

	/**
	 * Erzeugt eine Gummiente, der einem Senderring zugeordnet wird.
	 */
	public GummiEnte() {
		senderRing = new SenderRing(this);
	}

	/**
	 * Gibt den Gummienteneigenen laut "Quietsch" aus und benachrichtigt die
	 * Beobachter.
	 */
	public void quaken() {
		System.out.println("Quietsch");
		benachrichtigeBeobachtende();
	}

	/**
	 * Fügt den neuen Beobachter dem Senderring hinzu.
	 * 
	 * @param beobachter
	 *            der hinzuzufügende Beobachter
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		senderRing.registriereBeobachter(beobachter);
	}

	/**
	 * Benachrichtigt alle registrierten Beobachter.
	 */
	public void benachrichtigeBeobachtende() {
		senderRing.benachrichtigeBeobachtende();
	}

	/**
	 * Gibt einen String mit dem Text "Gummiente" zurück.
	 * 
	 * @return "Gummiente"
	 */
	public String toString() {
		return "Gummiente";
	}
}
