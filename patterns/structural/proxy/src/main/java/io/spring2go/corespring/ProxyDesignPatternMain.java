package io.spring2go.corespring;

// ¿Í»§¶Ë
public class ProxyDesignPatternMain {

	public static void main(String[] args) {
		// When you click on folder, Let's say a GUI form will ask for 
		// usesrName and password.
		// and this GUI will create this user object
		
		// If we give correct userName and password
		User user = new User("bobo", "xyz");
		FolderProxy folderProxy = new FolderProxy(user);
		System.out.println("When userName and password are correct:");
		folderProxy.performOperations();
		System.out.println("**************************************");
		// if we give wrong userName and Password
		User userWrong = new User("abc", "abc");
		FolderProxy folderProxyWrong = new FolderProxy(userWrong);
		System.out.println("When userName and password are incorrect");
		folderProxyWrong.performOperations();
	}

}
