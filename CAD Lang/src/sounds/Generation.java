package sounds;

import java.util.ArrayList;
import java.util.Random;

public class Generation {
	
	private ArrayList<String> wordInitialCons;
	private ArrayList<String> midWordCons;
	private ArrayList<String> wordFinalCons;
	
	private ArrayList<String> vowels;
	private int[] syllable;
	private SoundCharts sounds = new SoundCharts();
	
	public Generation() {
		
		wordInitialCons = new ArrayList<String>();
		midWordCons = new ArrayList<String>();
		wordFinalCons = new ArrayList<String>();
		vowels = new ArrayList<String>();
		syllable = new int[2];
		
	}
	
	public ArrayList<String> getWordInitial(){
		
		return wordInitialCons;
		
	}
	
	public ArrayList<String> getMidWord(){
		
		return midWordCons;
		
	}
	
	public ArrayList<String> getWordFinal(){
		
		return wordFinalCons;
		
	}
	
	public ArrayList<String> getVowels(){
		
		return vowels;
		
	}
	
	public int[] getSyllable(){
		
		return syllable;
		
	}
	
	public void genSyllable() {
		
		Random r = new Random();
		int frontCons = 1 + r.nextInt(3);
		int backCons = 1 + r.nextInt(2);
		
		syllable[0] = frontCons;
		syllable[1] = backCons;
		
	}
	
	public void genWordInitial() {
		
		Random rand = new Random();
		int count = 1 + rand.nextInt(21);
		
		for(int i=0; i < count; i++) {
			
			String con = genRandomCon();
			while((wordInitialCons.contains(con) && !wordInitialCons.isEmpty()) || con == null) {
				
				con = genRandomCon();
				
			}
			wordInitialCons.add(con);
			
		}
		
	}
	
	public void genMidWord() {
		
		Random rand = new Random();
		int count = 2 + rand.nextInt(20);
		
		for(int i=0; i < count; i++) {
			
			String con = genRandomCon();
			while(midWordCons.contains(con) || con == null) {
				
				con = genRandomCon();
				
			}
			midWordCons.add(con);
			
		}
		
	}
	
	public void genWordFinal() {
		
		Random rand = new Random();
		int count = 1 + rand.nextInt(21);
		
		for(int i=0; i < count; i++) {
			
			String con = genRandomCon();
			while(wordFinalCons.contains(con) || con == null) {
				
				con = genRandomCon();
				
			}
			wordFinalCons.add(con);
			
		}
		
	}
	
	public void genVowels() {
		
		String vow;
		Random rand = new Random();
		
		int count = 3 + rand.nextInt(11);
		for(int i = 0; i < count; i++) {
			
			if(Math.random() < .25) {
				
				vow = genRandomVowel(1);
				while(vowels.contains(vow) || vow == null) {
					
					vow = genRandomVowel(1);
					
				}
				vowels.add(vow);
				
			} else {
				
				vow = genRandomVowel(0);
				while(vowels.contains(vow) || vow == null) {
					
					vow = genRandomVowel(0);
					
				}
				vowels.add(vow);
				
			}
			
		}
		
	}
	
	private String genRandomCon() {
		
		Random r = new Random();
		int place = r.nextInt(11);
		int manner = r.nextInt(8);
		int voice = r.nextInt(2);
		return sounds.getCon(place, manner, voice);
		
	}
	
	private String genRandomVowel(int table) {
		
		Random r = new Random();
		int back, height, round;
		
		if(table == 0) {
			
			back = r.nextInt(3);
			height = r.nextInt(4);
			round = r.nextInt(2);
			
		} else {
			
			back = r.nextInt(2);
			height = r.nextInt(3);
			round = r.nextInt(3);
			
		}
		
		return sounds.getVow(table, back, height, round);
		
	}

}
