import java.io.File;
import java.util.Scanner;

/**
 * This program lists the files in a directory specified by
 * the user.  The user is asked to type in a directory name.
 * If the name entered by the user is not a directory, a
 * message is printed and the program ends.
 */
public class DirectoryList {


    @SuppressWarnings("resource")
	public static void main(String[] args) {
	
	      String directoryName;  // Directory name entered by the user.
	      File directory;        // File object referring to the directory. 
	      Scanner scanner;       // For reading a line of input from the user.
	
	      scanner = new Scanner(System.in);  // scanner reads from standard input.
	
	      System.out.print("Enter a directory name: ");
	      directoryName = scanner.nextLine().trim();
	      directory = new File(directoryName);
	
	      if (directory.isDirectory() == false) {
	    	  
	         if (directory.exists() == false) {
	            
	        	 System.out.println("There is no such directory!");
	         
	         } else {
	            
	        	 System.out.println("That file is not a directory.");
	         }
	         
	      }
	         
	      else {
	
	       	 listAll(directory, directoryName); 
	       	 
	      } 
	      
    } // end main()
   
   private static void listAll(File  dir, String fileName) {
	   
	   String[] files;        // Array of file names in the directory.
	   files = dir.list();
       
	   System.out.println("Files in directory \"" + dir + "\":");
       
       for (int i = 0; i < files.length; i++) {
    	   
    	   File file = new File(dir, files[i]);
    	   if(file.isDirectory()) {
    		   listAll(file, fileName);
    	   } else {
    		   
    		   System.out.println("   " + files[i]);
    	   
    	   }
       }
   }

} // end class DirectoryList
