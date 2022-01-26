import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.JFileChooser;

// CS 1103 - Unit 5 Lab 9
// Date: 16 DEC 2020



public class SpellChecker {
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		printCorrections(loadDictionary());
		
	}
	
	static HashSet<String> loadDictionary() throws FileNotFoundException {
		
		Scanner filein = new Scanner(new File("src/words.txt"));
		HashSet<String> dictionary = new HashSet<>();
		
		while (filein.hasNext()) {
			
			String token = filein.next();
			dictionary.add(token.toLowerCase());
			
		}
		
		System.out.println("Dictionary is of size: " + dictionary.size());
		return dictionary;
	}
	
	static File getInputFile() {
		
		JFileChooser fileDialog = new JFileChooser(); 
		fileDialog.setDialogTitle("Select File for Input: ");
		int option = fileDialog.showOpenDialog(null);
		if (option != JFileChooser.APPROVE_OPTION) {
			
			return null;
		
		} else {
			
			return fileDialog.getSelectedFile();
			
		}
		
		
	}
	
	static TreeSet<String> getWordsFromInput() throws FileNotFoundException{
		
		Scanner wordsIn = new Scanner(getInputFile());
		wordsIn.useDelimiter("[^a-zA-Z]+");
		
		TreeSet<String> getWords = new TreeSet<>();
		
		while (wordsIn.hasNext()) {
			
			String token = wordsIn.next();
			getWords.add(token.toLowerCase());
			
		}
		
		return getWords;		
		
	}
	
	static TreeSet<String> corrections(String badWord, HashSet<String> dictionary) {
		
		TreeSet<String> variations = new TreeSet<>();
		deletedLetter(badWord, dictionary, variations);
		changedLetter(badWord, dictionary, variations);
		insertLetter(badWord, dictionary, variations);
		swapLetter(badWord, dictionary, variations);
		insertSpace(badWord, dictionary, variations);
						
		return variations;
		
	}
	
	static void deletedLetter(String badWord, HashSet<String> dictionary, TreeSet<String> variations) {
		
		int i; 
		for (i = 0; i < badWord.length(); i++) {
			
			String s = badWord.substring(0,i) + badWord.substring(i+1);
			if (dictionary.contains(s)) {
				
				variations.add(s);
				
			}
		}
		
	}
	
	static void changedLetter(String badWord, HashSet<String> dictionary, TreeSet<String> variations) {
		
		char ch;
		int i;
		for (ch = 'a'; ch <= 'z'; ch++) {
			
			for (i = 0; i < badWord.length(); i++) {
				
				String s = badWord.substring(0,i) + ch + badWord.substring(i+1);
				if (dictionary.contains(s)) {
					
					variations.add(s);
					
				}
			}
		
		}
	}
	
	static void insertLetter(String badWord, HashSet<String> dictionary, TreeSet<String> variations) {
		
		char ch;
		int i;
		for (ch = 'a'; ch <= 'z'; ch++) {
			
			for(i = 0; i < badWord.length(); i++) {
				
				String s = badWord.substring(0,i) + ch + badWord.substring(i);
				if (dictionary.contains(s)) {
					
					variations.add(s);
					
				}
			}
			
		}
				
	}
	
	static void swapLetter(String badWord, HashSet<String> dictionary, TreeSet<String> variations) {
		
		int i;
		char[] c = badWord.toCharArray();
		for(i = 0; i < badWord.length()-1; i++) {
			
			char temp = c[i];
			c[i] = c[i+1];
			c[i+1] = temp;
			
			String swapped;
			swapped = new String(c); 
			
			if (dictionary.contains(swapped)) {
				
				variations.add(swapped);
				
			}
			
		}
		
		
	}
	
	static void insertSpace(String badWord, HashSet<String> dictionary, TreeSet<String> variations) {
		
		int i;
		for (i = 0; i < badWord.length(); i++) {
			
			String s = badWord.substring(0,i);
			String s1 = badWord.substring(i);
			String newWords = s + " " + s1;
			
			if (dictionary.contains(s) && dictionary.contains(s1)) {
				
				variations.add(newWords);
				
			}
			
		}
		
	}
	
	static void printCorrections(HashSet<String> dictionary) throws FileNotFoundException {
		
		TreeSet<String> getWords = getWordsFromInput();
		for (String word : getWords) {
			
			if(!dictionary.contains(word)) {
				
				TreeSet<String> corrections = corrections(word, dictionary);
				String correctionsStrings = corrections.toString();
				System.out.println(word + ": " + correctionsStrings);
				
			}
			
		}
		
	}
	

}
