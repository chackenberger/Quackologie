package at.hm.sew.quackologie;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Eine Schar von Enten, die alle der Fähigkeiten nun als Gruppe haben.
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class Schar implements Quakfaehig {
	ArrayList<Quakfaehig> quakende = new ArrayList<Quakfaehig>();

	/**
	 * Fügt der Schar eine Ente hinzu
	 * 
	 * @param quaker
	 *            die hinzuzufügende Ente
	 */
	public void hinzufuegen(Quakfaehig quaker) {
		quakende.add(quaker);
	}

	/**
	 * Lässt alle Enten der Schar quaken
	 */
	public void quaken() {
		Iterator<Quakfaehig> iterator = quakende.iterator();
		while (iterator.hasNext()) {
			Quakfaehig quaker = (Quakfaehig) iterator.next();
			quaker.quaken();
		}
	}

	/**
	 * Registriert den Beobachter bei allen Enten.
	 * 
	 * @param beobachter
	 *            der Beobachter der hinzugefügt wird.
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		Iterator<Quakfaehig> iterator = quakende.iterator();
		while (iterator.hasNext()) {
			Quakfaehig quaker = (Quakfaehig) iterator.next();
			quaker.registriereBeobachter(beobachter);
		}
	}

	public void benachrichtigeBeobachtende() {
	}

	/**
	 * Gibt einen String mit dem Text "Entenschar" zurück.
	 */
	public String toString() {
		return "Entenschar";
	}
}
