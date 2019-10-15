package project;
import java.io.Serializable;

public class LinkedListNode implements Serializable {
	private static final long serialVersionUID = 1L;
	private Place data;
	private LinkedListNode next;
	
	public LinkedListNode() {
		this(null, null);
	}
	
	public LinkedListNode(Place data) {
		this(data, null);
	}
	
	public LinkedListNode(Place data, LinkedListNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Place getData() {
		return data;
	}

	public void setData(Place data) {
		this.data = data;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}	
}
