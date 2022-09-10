package lista0809;

import java.util.Scanner;

	public class Ex1 {


		public static void main(String[] args) {
			
			//1- Faça um programa que receba três inteiros e diga qual deles é o maior.//
			
			int n1,n2,n3;
			
			Scanner leia = new Scanner(System.in);

			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextInt();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextInt();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextInt();
			
			
			if(n1>=n2 && n1>=n3) {
				System.out.println("\nMaior pontuação: "+n1);
			}
			else if(n2>=n1 && n2>=n3) {
				System.out.println("\nMaior pontuação: "+n2);
			}
			else {
				System.out.println("\nMaior pontuação: "+n3);
				
			}
		}

}
