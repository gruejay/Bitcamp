package structures;

import words.*;

/*
 * Defines the Structure VerbPhrase. A VerbPhrase can be composed 4
 * different ways, so we define a constructor for each possibility
 */
public class VerbPhrase extends Phrase {
	
	public VerbPhrase(Verb v, NounPhrase N, PrepPhrase P) {
		head = v;
		words.add(v);
		words.addAll(N.words);
		words.addAll(P.words);
	}
	
	public VerbPhrase(Verb v, AdvPhrase A) {
		head = v;
		words.add(v);
		words.addAll(A.words);
	}
	
	public VerbPhrase(VerbPhrase V, AdvPhrase A) {
		head = V.head;
		words.addAll(V.words);
		words.addAll(A.words);
	}
	
	public VerbPhrase(VerbPhrase V, PrepPhrase P) {
		head = V.head;
		words.addAll(V.words);
		words.addAll(P.words);
	}
	
	public VerbPhrase(Verb v, SBar S) {
		head = v;
		words.add(v);
		words.addAll(S.words);
	}
}
