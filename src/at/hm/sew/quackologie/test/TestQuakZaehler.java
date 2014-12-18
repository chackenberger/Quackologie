package at.hm.sew.quackologie.test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import at.hm.sew.quackologie.Beobachter;
import at.hm.sew.quackologie.QuakBeobachtungsSubjekt;
import at.hm.sew.quackologie.QuakZaehler;
import at.hm.sew.quackologie.Quakfaehig;
import at.hm.sew.quackologie.ZaehlendeEntenFabrik;

public class TestQuakZaehler {

	private ZaehlendeEntenFabrik zf;
	
	@Before
	public void before() {
		zf = new ZaehlendeEntenFabrik();
		QuakZaehler.resetQuaks();
	}

	@Test
	public void testZaehlerMit0Quaks() {
		assertEquals(0, QuakZaehler.getQuaks());
	}
	
	@Test
	public void testZaehlerMitZufallsZahl() throws Exception{
		int rand = new Random().nextInt(9999);
		Quakfaehig q = zf.erzeugeStockEnte();
		for(int i = 0; i < rand; i++)
			q.quaken();
		assertEquals(rand, QuakZaehler.getQuaks());
	}
	
	@Test
	public void testZaehlerMitThreads() throws Exception {
		int rand1 = new Random().nextInt(9999);
		int rand2 = new Random().nextInt(9999);
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Quakfaehig q = zf.erzeugeStockEnte();
				for(int i = 0; i < rand1; i++)
					q.quaken();
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Quakfaehig q = zf.erzeugeStockEnte();
				for(int i = 0; i < rand2; i++)
					q.quaken();
				
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		assertEquals(rand1+rand2, QuakZaehler.getQuaks());
	}
	
	@Test
	public void testQuakZaehlerBeobachter() {
		Quakfaehig e = zf.erzeugeLockPfeife();
		Beobachter b = new Beobachter() {
			
			@Override
			public void aktualisieren(QuakBeobachtungsSubjekt ente) {
				assertEquals(e.toString(), ente.toString());
				
			}
		};
		e.registriereBeobachter(b);
		e.quaken();
	}
	
	@After
	public void after() {
		QuakZaehler.resetQuaks();
	}
}
