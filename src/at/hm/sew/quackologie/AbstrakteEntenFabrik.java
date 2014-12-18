package at.hm.sew.quackologie;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Diese Klasse enthält alle abstrakten Methoden die bspw. Entenfabrik
 * implementiert.
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141217
 */
public abstract class AbstrakteEntenFabrik {

	/**
	 * Erzeugt ein Stockentenobjekt
	 * 
	 * @return ein Stockentenobjekt
	 */
	public abstract Quakfaehig erzeugeStockEnte();

	/**
	 * Erzeugt ein MoorentenObjekt
	 * 
	 * @return ein Moorentenobjekt
	 */
	public abstract Quakfaehig erzeugeMoorEnte();

	/**
	 * Erzeugt ein Lockpfeifenobjekt
	 * 
	 * @return ein Lockpfeifenobjekt
	 */
	public abstract Quakfaehig erzeugeLockPfeife();

	/**
	 * Erzeugt ein Gummientenobjekt
	 * 
	 * @return ein Gummientenobjekt 
	 */
	public abstract Quakfaehig erzeugeGummiEnte();
}
