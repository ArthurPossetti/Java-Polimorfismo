package atividadePolimorfismo;

public class Funcionario extends Pessoa{
	
	private double salario;
	
	
	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double calculaImposto() {
		double imposto;
		imposto = getSalario() * 0.03;
		return imposto;
	}
	
	public void imprimeDados() {
		System.out.println("Nome do Funcionario: " + super.getNome());
		System.out.println("Salario: " + getSalario());
		System.out.println("Imposto: " + calculaImposto());
		System.out.println("Dia de Nascimento: " + super.getNascimento().getDia());
		System.out.println("Mês de Nascimento: " + super.getNascimento().getMes());
		System.out.println("Ano de Nascimento: " + super.getNascimento().getAno());
	}

}
