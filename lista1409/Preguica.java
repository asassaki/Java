package lista1409;

public class Preguica extends Animal {
	
	private String som;
	private String acao;
	
	public Preguica(String nome,int idade,String som,String acao) {
		super(nome,idade);
		this.setSom(som);
		this.setAcao(acao);
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
	
	public void imprimirInfo() {
		System.out.println("\nAnimal: Preguiça"+"\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+som+"\nAção: "+acao);

	}

}
