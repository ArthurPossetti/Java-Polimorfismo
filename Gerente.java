package atividadePolimorfismo;

public class Gerente extends Funcionario {
	private String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public double calculaImposto() {
		double imposto;
		imposto = super.getSalario() * 0.05;
		return imposto;
	}
	
	public void imprimeDados() {
		System.out.println("Nome do Gerente: " + super.getNome());
		System.out.println("Area: " + getArea());
		System.out.println("Salario: " + super.getSalario());
		System.out.println("Imposto: " + calculaImposto());
		System.out.println("Dia de Nascimento: " + super.getNascimento().getDia());
		System.out.println("Mês de Nascimento: " + super.getNascimento().getMes());
		System.out.println("Ano de Nascimento: " + super.getNascimento().getAno());
	}

}
