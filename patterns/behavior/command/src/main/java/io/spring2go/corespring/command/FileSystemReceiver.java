package io.spring2go.corespring.command;

// Receiver Interface
public interface FileSystemReceiver {
	void openFile();
	void writeFile();
	void closeFile();
}
