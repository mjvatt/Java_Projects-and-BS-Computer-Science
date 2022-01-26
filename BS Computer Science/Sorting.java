// CS 1103 - Unit 1 Lab 1
// Date: 17 NOV 2020

import java.util.Random;
import java.util.Arrays;

/* The results of this program were as follows:
 * An array of size 1000 took 0.001 seconds to sort via selection sort.
 * An array of size 1000 took 0.001 seconds to sort via Arrays.sort() method.
 * An array of size 10000 took 0.031 seconds to sort via selection sort.
 * An array of size 10000 took 0.001 seconds to sort via Arrays.sort() method.
 * An array of size 100000 took 1.779 seconds to sort via selection sort.
 * An array of size 100000 took 0.003 seconds to sort via Arrays.sort() method.
 * An array of size 1000000 took 179.561 seconds to sort via selection sort.
 * An array of size 1000000 took 0.008 seconds to sort via Arrays.sort() method.
 */

public class Sorting {

	private static int c; // Creating the constant to determine array size
	private static int[] testSizes = {1000, 10000, 100000}; // Values for array sizes to test
	private static double[] time = new double[3]; // Calculate time spent via selection sort
	private static double[] newTime = new double[3]; // Calculate time spent via Arrays.sort()
	
	public static void main(String[] args) {
		
		// for loop to build arrays of random ints 
		for(int t = 0; t < 3; t++) {
			
			Random generator = new Random();
			int i = 0;
			int j = 0;
			c = testSizes[t]; // Determines the size of the array
			int[] one = new int[c]; // Builds the size of the array
			int[] two = new int[c]; // Builds the size of the array
			for(i = 0; i < testSizes[j]; i++) {
				one[i] = generator.nextInt(999999); // Randomly fills values into the first array
			}
	
			two[t] = one[t]; // ensures second array has the same data as the first
		
			long startTime = System.currentTimeMillis(); // Stars the timer for selection sort
			selectionSort(one); // Performs selection sort
			long runTime = System.currentTimeMillis() - startTime; // Ends the timer for selection sort and calculates overall runtime
			double rt = runTime/1000.0; // Calculates runtime in seconds
			time[t] = rt; // Places runtime per testSize into a time[] array for good output and comparison
			
			long newStartTime = System.currentTimeMillis(); // Stars the timer for Arrays.sort 
			Arrays.sort(two); // Performs Arrays.sort() method
			long newRunTime = System.currentTimeMillis() - newStartTime; // Ends the timer for Arrays.sort and calculates overall runtime
			double newRT = newRunTime/1000.0; // Calculates runtime in seconds
			newTime[t] = newRT; // Places runtime per testSize into a newTime[] array for good output and comparison
				
		}
		
		// for loop will output comparison between all testSizes and sorting methods (e.g., selection sort and Arrays.sort())
		for(int i = 0; i < 3; i++) {
			String printOut = "An array of size " + testSizes[i] + " took " + time[i] + 
					" seconds to sort via selection sort.";
			System.out.println(printOut);
			String newPrintOut = "An array of size " + testSizes[i] + " took " + newTime[i] + 
					" seconds to sort via Arrays.sort() method.";
			System.out.println(newPrintOut);
	
		}
	}
	
	// This performs the selection sort method
	static void selectionSort(int[] a) {
		// Sort "a" into increasing order, using selection sort
		
		for(int lastPlace = a.length-1; lastPlace > 0; lastPlace--) {
			// Find the largest item among a[0]....a[i]
			// a[lastPlace], and move it into position lastPlace
			// by swapping it with the number that is currently in position lastPlace.
			
			int maxLoc = 0; // Location of largest item seen so far
			for(int i = 0; i <= lastPlace; i++) {
				if(a[i] > a[maxLoc]) {
					// Since a[i] is bigger than the max we've seen so far
					// i is the new location of the max value
					maxLoc = i;
				}
			}
			
			int temp = a[maxLoc]; // Swap the largest item with a[lastPlace]
			a[maxLoc] = a[lastPlace];
			a[lastPlace] = temp;
			
		}
	}
}

