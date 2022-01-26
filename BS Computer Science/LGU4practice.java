import java.util.TreeSet;


public class LGU4practice {
	
	static char ch;

	public static void main(String[] args) {

		System.out.println("This program will take two sets of integers and compute the union, intersection, and difference of the sets.");
		System.out.println("");
		System.out.println("Enter both sets - (press return to end)");	
		System.out.println("");
		System.out.println("Example: [1,2,3]+[4,5,6]");
		System.out.println("");
		System.out.println("? ");

		while (true) {

			TextIO.skipBlanks();
			if (TextIO.peek() == '\n') {
     
				break;
 
			}
			try {
	 
				setCalculator(); // Reads and processes one line of input.
 
			}
			catch (IllegalArgumentException e) {

				System.out.println("Input error: " + e.getMessage());
				System.out.print("Discarding input: ");
 
			}
			do {  
	 
				ch = TextIO.getAnyChar();
				System.out.print(ch);
 
			} while (ch != '\n');
      
		}

	}

   private static TreeSet<Integer> readInput() {

      TreeSet<Integer> set = new TreeSet<Integer>();  


      TextIO.skipBlanks();
      if (TextIO.peek() != '[') {
    	  
         throw new IllegalArgumentException("Expected '[' at start of set.");
         
      }
      
      TextIO.getAnyChar();

      TextIO.skipBlanks();
      if (TextIO.peek() == ']') {
            
         TextIO.getAnyChar(); 
         return set;
         
      }

      while (true) {
            
          
         TextIO.skipBlanks();
         if (! Character.isDigit(TextIO.peek())) {
        	 
            throw new IllegalArgumentException("Expected an integer.");
            
         }
         
         int n = TextIO.getInt();
         set.add(new Integer(n));
         TextIO.skipBlanks();
         
         if (TextIO.peek() == ']') {
        	 
            break;  
            
         } else if (TextIO.peek() == ',') {
        	 
            TextIO.getAnyChar();
            
         } else {
        	 
            throw new IllegalArgumentException("Expected ',' or ']'.");
            
         }
         
      }

      TextIO.getAnyChar(); // Read the ']' that ended the set.

      return set;

   } 
   
   private static void setCalculator() {

	      TreeSet<Integer> first;
	      TreeSet<Integer> second;
	      char operator;              

	      first = readInput(); 

	      TextIO.skipBlanks();
	      if (TextIO.peek() != '*' && TextIO.peek() != '+' && TextIO.peek() != '-') {
	    	  
	         throw new IllegalArgumentException("Expected *, +, or  - after first set.");
	         
	      }
	      
	      operator = TextIO.getAnyChar(); 

	      second = readInput(); 

	      TextIO.skipBlanks();
	      if (TextIO.peek() != '\n') {
	    	  
	         throw new IllegalArgumentException("Extra unexpected input.");
	         
	      }

		    if(operator == '+') {
				  
		    	first.addAll(second);
			  
		    } else if(operator == '-') {
		    	  
		    	first.retainAll(second);
		    	  
		    } else {
		   	 
		    	first.removeAll(second);
		    	  
		    }
	      
	      System.out.print("Value:  " + first);

	   } 

} 