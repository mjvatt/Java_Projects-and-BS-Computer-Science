//import jeliot.io.*;

public class Stacks {

	// Establish required variables
	private int stack_size;
	private static int[] my_stack;
	private static int top_element;
	
	public Stacks(int size) {
		
		// Initialize variables
		stack_size=size;
		my_stack=new int[stack_size];
		top_element=-1;
		
	}
	
	// Create the main algorithm
	public static void main(String[] args) {
		
		Stacks manufacturing_stack=new Stacks(3);
		
		for(int i=manufacturing_stack.stack_size-1; i>=0; i--) {
			manufacturing_stack.push(i);
		}
		
		while(!manufacturing_stack.empty()) {
			int element=manufacturing_stack.pop();
			System.out.println(element);
		}
	}
	
	// Add elements to the stack
	public void push(int x) {
		
		my_stack[++top_element]=x;
		
	}

	// Remove elements from the stack
	public int pop() {
		
		return my_stack[top_element--];
		
	}
	
	// Check to see if the stack is empty
	public boolean empty() {
		
		return top_element==-1;
		
	}
	
	// Check to see if the stack is full
	public boolean full() {
		
		return top_element==stack_size-1;
		
	}
	
	// Let's check to see what the top_element value is
	public int last_element() {
		
		return my_stack[top_element];
		
	}
	
}
