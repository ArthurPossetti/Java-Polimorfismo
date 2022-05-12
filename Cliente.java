package atividadePolimorfismo;

public class Cliente extends Pessoa{
	
	private int codigo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void imprimeDados() {
		System.out.println("Código do Cliente: " + getCodigo());
		System.out.println("Nome do Cliente: " + super.getNome());
		System.out.println("Dia de Nascimento: " + super.getNascimento().getDia());
		System.out.println("Mês de Nascimento: " + super.getNascimento().getMes());
		System.out.println("Ano de Nascimento: " + super.getNascimento().getAno());
	}
	

}
