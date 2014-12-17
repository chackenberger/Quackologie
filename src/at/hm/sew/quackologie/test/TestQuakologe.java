package at.hm.sew.quackologie.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import at.hm.sew.quackologie.AbstrakteEntenFabrik;
import at.hm.sew.quackologie.Entenfabrik;
import at.hm.sew.quackologie.Gans;
import at.hm.sew.quackologie.GansAdapter;
import at.hm.sew.quackologie.Quakologe;
import at.hm.sew.quackologie.Schar;

public class TestQuakologe {

	private Quakologe q;
	private ByteArrayOutputStream baos;
	private AbstrakteEntenFabrik ef;
	
	@Before
	public void before() {
		q = new Quakologe();
		ef = new Entenfabrik();
		
		baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
	}

	@Test
	public void testQuakologeMitSchar() {
		Schar entenSchar = new Schar();
		entenSchar.hinzufuegen(ef.erzeugeGummiEnte());
		entenSchar.hinzufuegen(ef.erzeugeLockPfeife());
		entenSchar.hinzufuegen(ef.erzeugeMoorEnte());
		entenSchar.hinzufuegen(ef.erzeugeStockEnte());
		entenSchar.hinzufuegen(new GansAdapter(new Gans()));
		
		entenSchar.registriereBeobachter(q);
		entenSchar.quaken();
		assertEquals("Quietsch\nQuakologe: Gummiente hat gerade gequakt.\n"
				+ "Kwaak\nQuakologe: Lockpfeife hat gerade gequakt.\n"
				+ "Quak\nQuakologe: Moorente hat gerade gequakt.\n"
				+ "Quak\nQuakologe: Stockente hat gerade gequakt.\n"
				+ "Schnatter\nQuakologe: sich als Ente ausgebende Gans hat gerade gequakt.\n", baos.toString());
	}
	
	@Test
	public void testToString() {
		assertEquals("Quakologe", q.toString());
	}
}
