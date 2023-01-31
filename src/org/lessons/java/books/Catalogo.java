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
				 	numPagine = Integer.parseInt(s.nextLine());
				 	if(n < 1 || n > 50 )
				 		System.out.println("Numero non corretto, inserire un numero compreso fra 1 e 50");
				 	
			 } catch (Exception error) {
				 System.out.println("Solo numeri interi");
			 }
		 } while (n < 1 || n > 50);
		 
		 Libri [] catalogo = new Libri[n];
		 
	}
}