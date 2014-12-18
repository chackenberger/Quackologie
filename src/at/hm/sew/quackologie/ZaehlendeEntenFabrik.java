package at.hm.sew.quackologie;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Implementierung einer Fabrik für Quakzählende Enten
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class ZaehlendeEntenFabrik extends AbstrakteEntenFabrik {

	/**
	 * Erzeugt eine StockEnte die von einem Quakzaehler überwacht wird.
	 */
	public Quakfaehig erzeugeStockEnte() {
		return new QuakZaehler(new StockEnte());
	}

	/**
	 * Erzeugt eine Moorente die von einem Quakzaehler überwacht wird.
	 */
	public Quakfaehig erzeugeMoorEnte() {
		return new QuakZaehler(new MoorEnte());
	}

	/**
	 * Erzeugt eine Lockpfeife die von einem Quakzaehler überwacht wird.
	 */
	public Quakfaehig erzeugeLockPfeife() {
		return new QuakZaehler(new LockPfeife());
	}

	/**
	 * Erzeugt eine Gummmiente die von einem Quakzaehler überwacht wird.
	 */
	public Quakfaehig erzeugeGummiEnte() {
		return new QuakZaehler(new GummiEnte());
	}
}
