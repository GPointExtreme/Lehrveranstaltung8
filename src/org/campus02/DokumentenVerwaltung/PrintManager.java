package org.campus02.DokumentenVerwaltung;

import java.util.ArrayList;

public class PrintManager {
	
	private ArrayList<Document> printma = new ArrayList<>();
	
	public void aaDocument(Document d) {
		printma.add(d);
	}
	
	public void printAll() {
		for (Document document : printma) {
			document.printDocument();
		}
	}
	
	public Document findDocument(String fileName) {
		for (Document document : printma) {
			if(fileName.equals(document.getFileName()));
				return document;
		}
		return null;
	}

}
