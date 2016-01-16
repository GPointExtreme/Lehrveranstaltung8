package org.campus02.tiere;

public class WeihnachtsHase extends Hase {

	public WeihnachtsHase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void bringe() {
		System.out.println(getName() + " bringt die Geschenke!");
	}
	
	@Override
	public void schlafen() {
		System.out.println(getName() + " schläft in einem warmen Bett im Bau!");
	}
	
	@Override
	public void hoppeln() {
		System.out.println(getName() + " hoppelt im Schnee!");
	}
	
	@Override
	public void fressen() {
		System.out.println(getName() + " frisst gute Keckse!");
	}
	
	@Override
	public void rammelt() {
		System.out.println(getName() + " rammelt ein sexy Bunny vor einem Kamin!");
	}

}
