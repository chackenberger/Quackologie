package at.hm.sew.quackologie;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
