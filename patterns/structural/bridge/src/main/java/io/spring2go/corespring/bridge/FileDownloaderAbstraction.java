package io.spring2go.corespring.bridge;

// Abstraction
public interface FileDownloaderAbstraction {
	
	public Object download(String path);
	
	public boolean store(Object object);
}
