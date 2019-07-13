package structures;

import java.util.ArrayList;

import words.Verb;

/*
 * Defines the Structure Sentence. A Sentence is a NounPhrase
 * and a VerbPhrase. We also need to add auxiliary verbs to
 * Sentences, but that will come later
 */
public class Sentence extends Phrase {
	
	public Sentence(NounPhrase N, ArrayList<Verb> V, VerbPhrase P) {
		head = N.head;
		words.addAll(N.words);
		
		// verify all verbs are aux
		for (Verb v : V) {
			if (v.isAux()) {
				words.add(v);
			}
		}
		words.addAll(P.words);
	}
}
