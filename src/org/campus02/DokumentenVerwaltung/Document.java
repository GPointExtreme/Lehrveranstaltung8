package org.campus02.DokumentenVerwaltung;

public class Document {
	
	private String fileName;

	public Document(String fileName) {
		super();
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void printDocument() {
		System.out.println("Filename: " + getFileName());
	}
}
