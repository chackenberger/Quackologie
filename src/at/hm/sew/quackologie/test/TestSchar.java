package at.hm.sew.quackologie.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import at.hm.sew.quackologie.AbstrakteEntenFabrik;
import at.hm.sew.quackologie.Entenfabrik;
import at.hm.sew.quackologie.Schar;

public class TestSchar {

	private Schar es;
	private AbstrakteEntenFabrik ef;
	private ByteArrayOutputStream baos;
	
	@Before
	public void before() {
		es = new Schar();
		ef = new Entenfabrik();
		
		baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
	}

	@Test
	public void testQuaken() {
		es.hinzufuegen(ef.erzeugeGummiEnte());
		es.hinzufuegen(ef.erzeugeLockPfeife());
		es.hinzufuegen(ef.erzeugeMoorEnte());
		es.hinzufuegen(ef.erzeugeStockEnte());
		
		es.quaken();
		
		assertEquals("Quietsch\nKwaak\nQuak\nQuak\n", baos.toString());
	}
	
	
}
