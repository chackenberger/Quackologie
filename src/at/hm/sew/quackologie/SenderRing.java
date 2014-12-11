package at.hm.sew.quackologie;

import java.util.Iterator;
import java.util.ArrayList;

public class SenderRing implements QuakBeobachtungsSubjekt {
	ArrayList<Beobachter> beobachtende = new ArrayList<Beobachter>();
	QuakBeobachtungsSubjekt ente;
 
	public SenderRing(QuakBeobachtungsSubjekt ente) {
		this.ente = ente;
	}
  
	public void registriereBeobachter(Beobachter beobachter) {
		beobachtende.add(beobachter);
	}
  
	public void benachrichtigeBeobachtende() {
		Iterator<Beobachter> iterator = beobachtende.iterator();
		while (iterator.hasNext()) {
			Beobachter beobachter = (Beobachter)iterator.next();
			beobachter.aktualisieren(ente);
		}
	}
 
	public Iterator<Beobachter> getBeobachtende() {
		return beobachtende.iterator();
	}
}