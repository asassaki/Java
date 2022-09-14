package lista1409;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Anne",10,"Latido","Correr");
		Cavalo horse = new Cavalo("Spirit",13,"Relincho","Correr");
		Preguica sloth = new Preguica("Soneca",5,"Incógnita","Subir em árvore");
		
		dog.imprimirInfo();
		horse.imprimirInfo();
		sloth.imprimirInfo();

	}

}
