package at.hm.sew.quackologie;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Implementierung eines Quakzählers, zählt wie oft gequakt wurde.
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class QuakZaehler implements Quakfaehig {
	Quakfaehig ente;
	static AtomicInteger anzahlDerQuaks = new AtomicInteger();

	/**
	 * Erzeugt einen Quakzähler der die übergebene Ente übernimmt
	 * 
	 * @param ente
	 *            deren Quaks gezählt werden.
	 */
	public QuakZaehler(Quakfaehig ente) {
		this.ente = ente;
	}

	/**
	 * Quakt und erhöht den Zähler
	 */
	public void quaken() {
		ente.quaken();
		anzahlDerQuaks.incrementAndGet();
	}

	/**
	 * Gibt die Anzahl der QUaks zurück
	 * 
	 * @return die Anzahl der bisherigen quaks.
	 */
	public static int getQuaks() {
		return anzahlDerQuaks.get();
	}

	/**
	 * Setzt den Quakcounter zurück
	 * 
	 * Added method for testing to reset the Quak counter
	 */
	public static void resetQuaks() {
		anzahlDerQuaks.set(0);
	}

	/**
	 * Fügt dem Senderring der Ente den übergebenen Beobachter hinzu.
	 * 
	 * @param beobachter
	 *            der hinzuzufügende Beobachter
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		ente.registriereBeobachter(beobachter);
	}

	/**
	 * Benachrichtigt alle registrierten Beobachter
	 */
	public void benachrichtigeBeobachtende() {
		ente.benachrichtigeBeobachtende();
	}

	/**
	 * Gibt einen String mit dem Namen der Ente zurück
	 */
	public String toString() {
		return ente.toString();
	}
}
