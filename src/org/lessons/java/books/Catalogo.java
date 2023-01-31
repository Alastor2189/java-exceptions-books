package org.lessons.java.books;

import java.util.Scanner;

public class Catalogo {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		 String titolo;
		 int numPagine;
		 String autore;
		 String editore;
		 int n = 0;
		 
		
		 do {
			 try {
				 	System.out.print("Digita il numero di libri che vuoi inserire:");
				 	n = Integer.parseInt(s.nextLine());
				 	if(n < 1 || n > 50 )
				 		System.out.println("Numero non corretto, inserire un numero compreso fra 1 e 50");
				 	
			 } catch (Exception error) {
				 System.out.println("Solo numeri interi");
			 }
		 } while (n < 1 || n > 50);
		 
		 Libri [] catalogo = new Libri[n];
		 
		 for (int i = 0; i < n; i++) {
			 System.out.println("Inserisci il titolo del libro:");
			 titolo = s.nextLine();
			 System.out.println("Inserisci ora il numero delle pagine");
			 try {
				 numPagine = Integer.parseInt(s.nextLine());
			 } catch (Exception l) {
				 numPagine = 0;
			 }
			 
			 System.out.print("Scrivi il nominativo dell'autore:");
			 autore = s.nextLine();
			 System.out.println("Scrivi il nome della casa editrice:");
			 editore = s.nextLine();
			 
			 Libri testo;
			 try {
				 testo = new Libri(titolo, numPagine, autore, editore);
				 catalogo[i] = testo;
			 }catch (Exception l) {
				 l.getMessage();
			 }
			 
			 System.out.println("Libro registrato" + catalogo[i].toString());
		 }
		 
		 s.close();
		 
	}
}