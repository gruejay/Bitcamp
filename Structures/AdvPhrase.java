package structures;

import words.*;

/*
 * Defines the Structure AdvPhrase. An AdvPhrase can be composed
 * in only one way.
 */
public class AdvPhrase extends Phrase {
	
	public AdvPhrase(Adverb a) {
		head = a;
		words.add(a);
	}
}
