package io.spring2go.patterns.observer;

import java.util.ArrayList;
import java.util.List;

// We Chat Official Account
public class OfficialAccount implements Subject {
	
	// Name of the official account
	private String oaName;
	// List of followers
	private List<Observer> followers;

	public OfficialAccount(String oaName) {
		this.oaName = oaName;
		followers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer o) {
		followers.add(o);
		System.out.println(o + " has started following " + oaName);
	}

	@Override
	public void unregister(Observer o) {
		followers.remove(o);
		System.out.println(o + " has stopped following " + oaName);
	}

	@Override
	public void notifyAllObservers(String article) {
		for(Observer follower : followers) {
			follower.update(oaName, article);
		}
		System.out.println();
	}
	
	public void pushArticle(String article) {
		System.out.println("\n" + oaName + " has pushed :: " + article);
		notifyAllObservers(article);
	}

}
