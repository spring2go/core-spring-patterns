package io.spring2go.corespring;

// ConcreteHandler
public class TeamLeader implements ApproveHandler {
	
	private ApproveHandler nextHandler;
	
	public final static int MAX_LEAVES_CAN_APPROVE = 10;

	public void setNextHandler(ApproveHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void approve(Leave leave) {
		if (leave.getNumberOfDays() < MAX_LEAVES_CAN_APPROVE) {
			String output = String.format(
					"LeaveId: %d, Days: %d, Approver: %s", 
					leave.getLeaveId(), 
					leave.getNumberOfDays(), 
					"TeamLeader");
			System.out.println(output);
		} else {
			if (nextHandler != null) {
				nextHandler.approve(leave);
			}
		}
	}
}
