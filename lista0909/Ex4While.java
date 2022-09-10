package lista0909;

import java.util.Scanner;

public class Ex4While {

public static void main(String[] args) {
		
		/*4- Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		 o número de pessoas calmas;
		 o número de mulheres nervosas;
		 o número de homens agressivos;
		 o número de outros calmos;
		 o número de pessoas nervosas com mais de 40 anos;
		 o número de pessoas calmas com menos de 18 anos.
		 */
		
		int idade,genero,fp,contPc=0,contMn=0,contHa=0,contNd=0,contPn40=0,contPc18=0,p=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(p<=6) {
			System.out.println("\nInforme a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nInsira o seu gênero: 1-Feminino\n2-Masculino\n3-Não declarado");
			genero = leia.nextInt();
			System.out.println("\nInsira o seu fator psicológico: 1-Calmo\n2-Nervoso\n3-Agressivo");
			fp = leia.nextInt();
			
			if(fp==1) {
				contPc++;
			}
			
			if(genero==1 && fp==2) {
				contMn++;
			}
			
			if(genero==2 && fp==3) {
				contHa++;
			}
			
			if(genero==3 && fp==1) {
				contNd++;
			}
			
			if(fp==2 && idade<40) {
				contPn40++;
			}
			
			if(fp==1 && idade<18) {
				contPc18++;
			}
			
			p++;
		}
		
		System.out.println("\nNúmero de pessoas calvas:"+contPc);
		System.out.println("\nNúmero de mulheres nervosas:"+contMn);
		System.out.println("\nNúmero de homens agressivos:"+contHa);
		System.out.println("\nNúmero de pessoas não declaradas calvas:"+contNd);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos:"+contPn40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos:"+contPc18);
	}
}
