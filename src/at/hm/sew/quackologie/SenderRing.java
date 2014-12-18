package at.hm.sew.quackologie;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Implementierung eines Senderrings, implementiert Quakbeobachtungssubjekt.
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class SenderRing implements QuakBeobachtungsSubjekt {
	ArrayList<Beobachter> beobachtende = new ArrayList<Beobachter>();
	QuakBeobachtungsSubjekt ente;

	/**
	 * Erzeugt einen Senderring und übernimmt die Ente.
	 * 
	 * @param ente
	 */
	public SenderRing(QuakBeobachtungsSubjekt ente) {
		this.ente = ente;
	}

	/**
	 * Registriert Beobachter und fügt sie der Liste hinzu
	 * 
	 * @param beobachter
	 *            der hinzuzufügende Beobachter
	 */
	public void registriereBeobachter(Beobachter beobachter) {
		beobachtende.add(beobachter);
	}

	/**
	 * Benachrichtigt alle registrierten Beobachter.
	 */
	public void benachrichtigeBeobachtende() {
		Iterator<Beobachter> iterator = beobachtende.iterator();
		while (iterator.hasNext()) {
			Beobachter beobachter = (Beobachter) iterator.next();
			beobachter.aktualisieren(ente);
		}
	}

	public Iterator<Beobachter> getBeobachtende() {
		return beobachtende.iterator();
	}
}
