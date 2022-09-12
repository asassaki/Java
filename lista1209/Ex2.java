package lista1209;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.
		 */
		
		int[] n = new int[6];
		int x,somaPar=0,qtdImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("\nInsira um número: ");
			n[x] = leia.nextInt();
		}
		
		System.out.println("\nNúmeros pares: ");
		for(x=0;x<6;x++) {
			if(n[x] % 2 == 0) {
				System.out.println(n[x]);
				somaPar += n[x];
			}
		}
		
		System.out.println("\nNúmeros ímpares: ");
		for(x=0;x<6;x++) {
			if(n[x] % 2 == 1) {
				System.out.println(n[x]);
				qtdImpar++;
			}
		}
		
		System.out.println("\nSoma dos números pares: "+somaPar);
		System.out.println("\nQuantidade de números ímpares: "+qtdImpar);

	}

}
