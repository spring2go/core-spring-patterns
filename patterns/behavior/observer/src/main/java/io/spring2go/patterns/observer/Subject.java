package io.spring2go.patterns.observer;

// interface for adding, deleting 
// and updating all observers
public interface Subject {
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyAllObservers(String s);
}
