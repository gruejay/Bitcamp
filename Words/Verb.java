package words;
import java.util.ArrayList;

import sounds.Phoneme;

public class Verb extends Word {
	boolean aux;
	
	public Verb (ArrayList<Phoneme> a, boolean auxiliary) {
		phonemic = a;
		aux = auxiliary;
	}
	
	public boolean isAux() {
		return aux;
	}
}