package lista0909;

import java.util.Scanner;

public class Ex6DoWhile {

		public static void main(String[] args) {
			
		/*Escrever um programa que receba vários números inteiros no teclado. E no
		final imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)
		 */
		
		int n,contM3=0,somaM3=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira um número: ");
		n = leia.nextInt();
		
		do {
			if(n==0) {
				System.out.println("\nSair do loop.");
			}
			else {
				if(n%3==0) {
					somaM3+=n;
					contM3++;
				}
				System.out.println("\nInsira um número: ");
				n = leia.nextInt();
			}
		}
		while(n!=0);
		
		if(contM3==0) {
			System.out.println("\nNão é possivel dividir por zero.");
		}
		else {
			media = somaM3 / contM3;
			System.out.printf("\nMédia dos múltiplos de 3: %2.f",media);
		}
		

	}

}
