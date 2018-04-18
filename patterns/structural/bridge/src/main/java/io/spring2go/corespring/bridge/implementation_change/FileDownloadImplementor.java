package io.spring2go.corespring.bridge.implementation_change;

public interface FileDownloadImplementor {
	public Object downloadFile(String path);

	public boolean storeFile(Object object);

	// 增加接口
	public boolean delete(String object);
}