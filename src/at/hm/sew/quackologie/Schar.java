package at.hm.sew.quackologie;

import java.util.Iterator;
import java.util.ArrayList;

public class Schar implements Quakfaehig {
	ArrayList<Quakfaehig> quakende = new ArrayList<Quakfaehig>();
  
	public void hinzufuegen(Quakfaehig quaker) {
		quakende.add(quaker);
	}
  
	public void quaken() {
		Iterator<Quakfaehig> iterator = quakende.iterator();
		while (iterator.hasNext()) {
			Quakfaehig quaker = (Quakfaehig)iterator.next();
			quaker.quaken();
		}
	}
   
	public void registriereBeobachter(Beobachter beobachter) {
		Iterator<Quakfaehig> iterator = quakende.iterator();
		while (iterator.hasNext()) {
			Quakfaehig quaker = (Quakfaehig)iterator.next();
			quaker.registriereBeobachter(beobachter);
		}
	}
  
	public void benachrichtigeBeobachtende() { }
  
	public String toString() {
		return "Entenschar";
	}
}
