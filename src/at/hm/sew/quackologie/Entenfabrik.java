package at.hm.sew.quackologie;

/**
 * Eine Factory aufbauend auf AbstrakteEntenfabrik, stellt alle vorhandenen
 * Enten zur Verfügung
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141217
 */
public class Entenfabrik extends AbstrakteEntenFabrik {

	/**
	 * Erzeugt eine StockEnte
	 * 
	 * @return ein StockEnten Objekt
	 */
	public Quakfaehig erzeugeStockEnte() {
		return new StockEnte();
	}

	/**
	 * Erzeugt eine Moorente
	 * 
	 * @return ein Moorenten objekt
	 */
	public Quakfaehig erzeugeMoorEnte() {
		return new MoorEnte();
	}

	/**
	 * Erzeugt eine Lockpfeife
	 * 
	 * @return ein Lockpfeifen objekt
	 */
	public Quakfaehig erzeugeLockPfeife() {
		return new LockPfeife();
	}

	/**
	 * Erzeugt eine Gummmiente
	 * 
	 * @return ein Gummmienten objekt
	 */
	public Quakfaehig erzeugeGummiEnte() {
		return new GummiEnte();
	}
}
