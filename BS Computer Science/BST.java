import java.util.Scanner;

public class BST {

	int value = 0; 
	BST root = null;
	BST left_child;
	BST right_child;
	int steps = 0;
	
	public BST(int node) {

		this.value = node;
		this.left_child = null;
		this.right_child = null;
	}
	
	public void Add(int x) {
		
		if (root == null) {
			
			root = new BST(x);
			
		} else {
			
			newNode(root, x); 
			
		}
		
	}
	
	public void newNode(BST current_node, int x) {
		
		if (x < current_node.value) {
			
			if (current_node.left_child == null) {
				
				current_node.left_child = new BST(x);
				
			} else {
				
				newNode(current_node.left_child, x);
				
			}
			
		} else {
			
			if (current_node.right_child == null) { 
				
				current_node.right_child = new BST(x);
				
			} else {
				
				newNode(current_node.right_child, x); 
				
			}
			
		}
		
	}
	
	public int FindValue(int x) {
		
		BST current_node = root;
		
		if (root == null) {
			
			return 0;
			
		}
		
		if (root.value == x) {
			
			return 1;
			
		}
		
		while (current_node != null) { 
			
			steps++;
			
			if (current_node.value < x) {
				
				current_node = current_node.right_child;
				
			} else if (current_node. value > x) {
				
				current_node = current_node.left_child;
			} else {
				
				return steps;
				
			}
			
			return -1;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		int bst_length = 0;
		int bst_input = 0;
		int bst_search_value = 0;
		int steps_taken = 0;
		
		System.out.println("How many integers would you like to add to the binary search tree? ");
		bst_length = user_input.nextInt();
		BST user_tree = new BST(bst_length);
		
		int i;
		for (i = 0; i < bst_length; i++) {
			
			System.out.println("Please enter an integer: ");
			bst_input = user_input.nextInt();
			user_tree.Add(bst_input); // Can I combine the line above and this one
			
		}
		
		System.out.println("What value would you like to search for? ");
		bst_search_value = user_input.nextInt();
		steps_taken = user_tree.FindValue(bst_search_value);
		
		if (steps_taken != 0) {
			
			System.out.println("Value found in " + steps_taken + " steps!");
			
		} else {
			
			System.out.println("Value not found, so sorry.");
			
		}
		
		user_input.close();
	}
	
}
