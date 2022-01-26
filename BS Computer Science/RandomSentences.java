/*<sentence> ::= <simple_sentence> [ <conjunction> <sentence> ]

<simple_sentence> ::= <noun_phrase> <verb_phrase>

<noun_phrase> ::= <proper_noun> | 
<determiner> [ <adjective> ]. <common_noun> [ who <verb_phrase> ]

<verb_phrase> ::= <intransitive_verb> | 
<transitive_verb> <noun_phrase> |
is <adjective> |
believes that <simple_sentence>

<conjunction> ::= and | or | but | because

<proper_noun> ::= Fred | Jane | Richard Nixon | Miss America

<common_noun> ::= man | woman | fish | elephant | unicorn

<determiner> ::= a | the | every | some

<adjective> ::= big | tiny | pretty | bald

<intransitive_verb> ::= runs | jumps | talks | sleeps

<transitive_verb> ::= loves | hates | sees | knows | looks for | finds

This program implements these rules to generate random sentences. The program generates and outputs one random sentence every three seconds until
  it is halted (for example, by typing Control-C in the terminal window where it is
  running).
*/


public class RandomSentences {
    
	static final String[] conjunction = { "and", "or", "but", "because"};
        
	static final String[] proper_noun = { "Fred", "Jane", "Richard Nixon",
	        "Miss America" };
	
	static final String[] common_noun = { "man", " woman", "fish", "elephant", "unicorn"}; 
	
	static final String[] determiner = { "a", "the", "every", "some"};
	
	static final String[] adjective = { "big", "Tiny", "pretty",
	        " bald" };
	
	static final String[] intransitive_verb= { "runs", "jumps", "talks", "sleeps"};
	static final String[] transitive_verb= { "loves", "hates", "see", "knows", "looks for", "finds" };

/**
 * The main routine prints out one random sentence every three
 * seconds, forever (or until the program is killed).
 */

	public static void main(String[] args) {
	while (true) {
		randomSentence();
		System.out.println(".\n\n");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
		}
	}
}
/**
 * Generate a random sentence, following the grammar rule for a sentence.
 */
static void randomSentence() {

	/* A simple sentence */

	randomSimpleSentence();
	
	/* Optionally, conjunction followed by another sentence.*/
	
	if (Math.random() > 0.75) { // 25% of sentences continue with another clause.
		System.out.print( " conjunction[]");
		randomSimpleSentence();
	}
}
/**
 * Generate a random simple_sentence, following the grammar rule for a simple_sentence.
 */
static void randomSimpleSentence() {
	
	/* followed by a noun phrase and verb phrase */
	
	if (Math.random() > 0.15) { // 85% of sentences have a noun phrase. 
		randomNounPhrase();
	if (Math.random() > 0.15) {
			randomVerbPhrase();
		}
	}
}

static void randomNounPhrase() {
	
	/* A random noun. */
	
	int n = (int)(Math.random()*proper_noun.length);
	System.out.print( proper_noun[n]);
	
	
	
	if (Math.random() > 0.75) { 
		int d = (int)(Math.random()*determiner.length);
		System.out.print(" " + determiner[d]);
	}
	
	/* "that", followed by a random verb */
	
	int a = (int)(Math.random()*adjective.length);
	System.out.print("" + adjective[a] + " ");
	
	/* Another random noun phrase */
	
	if (Math.random() > 0.5) {  // 50% chance of having another noun phrase.
		randomNounPhrase();
	}

}
 static void  randomVerbPhrase(){
	 int i = (int)(Math.random()*intransitive_verb.length);
		System.out.print( intransitive_verb[i]);
		
		
		
		if (Math.random() > 0.75) { 
			int t = (int)(Math.random()* transitive_verb.length);
			System.out.print(" " + transitive_verb[t]);
		}
		
		
		int a = (int)(Math.random()*adjective.length);
		System.out.print("" + adjective[a] + " ");
		
		
		
		if (Math.random() > 0.5) {  // 50% chance of having another verb phrase.
			randomVerbPhrase();
		}
 	}	
}