package structures;

import words.Complementizer;
public class SBar extends Phrase {

	public SBar(Complementizer c, Sentence S) {
		head = c;
		words.add(c);
		words.addAll(S.words);		
	}
}
