package io.spring2go.corespring.stack;

public class StackException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public StackException(String name) {
		super(name);
	}

	public StackException() {
		super();
	}

}
