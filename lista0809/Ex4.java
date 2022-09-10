package lista0809;

import java.util.Scanner;

public class Ex4 {

public static void main(String[] args) {
		
		/*84- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.*/
				
		int x;
		double res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira um número: ");
		x = leia.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("\nNúmero par. Sua raiz quadrada é:");
			res = Math.sqrt(x);
		}
		else {
			System.out.println("\nNúmero ímpar. Sua potência ao quadrado é:");
			res = Math.pow(x, 2);
		}
		
		System.out.println(res);
		
		
	}

}
