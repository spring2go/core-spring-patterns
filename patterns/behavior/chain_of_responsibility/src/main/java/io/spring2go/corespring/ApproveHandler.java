package io.spring2go.corespring;

// Handler
public interface ApproveHandler {
	
	public void setNextHandler(ApproveHandler nextHandler);
	
	public void approve(Leave leave);
	
}
