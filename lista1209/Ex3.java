package lista1209;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.//
		
		int[][] n = new int[3][3];
		int x,y,m10=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<3;x++) {
			for(y=0;y<3;y++) {
				System.out.println("\nInsira um número na linha "+x+" e coluna "+y+": ");
				n[x][y] = leia.nextInt();
				
				
				if(n[x][y] > 10) {
					m10++;
				}
			
			}
			
		}
		
		System.out.println("\nQuantidade de números maiores que 10: "+m10);

	}

}
