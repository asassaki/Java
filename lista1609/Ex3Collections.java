package lista1609;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3Collections {

	public static void main(String[] args) {
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();//criando um objeto do tipo ArrayList
		
		do {
			System.out.println("\n--------------------------------------------------------------");
			System.out.println("\n\t\tEstoque: Menu de opções");
			System.out.println("\n1. Armazenar produtos");
			System.out.println("\n2. Remover produtos");
			System.out.println("\n3. Atualizar produtos");
			System.out.println("\n4. Visualizar produtos");
			System.out.println("\n0. Encerrar programa");
			System.out.println("\nDigite sua opção: ");
			
			op = ler.nextInt();
			System.out.println("\n--------------------------------------------------------------");
			
			switch(op) {
			case 1:
				ler.nextLine();
				System.out.println("Digite o produto que será armazenado no estoque: ");
				String produto = ler.nextLine();//nextLine lerá um valor do tipo String
				estoque.add(produto);
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto que será removido do estoque: ");
				String produto1 = ler.nextLine();
				if(estoque.contains(produto1)) {//o método contains verifica se o produto está contido dentro do estoque
					estoque.remove(produto1);
					
				}
				else {
					System.out.println("\nProduto indisponível no estoque.");
				}
				break;
				
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que será atualizado no estoque: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto que substituirá "+verifica+":");
				String novo = ler.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else {
					System.out.println("\nProduto indisponível no estoque");
				}
				break;
				
			case 4:
				System.out.println("\nProdutos cadastrados no estoque: ");
				System.out.println(estoque);
				break;
				
			case 0:
				System.out.println("\nOperação de sistema concluído.");
				break;
				default:
					System.out.println("\nOpção inválida.");
			}
		}
		while(op!=0);

	}

}
