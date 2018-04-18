package io.spring2go.corespring.bridge.implementation_change;

public class WindowsFileDownloadImplementor implements FileDownloadImplementor
{
    @Override
    public Object downloadFile(String path) {
        return new Object();
    }
 
    @Override
    public boolean storeFile(Object object) {
        System.out.println("File downloaded successfully in LINUX !!");
        return true;
    }
 
    @Override
    public boolean delete(String object) {
        return false;
    }
}