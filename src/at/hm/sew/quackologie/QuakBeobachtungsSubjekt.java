package at.hm.sew.quackologie;

/**
 * source: http://examples.oreilly.de/german_examples/hfdesignpatger/
 * 
 * Sollte von einer Klasse implementiert werden, die beobachtet werden will.
 * 
 * @author Christoph Hackenberger, Patrick Malik
 * @version 141218
 */
public interface QuakBeobachtungsSubjekt {

	/**
	 * Registriert Beobachter um diese später benachrichtigen zu können
	 * 
	 * @param beobachter
	 *            der hinzuzufügende Beobachter
	 */
	public void registriereBeobachter(Beobachter beobachter);

	/**
	 * Benachrichtigt alle registrierten Beobachter.
	 */
	public void benachrichtigeBeobachtende();
}
