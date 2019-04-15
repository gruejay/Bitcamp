package sounds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class WordGen {
	
	private Generation g;
	private final int INITIAL = 1;
	private final int MID = 2;
	private final int FINAL = 3;
	Random r;
	
	public WordGen() {
		
		g  = new Generation();
		g.genWordInitial();
		g.genVowels();
		g.genMidWord();
		g.genWordFinal();
		g.genSyllable();
		r = new Random();
		System.out.println("Word Initial: " + g.getWordInitial());
		System.out.println("Mid Word: " + g.getMidWord());
		System.out.println("Word Final: " + g.getWordFinal());
		System.out.println("Vowels: " + g.getVowels());
		
	}
	
	public HashMap<String, ArrayList<String>> genVocab(String[] english){
		
		HashMap<String, ArrayList<String>> vocab = new HashMap<String, ArrayList<String>>();
		
		int size = english.length;
		
		for(int i = 0; i < size; i++) {
			
			vocab.put(english[i], genWord());			
		}
		
		return vocab;
		
	}
	
	public ArrayList<String> genWord() {
		ArrayList<String> word = new ArrayList<String>();
		int syllCount = 1 + r.nextInt(4);
		if(syllCount == 1) {
			
			word.addAll(genSyllable(4));
			
		} else {
			
			word.addAll(genSyllable(1));
			syllCount -= 1;
			if(syllCount != 1) {
				
				for(int i = 0; i < syllCount - 1; i++) {
					
					word.addAll(genSyllable(2));
					
				}
				
			}
			word.addAll(genSyllable(3));
			
		}
		
		return word;
		
	}
	
	public ArrayList<String> genSyllable(int type) {
		ArrayList<String> syll = new ArrayList<String>();
		int[] syllableStruct = g.getSyllable();
		int possCount = syllableStruct[0];
		int possCountBack = syllableStruct[1];
		
		int frontNum = r.nextInt(possCount + 1);
		int backNum = r.nextInt(possCountBack + 1);
		
		if(type == INITIAL) {
			
			if(frontNum != 0) {
				
				syll.add(genWordInitial());
				frontNum -= 1;
				if(frontNum != 0) {
					
					for(int i = 0; i < frontNum; i++) {
						
						syll.add(genMidWord());
						
					}
					
				}
				
				
			}
			syll.add(genVowel());
			if(backNum != 0) {
					
				for(int k = 0; k < backNum; k++) {
						
					syll.add(genMidWord());
						
				}
				
			} else {
				
				syll.add(genMidWord());
				
			}
			
		} else if(type == FINAL) {
				
			if(frontNum != 0) {
					
				for(int i = 0; i < frontNum; i++) {
						
					syll.add(genMidWord());
						
				}
					
			} else {
				
				syll.add(genMidWord());
				
			}
			
			syll.add(genVowel());
				
			if(backNum != 0) {
					
				for(int k = 0; k < backNum - 1; k++) {
						
					syll.add(genMidWord());
						
				}
				syll.add(genWordFinal());
					
			}
					
		} else if(type == MID) {
				
			if(frontNum != 0) {
				
				for(int i = 0; i < frontNum; i++) {
						
					syll.add(genMidWord());
						
				}
					
			} 
			
			syll.add(genVowel());
				
			if(backNum != 0) {
					
				for(int k = 0; k < backNum; k++) {
						
					syll.add(genMidWord());
						
				}
					
			}
			
		} else {
			
			if(frontNum != 0) {
				
				syll.add(genWordInitial());
				frontNum -= 1;
				if(frontNum != 0) {
					
					for(int i = 0; i < frontNum; i++) {
						
						syll.add(genMidWord());
						
					}
					
				}
				
				
			}
			syll.add(genVowel());
			if(backNum != 0) {
				
				for(int k = 0; k < backNum - 1; k++) {
						
					syll.add(genMidWord());
						
				}
				syll.add(genWordFinal());
					
			}
			
		}
		
		return syll;
		
	}
	
	private String genWordInitial() {
		
		int count = (g.getWordInitial()).size();
		int gen = r.nextInt(count);
		return g.getWordInitial().get(gen);
		
	}
	
	private String genMidWord() {
		
		int count = (g.getMidWord()).size();
		int gen = r.nextInt(count);
		return g.getMidWord().get(gen);
		
	}
	
	private String genWordFinal() {
		
		int count = (g.getWordFinal()).size();
		int gen = r.nextInt(count);
		return g.getWordFinal().get(gen);
		
	}
	
	private String genVowel() {
		
		int count = (g.getVowels()).size();
		int gen = r.nextInt(count);
		return g.getVowels().get(gen);
		
	}
	
	public String toString(ArrayList<String> list) {
		
		String s = "";
		for(String a : list) {
			
			s = s + a;
			
		}
		
		return s;
		
	}

}
