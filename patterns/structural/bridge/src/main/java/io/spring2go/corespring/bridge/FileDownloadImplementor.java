package io.spring2go.corespring.bridge;

// Implementor
public interface FileDownloadImplementor {
	
	public Object downloadFile(String path);
	
	public boolean storeFile(Object object);
	
}
