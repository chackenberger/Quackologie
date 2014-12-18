package at.hm.sew.quackologie;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Hier werden verschiedene Verhalten von Enten simuliert.
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public class EntenSimulator {
	public static void main(String[] args) {
		EntenSimulator simulator = new EntenSimulator();
		AbstrakteEntenFabrik entenFabrik = new ZaehlendeEntenFabrik();

		simulator.simulieren(entenFabrik);
	}

	/**
	 * Die Simulation des Entenverhaltens, viele der möglichen Funktionen werden
	 * hier ausgeführt, sowie alle Enten erzeugt.
	 * 
	 * @param entenfabrik
	 *            die Fabrik die für die erzeugung der Enten verantwortlich ist.
	 */
	void simulieren(AbstrakteEntenFabrik entenfabrik) {

		Quakfaehig moorEnte = entenfabrik.erzeugeMoorEnte();
		Quakfaehig lockPfeife = entenfabrik.erzeugeLockPfeife();
		Quakfaehig gummiEnte = entenfabrik.erzeugeGummiEnte();
		Quakfaehig gansEnte = new GansAdapter(new Gans());

		Schar EntenSchar = new Schar();

		EntenSchar.hinzufuegen(moorEnte);
		EntenSchar.hinzufuegen(lockPfeife);
		EntenSchar.hinzufuegen(gummiEnte);
		EntenSchar.hinzufuegen(gansEnte);

		Schar stockEntenSchar = new Schar();

		Quakfaehig stockEnte1 = entenfabrik.erzeugeStockEnte();
		Quakfaehig stockEnte2 = entenfabrik.erzeugeStockEnte();
		Quakfaehig stockEnte3 = entenfabrik.erzeugeStockEnte();
		Quakfaehig stockEnte4 = entenfabrik.erzeugeStockEnte();

		stockEntenSchar.hinzufuegen(stockEnte1);
		stockEntenSchar.hinzufuegen(stockEnte2);
		stockEntenSchar.hinzufuegen(stockEnte3);
		stockEntenSchar.hinzufuegen(stockEnte4);

		EntenSchar.hinzufuegen(stockEntenSchar);

		System.out.println("\nEntensimulator: mit Observer");

		Quakologe quakologe = new Quakologe();
		EntenSchar.registriereBeobachter(quakologe);

		simulieren(EntenSchar);

		System.out.println("\nDie Enten haben " + QuakZaehler.getQuaks() + "-mal gequakt.");
	}

	/**
	 * Simuliert das quaken einer Ente
	 * 
	 * @param ente
	 *            die Ente die quaken soll
	 */
	void simulieren(Quakfaehig ente) {
		ente.quaken();
	}
}
