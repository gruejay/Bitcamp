package sounds;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Executor {

	public static void main(String[] args) {
		
		WordGen w = new WordGen();
		
		ArrayList<String> initial = w.genSyllable(1);
		ArrayList<String> mid = w.genSyllable(2);
		ArrayList<String> fin = w.genSyllable(3);
		ArrayList<String> other = w.genSyllable(4);
		ArrayList<String> word = w.genWord();
		System.out.println(initial);
		System.out.println(mid);
		System.out.println(fin);
		System.out.println(other);
		System.out.println("Word: " +word);
		String[] voc = code();
		HashMap<String, ArrayList<String>> vocab = w.genVocab(voc);
		for(String english: vocab.keySet()) {
			
			ArrayList<String> newWord = vocab.get(english);
			System.out.println("English: " + english + ", New: " + w.toString(newWord));
			
		}
		
 
	}
	
	public static String[] code() {
		
		String[] words = new String[1000];
		File wordFile = new File("C://EclipseWkOxygen64//CAD Lang//src//sounds/words.txt");
		BufferedReader bf;
		try {
			bf = new BufferedReader(new FileReader(wordFile));

			String curr;
			int i = 0;
			try {
				while((curr = bf.readLine()) != null) {
					words[i] = curr;
					i++;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return words;
		
	}

}
