package sounds;

import java.util.HashMap;

import enumerations.Backness;
import enumerations.Height;
import enumerations.Manners;
import enumerations.Places;
import enumerations.Rounding;
import enumerations.Voicing;

public class SoundCharts {
	
	private String[][][] ipaCons;
	private final int PL = 0;
	private final int N = 1;
	private final int T = 2;
	private final int FL = 3;
	private final int F = 4;
	private final int LA = 5;
	private final int LF = 6;
	private final int AP = 7;


	private final int B = 0;
	private final int LD = 1;
	private final int D = 2;
	private final int ALV = 3;
	private final int POA = 4;
	private final int R = 5;
	private final int PA = 6;
	private final int VEL = 7;
	private final int U = 8;
	private final int PH = 9;
	private final int G = 10;

	private final int V = 0;
	private final int VL = 1;
	private String[][][] ipaVow;
	
	private final int FRONT = 0;
	private final int CENTRAL = 1;
	private final int BACK = 2;
	
	private final int HI = 0;
	private final int MIDHI = 1;
	private final int MIDLOW = 2;
	private final int LOW = 3;
	
	private final int UNROUND = 0;
	private final int ROUND = 1;
	private final int NEITHER = 2;
	
	private String[][][] ipaVow2;
	
	public SoundCharts() {
		
		ipaCons = new String[11][8][2];
		ipaVow = new String[3][4][2];
		ipaVow2 = new String[2][3][3];
		fillCons();
		fillVow();
		
	}
	
	public String getCon(int place, int manner, int voice) {
		
		return ipaCons[place][manner][voice];
		
	}
	
	public String getVow(int table, int back, int height, int round) {
		
		if(table == 0) {
			
			return ipaVow[back][height][round];
			
		} else {
			
			return ipaVow2[back][height][round];
			
		}
		
	}
	
	private void fillCons() {
		
		ipaCons[B][PL][VL] = "p";
		ipaCons[B][PL][V] = "b";
		ipaCons[ALV][PL][VL] = "t";
		ipaCons[ALV][PL][V] = "d";
		ipaCons[R][PL][VL] = "ʈ";
		ipaCons[R][PL][V] = "ɖ";
		ipaCons[PA][PL][VL] = "c";
		ipaCons[PA][PL][V] = "ɟ";
		ipaCons[VEL][PL][VL] = "k";
		ipaCons[VEL][PL][V] = "g";
		ipaCons[U][PL][VL] = "q";
		ipaCons[U][PL][V] = "ɢ";
		ipaCons[G][PL][VL] = "ʔ";
		ipaCons[B][N][V] = "m";
		ipaCons[LD][N][V] = "ɱ";
		ipaCons[ALV][N][V] = "n";
		ipaCons[R][N][V] = "ɳ";
		ipaCons[PA][N][V] = "ɲ";
		ipaCons[VEL][N][V] = "ŋ";
		ipaCons[U][N][V] = "ɴ";
		ipaCons[B][T][V] = "ʙ";
		ipaCons[ALV][T][V] = "r";
		ipaCons[U][T][V] = "ʀ";
		ipaCons[ALV][FL][V] = "ɾ";
		ipaCons[R][FL][V] = "ɽ";
		
		ipaCons[B][F][V] = "β";
		ipaCons[B][F][VL] = "ɸ";

		ipaCons[LD][F][V] = "v";
		ipaCons[LD][F][VL] = "f";

		ipaCons[D][F][V] = "ð";
		ipaCons[D][F][VL] = "θ";

		ipaCons[ALV][F][V] = "z";
		ipaCons[ALV][F][VL] = "s";

		ipaCons[POA][F][V] = "ʒ";
		ipaCons[POA][F][VL] = "ʃ";

		ipaCons[R][F][V] = "ʐ";
		ipaCons[R][F][VL] = "ʂ";

		ipaCons[PA][F][V] = "ʝ";
		ipaCons[PA][F][VL] = "ç";

		ipaCons[VEL][F][V] = "ɣ";
		ipaCons[VEL][F][VL] = "x";

		ipaCons[U][F][V] = "ʁ";
		ipaCons[U][F][VL] = "χ";

		ipaCons[PH][F][V] = "ʕ";
		ipaCons[PH][F][VL] = "ħ";

		ipaCons[G][F][V] = "ɦ";
		ipaCons[G][F][VL] = "h";
		
		ipaCons[VEL][LA][V] = "ʟ";
		ipaCons[PA][LA][V] = "ʎ";
		ipaCons[R][LA][V] = "ɭ";
		ipaCons[ALV][LA][V] = "l";

		ipaCons[LD][AP][V] = "ʋ";
		ipaCons[ALV][AP][V] = "ɹ";
		ipaCons[R][AP][V] = "ɻ";
		ipaCons[PA][AP][V] = "j";
		ipaCons[VEL][AP][V] = "ɰ";

		ipaCons[ALV][LF][VL] = "ɬ";
		ipaCons[ALV][LF][V] = "ɮ";
		
	}
	
	public void fillVow() {
		
		ipaVow[FRONT][HI][UNROUND] = "i";
		ipaVow[FRONT][HI][ROUND] = "y";
		ipaVow[CENTRAL][HI][UNROUND] = "ɨ";
		ipaVow[CENTRAL][HI][ROUND] = "ʉ";
		ipaVow[BACK][HI][UNROUND] = "ɯ";
		ipaVow[BACK][HI][ROUND] = "u";
		
		ipaVow[FRONT][MIDHI][UNROUND] = "e";
		ipaVow[FRONT][MIDHI][ROUND] = "ø";
		ipaVow[CENTRAL][MIDHI][UNROUND] = "ɘ";
		ipaVow[CENTRAL][MIDHI][ROUND] = "ɵ";
		ipaVow[BACK][MIDHI][UNROUND] = "ɤ";
		ipaVow[BACK][MIDHI][ROUND] = "o";
		
		ipaVow[FRONT][MIDLOW][UNROUND] = "ɛ";
		ipaVow[FRONT][MIDLOW][ROUND] = "œ";
		ipaVow[CENTRAL][MIDLOW][UNROUND] = "ɜ";
		ipaVow[CENTRAL][MIDLOW][ROUND] = "ɞ";
		ipaVow[BACK][MIDLOW][UNROUND] = "ʌ";
		ipaVow[BACK][MIDLOW][ROUND] = "ɔ";
		
		ipaVow[FRONT][LOW][UNROUND] = "a";
		ipaVow[FRONT][LOW][ROUND] = "ɶ";
		ipaVow[BACK][LOW][UNROUND] = "ɑ";
		ipaVow[BACK][LOW][ROUND] = "ɒ";
		
		ipaVow2[0][0][UNROUND] = "ɪ";
		ipaVow2[0][0][ROUND] = "ʏ";
		ipaVow2[1][0][ROUND] = "ʊ";
		ipaVow2[0][1][NEITHER] = "ə";
		ipaVow2[0][2][UNROUND] = "æ";
		ipaVow2[1][2][NEITHER] = "ɐ";
		
	}

}
