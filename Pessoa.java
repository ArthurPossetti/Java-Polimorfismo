package atividadePolimorfismo;

public abstract class Pessoa {
	private String nome;
	
	private Data nascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getNascimento() {
		return nascimento;
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}
	
	public abstract void imprimeDados();
}
