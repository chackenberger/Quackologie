package at.hm.sew.quackologie;

public class QuakZaehler implements Quakfaehig {
	Quakfaehig ente;
	static int anzahlDerQuaks;
  
	public QuakZaehler(Quakfaehig ente) {
		this.ente = ente;
	}
  
	public void quaken() {
		ente.quaken();
		anzahlDerQuaks++;
	}
 
	public static int getQuaks() {
		return anzahlDerQuaks;
	}
	
	/**
	 * Added method for testing to reset the Quak counter
	 */
	public static void resetQuaks() {
		anzahlDerQuaks = 0;
	}
 
	public void registriereBeobachter(Beobachter beobachter) {
		ente.registriereBeobachter(beobachter);
	}
 
	public void benachrichtigeBeobachtende() {
		ente.benachrichtigeBeobachtende();
	}
   
	public String toString() {
		return ente.toString();
	}
}
