package structures;



import words.Determiner;
import words.Noun;

public class NounPhrase extends Phrase {
	
	
	public NounPhrase(Determiner d, AdjPhrase A, Noun noun, PrepPhrase P) {
		head = noun;
		words.add(d);
		words.addAll(A.words);
		words.add(noun);
		words.addAll(P.words);
	}
		
}
