package at.hm.sew.quackologie;

/**
 * Sollte von einer Klasse implementiert werden, die bei aktualisierung einer
 * Ente benachrichtigt werden will.
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public interface Beobachter {

	/**
	 * Führt eine Aktion aus, wenn ente aktualisiert (bspw. quakt)
	 * 
	 * @param ente
	 *            das Entenobjekt das überwacht wird.
	 */
	public void aktualisieren(QuakBeobachtungsSubjekt ente);
}
