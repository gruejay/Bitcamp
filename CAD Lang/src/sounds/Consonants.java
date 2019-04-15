package sounds;

import enumerations.*;

public class Consonants {
	
	String name;
	Manners m;
	Places p;
	Voicing v;
	String unicode;
	
	public Consonants(String name, Places p, Manners m, Voicing v, String unicode) {
		
		this.name = name;
		this.m = m;
		this.p = p;
		this.v = v;
		this.unicode = unicode;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public Manners getManner() {
		
		return m;
		
	}
	
	public Places getPlace() {
		
		return p;
		
	}
	
	public Voicing getVoice() {
		
		return v;
		
	}
	
	public String getUnicode() {
		
		return unicode;
		
	}

}
