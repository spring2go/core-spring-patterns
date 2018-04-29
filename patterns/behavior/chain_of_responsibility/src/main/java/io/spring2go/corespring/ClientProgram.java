package io.spring2go.corespring;

// Client
public class ClientProgram {

	public static void main(String[] args) {
		TeamLeader tl = new TeamLeader();
		ProjectLeader pl = new ProjectLeader();
		HR hr = new HR();
		
		tl.setNextHandler(pl);
		pl.setNextHandler(hr);
		
		
		tl.approve(new Leave(1, 5));
		tl.approve(new Leave(2, 15));
		tl.approve(new Leave(3, 25));
		tl.approve(new Leave(4, 35));

	}

}
