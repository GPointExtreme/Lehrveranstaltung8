package org.campus02.DokumentenVerwaltung;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		Document doc1 = new Document("Dokument1");
		doc1.printDocument();
		
		TextDocument doc2 = new TextDocument("Dokument2", "Text text text 123 test 123 test");
		doc2.printDocument();
		
		ImageDocument doc3 = new ImageDocument("Dokuemnt3", 50, 100, "Blue");
		doc3.printDocument();
		
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Eins");
		MyArrayList.add("Zwei");
		CsvDocument doc4 = new CsvDocument("Dokument4", MyArrayList);
		doc4.printDocument();
		doc4.addLine("Drei");
		doc4.printDocument();
		
		System.out.println("--------------------------------------------------");
		
		PrintManager MyPrint = new PrintManager();
		MyPrint.aaDocument(doc1);
		MyPrint.aaDocument(doc2);
		MyPrint.aaDocument(doc3);
		MyPrint.aaDocument(doc4);
		
		MyPrint.printAll();
	}

}
