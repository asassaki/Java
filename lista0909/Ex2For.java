package lista0909;

import java.util.Scanner;

public class Ex2For {

	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) //
	
		public static void main(String[] args) {

			int x,contPar=0,contImpar=0,n;

			Scanner leia = new Scanner(System.in);

			for (x=1;x<=10;x++) {
				System.out.println("\nInsira um número:");
				n = leia.nextInt();

				if (x%2==0) {
					contPar++;
				} else {
					contImpar++;
				}

			}
			System.out.println("\nTotal de números pares: "+contPar);
			System.out.println("\nTotal de números ímpares: "+contImpar);

		}

}
