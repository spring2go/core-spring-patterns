package io.spring2go.corespring;

//ConcreteHandler
public class ProjectLeader implements ApproveHandler {

	private ApproveHandler nextHandler;
	
	public final static int MAX_LEAVES_CAN_APPROVE = 20;

	public void setNextHandler(ApproveHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void approve(Leave leave) {
		if (leave.getNumberOfDays() < MAX_LEAVES_CAN_APPROVE) {
			String output = String.format(
					"LeaveId: %d, Days: %d, Approver: %s", 
					leave.getLeaveId(), 
					leave.getNumberOfDays(), 
					"ProjectLeader");
			System.out.println(output);
		} else {
			if (nextHandler != null) {
				nextHandler.approve(leave);
			}
		}
	}
}
