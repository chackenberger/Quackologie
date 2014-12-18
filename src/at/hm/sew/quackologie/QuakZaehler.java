package at.hm.sew.quackologie;

import java.util.concurrent.atomic.AtomicInteger;

public class QuakZaehler implements Quakfaehig {
	Quakfaehig ente;
	static AtomicInteger anzahlDerQuaks = new AtomicInteger();
  
	public QuakZaehler(Quakfaehig ente) {
		this.ente = ente;
	}
  
	public void quaken() {
		ente.quaken();
		anzahlDerQuaks.incrementAndGet();
	}
 
	public static int getQuaks() {
		return anzahlDerQuaks.get();
	}
	
	/**
	 * Added method for testing to reset the Quak counter
	 */
	public static void resetQuaks() {
		anzahlDerQuaks.set(0); 
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
