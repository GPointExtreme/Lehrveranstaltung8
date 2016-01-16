package org.campus02.tiere;

public class Hase {
	
	private String name;

	public Hase(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void schlafen() {
		System.out.println(name + " schläft!");
	}
	
	public void hoppeln() {
		System.out.println(name + " hoppelt!");
	}
	
	public void fressen() {
		System.out.println(name + " frisst!");
	}
	
	public void rammelt() {
		System.out.println(name + " rammelt ein sexy Bunny!");
	}

}
