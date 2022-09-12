package lista0809;

import java.util.Scanner;

	public class Ex1 {


		public static void main(String[] args) {
			
			//1- Faça um programa que receba três inteiros e diga qual deles é o maior.//
			
			int n1,n2,n3;
			
			Scanner leia = new Scanner(System.in);

			System.out.println("\nInsira primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("\nInsira segundo número: ");
			n2 = leia.nextInt();
			System.out.println("\nInsira terceiro número: ");
			n3 = leia.nextInt();
			
			
			if(n1>=n2 && n1>=n3) {
				System.out.println("\nMaior número: "+n1);
			}
			else if(n2>=n1 && n2>=n3) {
				System.out.println("\nMaior número: "+n2);
			}
			else {
				System.out.println("\nMaior número: "+n3);
				
			}
		}

}
