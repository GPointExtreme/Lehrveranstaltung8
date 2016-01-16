package org.campus02.DokumentenVerwaltung;

import java.util.ArrayList;

public class CsvDocument extends Document {
	
	private ArrayList<String> lines;

	public CsvDocument(String fileName, ArrayList<String> lines) {
		super(fileName);
		this.lines = lines;
	}

	public ArrayList<String> getLines() {
		return lines;
	}

	public void setLines(ArrayList<String> lines) {
		this.lines = lines;
	}

	@Override
	public String toString() {
		return "CsvDocument [lines=" + lines + "]";
	}
	
	@Override
	public void printDocument() {
		System.out.println("Filename: " + getFileName() + " " + lines);
	}
	
	public void addLine(String line) {
		lines.add(line);
	}

}
