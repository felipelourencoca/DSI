package main;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		/* valor = input('digite um valor)
		 * print valor
		 */
		int valor = 0;	
		Scanner s = new Scanner(System.in);		
		System.out.println("Digite um valor");
		
		valor = s.nextInt();
		
		valor += 1;
		System.out.println("O valor incrementado é: " + valor);
		
		
		
	}

}
