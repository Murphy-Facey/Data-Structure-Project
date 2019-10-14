
public class ProcessedQueue {
	private ProcessedNode front;
	private ProcessedNode rear;
	
	public ProcessedQueue() {
		this.front = null;
		this.rear = null;
	}
	
	public void enQueue(Request data) {
		ProcessedNode temp = new ProcessedNode(data);
		if(rear == null) {
			rear = front = temp;
			return;
		}
		
		rear.setNext(temp);
		rear = temp;
	}
	
	public Request dequeue() 
    { 
        // If queue is empty, return NULL. 
        if (this.front == null) 
            return null; 
  
        // Store previous front and move front one node ahead 
        ProcessedNode temp = this.front; 
        this.front = this.front.getNext(); 
  
        // If front becomes NULL, then change rear also as NULL 
        if (this.front == null) 
            this.rear = null; 
        return temp.getData(); 
    } 
	
}
