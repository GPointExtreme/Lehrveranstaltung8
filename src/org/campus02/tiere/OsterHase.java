package org.campus02.tiere;

public class OsterHase extends Hase {

	public OsterHase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void verstecken() {
		System.out.println(getName() + " versteckt die Geschenke!");
	}
	
	@Override
	public void schlafen() {
		System.out.println(getName() + " schläft unter dem klaren Sternenhimmel!");
	}
	
	@Override
	public void hoppeln() {
		System.out.println(getName() + " hoppelt auf einer grünen Wiese!");
	}
	
	@Override
	public void fressen() {
		System.out.println(getName() + " frisst frisches grünes Gras!");
	}
	
	@Override
	public void rammelt() {
		System.out.println(getName() + " rammelt ein sexy Bunny im Wald!");
	}

}
