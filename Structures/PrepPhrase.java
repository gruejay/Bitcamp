package structures;

import java.lang.Math;
import words.*;

/*
 * Defines the Structure PrepPhrase. A PrepPhrase can be composed 1
 * way, so we define 1 constructor
 */
public class PrepPhrase extends Phrase {
	
	public PrepPhrase(Preposition a, NounPhrase N) 	{
		head = a;
		if(Math.random() < 511.0 / 1183.0) {
			words.add(a);
			words.addAll(N.words);
		} 
		else {
			words.addAll(N.words);
			words.add(a);
		}
	}
}