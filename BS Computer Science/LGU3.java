public class LGU3 {
	
	public static void main(String[] args) {
	    
	      root = null;  
	         
	      for (int i = 0; i < 1023; i++) {
	    	  
	          treeInsert(Math.random()); 
	          
	      }
	               
	      int leafCount = countLeaves(root);
	      int depthSum = sumDepth(root, 0);
	      int depthMax = maxDepth(root, 0);
	      double averageDepth = ((double)depthSum) / leafCount;
	         
	      System.out.println("Total number of leaves: " + leafCount);
	      System.out.println("The average depth of leaves: " + averageDepth);
	      System.out.println("The maximum depth of leaves: " + depthMax);
	
	}

	private static TreeNode root; 

	private static class TreeNode {
	   
		double item;      
		TreeNode left;    
		TreeNode right;   
		TreeNode(double n) {
	    	   
	    	   item = n;
	          
	       }
       
	}

	private static void treeInsert(double n) {
	   
		if (root == null) {
	    	  
			root = new TreeNode(n);
			return;
	          
		}
      
		TreeNode runner; 
		runner = root;   
       
			while (true) {
	    	   
				if (n < runner.item) {
                   
					if (runner.left == null) {
						
						runner.left = new TreeNode(n);
						return;  
                
					} else {
            	 
						runner = runner.left;
					}
             
				} else {
                   
					if (runner.right == null) {
            	 
						runner.right = new TreeNode(n);
						return;  
                
					} else {
            	 
						runner = runner.right;
             
					}
             
				}
          
			}
       
		} 

	static int countLeaves(TreeNode tree) {
		
		if (tree == null) {
	          
			return 0;
	       
		} else if (tree.left == null && tree.right == null) {
	    	   
			return 1; 
	       
		} else {
	        
			return countLeaves(tree.left) + countLeaves(tree.right);
	       
		}
	} 
   
	static int sumDepth(TreeNode tree, int depth) {
       
		if (tree == null) {

			return 0;
          
		} else if ( tree.left == null && tree.right == null) {
             
			return depth;

		} else {
             
			return sumDepth(tree.left, depth + 1) + sumDepth(tree.right, depth + 1);
          
		}
       
	} 
   
	static int maxDepth(TreeNode tree, int depth) {
	   
		if (tree == null) {
    	   
			return 0;
            
		} else if (tree.left == null && tree.right == null) {
            
			return depth;
       
		} else {
             
			int leftMax = maxDepth(tree.left, depth + 1);
			int rightMax =  maxDepth(tree.right, depth + 1);
          
			if (leftMax > rightMax) {

				return leftMax;
          
			} else {
          
				return rightMax;
        	  
			}
       
		}
   
	} 
   
} 