package io.spring2go.patterns.observer;

public class ObserverPatternMain {

	public static void main(String[] args) {
		OfficialAccount bobo = new OfficialAccount("bobo");
		OfficialAccount infoq = new OfficialAccount("infoq");
		
		Follower mark = new Follower("Mark");
		Follower eric = new Follower("Eric");
		Follower jack = new Follower("Jack");
		Follower frank = new Follower("Frank");
		Follower daniel = new Follower("Daniel");
		Follower alice = new Follower("Alice");
		
		bobo.register(mark);
		bobo.register(eric);
		bobo.register(jack);
		
		infoq.register(frank);
		infoq.register(daniel);
		infoq.register(alice);
		
		bobo.pushArticle("observer design pattern video course");
		infoq.pushArticle("spring 5.0 is out");

		bobo.unregister(eric);
		
		bobo.pushArticle("core java course is released");
	}

}
