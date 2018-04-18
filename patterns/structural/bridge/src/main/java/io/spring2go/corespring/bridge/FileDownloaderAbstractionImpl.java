package io.spring2go.corespring.bridge;

// RefinedAbstraction
public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction {
	private FileDownloadImplementor provider = null;
	
	public FileDownloaderAbstractionImpl(FileDownloadImplementor provider) {
		super();
		this.provider = provider;
	}
	
	@Override
	public Object download(String path) {
		return provider.downloadFile(path);
	}

	@Override
	public boolean store(Object path) {
		return provider.storeFile(path);
	}
}
