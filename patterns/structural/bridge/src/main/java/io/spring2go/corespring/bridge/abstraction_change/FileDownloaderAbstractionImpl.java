package io.spring2go.corespring.bridge.abstraction_change;

import io.spring2go.corespring.bridge.FileDownloadImplementor;
import io.spring2go.corespring.bridge.abstraction_change.FileDownloaderAbstraction;

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
	public boolean store(Object object) {
		return provider.storeFile(object);
	}

	@Override
	public boolean delete(String object) {
		return false;
	}

}
