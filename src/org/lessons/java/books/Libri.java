package org.lessons.java.books;

public class Libri {
	private String titolo;
	private int numPagine;
	private String autore;
	private String editore;
	
	
	public Libri(String titolo, int numPagine, String autore, String editore) {
		super();
		this.titolo = titolo;
		this.numPagine = numPagine;
		this.autore = autore;
		this.editore = editore;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public int getNumPagine() {
		return numPagine;
	}


	public void setNumPagine(int numPagine) {
		this.numPagine = numPagine;
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public String getEditore() {
		return editore;
	}


	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	
	
}
