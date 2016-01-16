package org.campus02.DokumentenVerwaltung;

public class TextDocument extends Document {
	
	private String content;

	public TextDocument(String fileName, String content) {
		super(fileName);
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public void printDocument() {
		System.out.println("Filename: " + getFileName() + " Filecontent: " + getContent());
	}

}
