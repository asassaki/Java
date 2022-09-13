package lista1309;

public class Paciente {
	
	private String nomePaciente;
	private String genero;
	private String especialidade;
	private int idade;
	
	public Paciente(String nomePaciente,String genero,String especialidade,int idade) {
		this.nomePaciente = nomePaciente;
		this.genero = genero;
		this.especialidade = especialidade;
		this.idade = idade;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do paciente: "+nomePaciente+"  Gênero: "+genero+"  Idade: "+idade+"  Especialidade: "+especialidade);
	}

}
