package at.hm.sew.quackologie.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import at.hm.sew.quackologie.AbstrakteEntenFabrik;
import at.hm.sew.quackologie.Entenfabrik;
import at.hm.sew.quackologie.GummiEnte;
import at.hm.sew.quackologie.LockPfeife;
import at.hm.sew.quackologie.MoorEnte;
import at.hm.sew.quackologie.StockEnte;

public class TestEntenfabrik {

	AbstrakteEntenFabrik ef;
	
	@Before
	public void before() {
		ef = new Entenfabrik();
	}
	
	@Test
	public void testErzeugeStockEnte() {
		assertEquals(true, ef.erzeugeStockEnte() instanceof StockEnte);
	}
	
	@Test
	public void testErzeugeMoorEnte() {
		assertEquals(true, ef.erzeugeMoorEnte() instanceof MoorEnte);
	}
	
	@Test
	public void testErzeugeLockPfeife() {
		assertEquals(true, ef.erzeugeLockPfeife() instanceof LockPfeife);
	}
	
	@Test
	public void testErzeugeGummiEnte() {
		assertEquals(true, ef.erzeugeGummiEnte() instanceof GummiEnte);
	}
}
