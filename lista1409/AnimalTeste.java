package lista1409;

import java.util.Scanner;

public class AnimalTeste {

	public static void main(String[] args) {
		
		//Transformei objetos em comentário para testar métodos de forma polifórmica.
		
		int op=0;
		
		Scanner leia = new Scanner(System.in);
		
		Cachorro dog = new Cachorro("Anne",10,"Latido","Correr");
		Cavalo horse = new Cavalo("Spirit",13,"Relincho","Correr");
		Preguica sloth = new Preguica("Soneca",5,"Incógnita","Subir em árvore");
		
		
		/*dog.imprimirCachorro();
		horse.imprimirCavalo();
		sloth.imprimirPreguica();
		*/
		
		System.out.println("\nOpções");
		System.out.println("\n1- Cachorro");
		System.out.println("\n2- Cavalo");
		System.out.println("\n3- Preguiça");
		System.out.println("\nEscolha um animal: ");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			dog.imprimirInfo(null, op);
			dog.seMove();
			dog.emiteSom(null);
			break;
			
		case 2:
			horse.imprimirInfo(null, op);
			horse.seMove();
			horse.emiteSom(null);
			break;
			
		case 3:
			sloth.imprimirInfo(null, op);
			sloth.seMove();
			sloth.emiteSom(null);
			break;
			
			default:System.out.println("\nAnimal não identificado.");
		
		}
		
		
	}

}
