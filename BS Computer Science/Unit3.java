// main function to implement the manufacturing line from the
// assignment instructions
public class Unit3{
    public static void main(String[] args) {
        // create a stack object called assembly
        stack assembly = new stack(); 
    
        // push the three integers indicated in the assignment instructions    
        assembly.push(2);
        assembly.push(1);
        assembly.push(0);
        
           // pop the top value three times, correlating to the three inspections
            System.out.println(assembly.pop());
            System.out.println(assembly.pop());
           System.out.println(assembly.pop());
    }
}
// a class implementing the stack type
    // a class to implemenet the node structure
         class Node{
        Node next;
        int value;
    }
class stack {
    // global top variable
    Node top;
    
    // constructor to create an empty stack
    stack() {
        this.top = null;
    }
    
    // method to push a value
    public void push(int value){
        // create a new node for the new element
        Node temp = new Node();
        // assign the value to the value field in the new node
        temp.value = value;
        // assign the next field to be the previously top element
        temp.next = top;
        // assign the new top element as the current top element
        top = temp;
    }
    
    // method to pop the top value from the stack
    public int pop(){
        // check if the stack is empty
        if(top == null){
            System.out.println("Stack is empty");
        }
        // set a result integer to the value of the top element
        int result = top.value;
        // set the new top node to the node stored in the next variable
        top = top.next;
        // return the value of the popped node
        return result;
    }
}