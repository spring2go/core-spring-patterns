package io.spring2go.corespring;

// Proxy
public class FolderProxy implements IFolder {
	
	Folder folder;
	User user;
	
	public FolderProxy(User user) {
		this.user = user;
	}

	public void performOperations() {
		if (user.getUserName().equalsIgnoreCase("bobo") && 
			user.getPassword().equalsIgnoreCase("xyz")) {
			folder = new Folder();
			folder.performOperations();
		} else {
			System.out.println("You don't have access to this folder");
		}
	}

}
