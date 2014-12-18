package at.hm.sew.quackologie.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import at.hm.sew.quackologie.AbstrakteEntenFabrik;
import at.hm.sew.quackologie.ZaehlendeEntenFabrik;

public class TestZaehlendeEntenfabrik {

	AbstrakteEntenFabrik ef;
	private ByteArrayOutputStream baos;
	
	@Before
	public void before() {
		ef = new ZaehlendeEntenFabrik();
		baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		System.setOut(ps);
	}
	
	@Test
	public void testErzeugeStockEnte() {
		ef.erzeugeStockEnte().quaken();
		assertEquals("Quak\n", baos.toString());
	}
	
	@Test
	public void testErzeugeMoorEnte() {
		ef.erzeugeMoorEnte().quaken();
		assertEquals("Quak\n", baos.toString());
	}
	
	@Test
	public void testErzeugeLockPfeife() {
		ef.erzeugeLockPfeife().quaken();
		assertEquals("Kwaak\n", baos.toString());
	}
	
	@Test
	public void testErzeugeGummiEnte() {
		ef.erzeugeGummiEnte().quaken();
		assertEquals("Quietsch\n", baos.toString());
	}
}
