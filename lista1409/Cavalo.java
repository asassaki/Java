package lista1409;

public class Cavalo extends Animal {
	
	private String som;
	private String acao;
	
	public Cavalo(String nome,int idade,String som,String acao) {
		super(nome,idade);
		this.som = som;
		this.acao = acao;
		
	}
	
	public void seMove() {
		System.out.println("\nAção: Correr");
	}
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	/*
	public void imprimirInfo() {
		System.out.println("\nAnimal: Cavalo"+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+som+"\nAção: "+acao);
	}*/
	
	
	@Override
	public void emiteSom(String barulho) {
			System.out.println("\nSom: Relincho");
	}
	
	@Override
	public void imprimirInfo(String nome,int idade) {
		System.out.println("\nAnimal: Cavalo"+"\nNome: "+getNome()+"\nIdade: "+getIdade());
	}
	

}
