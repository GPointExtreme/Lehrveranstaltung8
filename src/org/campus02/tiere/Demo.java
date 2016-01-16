package org.campus02.tiere;

public class Demo {

	public static void main(String[] args) {
		Hase toni = new Hase("Toni");
		toni.fressen();
		
		OsterHase hans = new OsterHase("Hans");
		hans.hoppeln();
		
		WeihnachtsHase bob = new WeihnachtsHase("Bob");
		bob.schlafen();

	}

}
