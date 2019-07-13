package structures;

import words.*;

/*
 * Defines the Structure AdjPhrase. An AdjPhrase can be composed
 * in only one way.
 */
public class AdjPhrase extends Phrase {
	
	public AdjPhrase(Adjective a) {
		head = a;
		words.add(a);
	}
}
