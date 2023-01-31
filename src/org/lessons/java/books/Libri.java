package org.lessons.java.books;

public class Libri {
	private String titolo;
	private int numPagine;
	private String autore;
	private String editore;
	
	
	public Libri(String titolo, int numPagine, String autore, String editore) throws Exception {
		super();
		this.titolo = titolo;
		validTitolo(titolo);
		this.numPagine = numPagine;
		validNumPagine(numPagine);
		this.autore = autore;
		validAutore(autore);
		this.editore = editore;
		validEditore(editore);
	}
	
	public void validTitolo(String titolo) throws  Exception {
		if(titolo.length() <= 0) {
			throw new Exception("Inserisci un titolo valido");
		}
	}
	
	public void validNumPagine(int numPagine) throws NumPagineException{
		if(numPagine <= 0) {
			throw new NumPagineException();
		}
	}
	
	public void validAutore(String autore) throws Exception{
		if(autore.length() <=0) {
			throw new Exception(autore);
		}
	}
	public void validEditore(String editore) throws Exception{
		if(editore.length() <=0) {
			throw new Exception(editore);
		}
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

	@Override
	public String toString() {
		return "Libri [titolo=" + titolo + ", numPagine=" + numPagine + ", autore=" + autore + ", editore=" + editore
				+ "]";
	}
	
	
	
}
