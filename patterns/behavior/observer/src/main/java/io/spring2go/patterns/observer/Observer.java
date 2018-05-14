package io.spring2go.patterns.observer;

// The Observers are notified when the Subject changes
public interface Observer {
	
	public void update(String name, String s);
	
}
