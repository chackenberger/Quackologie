package at.hm.sew.quackologie;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Implementierung einer Lockpfeife, implementiert die Methoden von Quakfähig.
 * 
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class LockPfeife implements Quakfaehig {
	SenderRing senderRing;

	/**
	 * Erzeugt eine Lockpfeife, die einem Senderring zugeordnet wird.
	 */
	public LockPfeife() {
		senderRing = new SenderRing(this);
	}

	/**
	 * Gibt den Lockpfeifeneigenen Laut aus und benachrichtigt die
	 * Beobachtenden.
	 */
	public void quaken() {
		System.out.println("Kwaak");
		benachrichtigeBeobachtende();
	}

	/**
	 * Fügt dem Senderring einen Beobachter hinzu
	 * 
	 * @param beobachter
	 *            Der Beobachter der hinzugefügt wird
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
	 * Gibt einen String zurück, der den Text "Lockpfeife" enthält.
	 * 
	 * @return "Lockpfeife"
	 */
	public String toString() {
		return "Lockpfeife";
	}
}
