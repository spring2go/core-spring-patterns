package io.spring2go.corespring.command;

// Invoker
public class FileInvoker {

	private Command command;
	
	public FileInvoker(Command c) {
		this.command = c;
	}
	
	public void execute() {
		this.command.execute();
	}
}
