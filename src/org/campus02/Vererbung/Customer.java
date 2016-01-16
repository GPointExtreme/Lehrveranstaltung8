package org.campus02.Vererbung;

public class Customer extends Person{
	
	private int alter;

	public Customer(String vorname, String nachname, int alter) {
		super(vorname, nachname);
		this.alter=alter;	
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

}
