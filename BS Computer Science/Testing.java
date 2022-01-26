
//import javax.swing.JOptionPane;

//import java.awt.event.*;
//import java.util.ArrayList;
//import javax.swing.*;
import java.util.Arrays;

//package com.asus;
//import java.util.Arrays;
public class Testing {
// Initializing the two array lists and how to sort them.
static int maxArraySize=100000; // Array Size
static int[] sortArr1 = new int[maxArraySize]; // First Array
static int[] sortArr2 = new int[maxArraySize]; // Second Array
	public static void main(String[] args) {
		// Class Constructor
		for (int i = 0; i < sortArr1.length; i++) {
		// Using the same random numbers to fill both array.
		sortArr1[i]=(int)(Integer.MAX_VALUE * Math.random());
		sortArr2[i]=sortArr1[i];
		long startTimeArray1 = System.currentTimeMillis(); // Begins computation for Selected Sorting.
		selectionSort (sortArr1); // Sorting Array1 with SelectionSort
		long runTimeArray1 = System.currentTimeMillis() - startTimeArray1; // Time to run the SelectionSort
		long startTimeArray2 = System.currentTimeMillis();// Begins computing time for Arrays.sort
		Arrays.sort(sortArr2); // Sorting Array2 with Arrays.sort
		long runTimeArray2 = System.currentTimeMillis() - startTimeArray2; // Time taken to run the Arrays.sort
		System.out.println("SelectionSort time(sec):"+runTimeArray1/1000.0); // Printing the time taken for array size 1000
		System.out.println("Arrays Sort time(sec):"+runTimeArray2/1000.0); // printing the time taken for array size 1000
		System.out.println("SelectionSort time(sec):"+runTimeArray1/10000.0); // Printing the time taken for array size 10,000
		System.out.println("Arrays Sort time(sec):"+runTimeArray2/10000.0); // printing the time taken for array size 10,000
		System.out.println("SelectionSort time(sec):"+runTimeArray1/100000.0); // Printing the time taken for array size100,000
		System.out.println("Arrays Sort time(sec):"+runTimeArray2/100000.0); // printing the time taken for array size 100,0000
	}
}
static void selectionSort(int[] A) {
// Sort A in increasing order, using selection sort
	for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {
		// Find the largest item among A[0], A[1], ...,
		// A[lastPlace], and move it into position lastPlace
		// by swapping it with the number that is currently
		// in position lastPlace.
		int maxLoc = 0; // Location of largest item seen so far.
		for (int j = 1; j <= lastPlace; j++) {
		if (A[j] > A[maxLoc]) {
		// Since A[j] is bigger than the maximum we have seen
		// so far, j is the new location of the maximum value
		// we have seen so far.
		maxLoc = j;
		}
		}
		int temp = A[maxLoc]; // Swap largest item with A[lastPlace].
		A[maxLoc] = A[lastPlace];
		A[lastPlace] = temp;
		} // end of for loop
		}
		}
	

//public class Lunch {
//	public static void main(String[] args) {
//		Testing lunch = new Pepfsafper();
//	}
//}

//public class Lunch {
//    public static void main(String[] args) {
//        Testing lunch = new Pepper();
//    }
//}

//	public static void main(String[] args) {
//		// Question for input
//		String question = "What number am i thinking of between 1 and 5?\n";
//		question += "A. 1\n";
//		question += "B. 2\n";
//		question += "C. 3\n";
//		question += "D. 4\n";
//		question += "E. 5\n";
//		question += "Please enter the letter corresponding to your answer.";
//		
//		
//		while(true) {
//			// Get answer from user.
//			String answer = JOptionPane.showInputDialog(question);
//			
//			// change answer to make sure it is uppercase
//			answer = answer.toUpperCase();
//			// use switch statement to check answer input
//			switch(answer) {
//				case "A":
//					// A is the correct answer so show the correct dialog 
//					// and return from the while loop
//					JOptionPane.showMessageDialog(null, answer + " is the Correct Answer!");
//					return;
//					// Check the other valid entries and display 
//					// the incorrect dialog break out of the switch and continue
//				case "B":
//				case "C":
//				case "D":
//				case "E":
//					JOptionPane.showMessageDialog(null, answer + " is incorrect. Please try again.");
//					break;
//					// This checks all other answers and displays invalid answer dialog
//				default:
//					JOptionPane.showMessageDialog(null, answer + " is an invalid answer. Please enter A, B, C, D, or E.");
//					break;
//			}
//		} 
//	}
//
//}



//import javax.swing.JOptionPane;
//
//import textio.TextIO;
//
//public class Testing {
//
//	public static void main(String[] args) {
//		
//		int inputNumber;
//		int sum;
//		int count;
//		double average;
//		
//		sum = 0;
//		count = 0;
//		
//		String answer = JOptionPane.showInputDialog("Enter a number");
//		
//		while ((int)(answer) != 0);		
//		
////		int i = 37;
////		while (i < 47) { // shows 0, then 1, then 2
////		  System.out.println( i );
////		  i++;
////		}
////		
////		int j = 37;
////		do {
////		  System.out.println( j );
////		  j++;
////		} while (j < 47);
////		
////		for (int k = 37; k < 47; k++) { // shows 0, then 1, then 2
////			  System.out.println(k);
////			}
////		
////	}
////}
//////prints 37, 38, 39, 40, 41, 42, 43, 44, 45, 46
////
////
////boolean pickNextGame; 
////do {
////   NFLgames.predict();
////   String question = "Who is your pick to win?";
////   String answer = JOptionPane.showInputDialog(question);
////   pickNextGame = TextIO.getlnBoolean();
////} while (pickNextGame == true);
////
////int pickNextGame = 1; 
////int gamesCount = 16;
////
////NFLgames.predict();
////String question = "Who is your pick to win?";
////String answer = JOptionPane.showInputDialog(question);
////
////
////String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
////for (String i : cars) {
////  System.out.println(i);
////}
////
////
////
////public class JavaStringArrayTests1
////{
////    private String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
////
////    // our constructor; print out the String array here
////    public JavaStringArrayTests1()
////    {
////        // old `for` loop
////        int size = toppings.length;
////        for (int i=0; i<size; i++)
////        {
////            System.out.println(toppings[i]);
////        }
////    }
////
////    // main kicks everything off.
////    // create a new instance of our class here.
////    public static void main(String[] args)
////    {
////        new JavaStringArrayTests1();
////    }
////}
////
////int length = teams.length;
////
////NFLgames.predict();
////String question = "Who is your pick to win?";
////String answer = JOptionPane.showInputDialog(question);
////pickNextGame++;
////} while (pickNextGame <= gamesCount);
////
////do 
////{ 
////   System.out.println(i);
////   i++;
////} while (i < 47); //prints 37, 38, 39, 40, 41, 42, 43, 44, 45, 46