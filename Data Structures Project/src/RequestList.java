
public class RequestList {
	private RequestNode top;
	
	public RequestList() {
		top = null;
	}
	
	
	// Utility function to add an element x in the stack 
    @SuppressWarnings("unused")
	public void push(Request data) // insert at the beginning 
    { 
        // create new node temp and allocate memory 
        RequestNode temp = new RequestNode(); 
  
        // check if stack (heap) is full. Then inserting an 
        //  element would lead to stack overflow 
        
        if (temp == null) { 
            System.out.print("\nHeap Overflow"); 
            return; 
        } 
  
        // initialize data into temp data field 
        temp.setData(data); 
  
        // put top reference into temp link 
        temp.setLink(top); 
  
        // update top reference 
        top = temp; 
    } 
  
    // Utility function to check if the stack is empty or not 
    public boolean isEmpty() 
    { 
        return top == null; 
    } 
  
    // Utility function to return top element in a stack 
    public Request peek() 
    { 
        // check for empty stack 
        if (!isEmpty()) { 
            return top.getData(); 
        } 
        else { 
            System.out.println("Stack is empty"); 
            return null; 
        } 
    } 
  
    // Utility function to pop top element from the stack 
    public Request pop() // remove at the beginning 
    { 
    	Request data = null;
        // check for stack underflow 
        if (top == null) { 
            System.out.print("\nStack Underflow"); 
            return data; 
        } 
  
        // update the top pointer to point to the next node 
        data = (top).getData();
        top = (top).getLink(); 
        return data;
    } 
  
    public void display() 
    { 
        // check for stack underflow 
        if (top == null) { 
            System.out.printf("\nStack Underflow"); 
        } 
        else { 
            RequestNode temp = top; 
            while (temp != null) { 
  
                // print node data 
                //System.out.println(temp.getData()); 
            	temp.getData().display();
                // assign temp link to temp 
                temp = temp.getLink(); 
            } 
        } 
    } 
}
