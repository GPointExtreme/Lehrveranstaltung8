package org.campus02.DokumentenVerwaltung;

public class ImageDocument extends Document {
	
	private int sizeX;
	private int sizeY;
	private String color;

	public ImageDocument(String fileName, int sizeX, int sizeY, String color) {
		super(fileName);
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.color = color;
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void printDocument() {
		System.out.println("Filename: " + getFileName() + " X:" + 
							getSizeX() + " Y:" + getSizeY() + " Color: " 
							+ getColor());
	}

}
