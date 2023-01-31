package org.lessons.java.books;

public class NumPagineException extends Exception {
	private int pagine;

	public NumPagineException() {
		super("numero di pagine non valido");
	}

	public int getPage() {
		return pagine;
	}
}
