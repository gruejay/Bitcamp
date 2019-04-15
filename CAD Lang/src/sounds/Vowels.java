package sounds;

import enumerations.*;

public class Vowels {
	
	String name;
	Height h;
	Backness b;
	Rounding r;
	TenseLax t;
	String unicode;
	
	public Vowels(String name, Height h, Backness b, Rounding r, TenseLax t, String unicode) {
		
		this.name = name;
		this.h= h;
		this.b = b;
		this.r = r;
		this.t= t;
		this.unicode = unicode;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public Height getHeight() {
		
		return h;
		
	}
	
	public Backness getBack() {
		
		return b;
		
	}
	
	public Rounding getRound() {
		
		return r;
		
	}
	
	public TenseLax getTense() {
		
		return t;
		
	}
	
	public String getUnicode() {
		
		return unicode;
		
	}

}
