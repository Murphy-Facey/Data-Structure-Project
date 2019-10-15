package project;

public class ProcessedNode {
	
	private Request data;
	private ProcessedNode next;
	
	public ProcessedNode(Request data) {
		this(data, null);
	}
	
	public ProcessedNode(Request data, ProcessedNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Request getData() {
		return data;
	}

	public void setData(Request data) {
		this.data = data;
	}

	public ProcessedNode getNext() {
		return next;
	}

	public void setNext(ProcessedNode next) {
		this.next = next;
	}
	
	
	
}
