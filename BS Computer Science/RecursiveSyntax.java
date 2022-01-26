// CS 1103 - Unit 2 Lab 3
// Date: 24 NOV 2020

import java.util.Random;

public class RecursiveSyntax {

	static final String[] conjunctions = {"and", "or", "but", "because"};
	static final String[] proper_nouns = {"Fred", "Jane", "Richard Nixon", "Miss America"};
	static final String[] common_nouns = {"man", "woman", "fish", "elephant", "unicorn"};
	static final String[] determiners = {"a", "the", "every", "some"};
	static final String[] adjectives = {"big", "tiny", "pretty", "bald"};
	static final String[] intransitive_verbs = {"runs", "jumps", "talks", "sleeps"};
	static final String[] transitive_verbs = {"loves", "hates", "sees", "knows", "looks for", "finds"};

	public static void main(String[] args) {
	
		while (true) {
			randomSentence();
			System.out.println(".\n\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) 
				{
			}
		}
	}
		
	static void randomSentence() {
		
		Random generator = new Random();
		simpleSentence();	
		if (Math.random() > 0.7) { 
			System.out.print("" + conjunctions[generator.nextInt(conjunctions.length)] + " ");
			simpleSentence();
		}

	}

	static void simpleSentence() {
		
		if (Math.random() > 0.1) { 
			randomNouns();
		}
		if (Math.random() > 0.1) {
			randomVerbs();
		}
	}
	

	static void randomNouns() {
		
		Random generator = new Random();
		System.out.print(proper_nouns[generator.nextInt(proper_nouns.length)]);

		if (Math.random() > 0.75) { 
			System.out.print(" " + determiners[generator.nextInt(determiners.length)]);
		}
		
		System.out.print(" " + adjectives[generator.nextInt(adjectives.length)] + " ");
		
		if (Math.random() > 0.5) {  
			randomNouns();
		}

	}
	
	 static void  randomVerbs(){
		 
		Random generator = new Random();
		System.out.print( intransitive_verbs[generator.nextInt(intransitive_verbs.length)]);
			
		if (Math.random() > 0.75) { 
			System.out.print(" " + transitive_verbs[generator.nextInt(transitive_verbs.length)]);
		}
		
		System.out.print(" " + adjectives[generator.nextInt(adjectives.length)] + " ");
		
		if (Math.random() > 0.5) {  
			randomVerbs();
		}
 	}	

}