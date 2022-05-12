package atividadePolimorfismo;

import java.util.Scanner;

public class TestaCadastro {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		Funcionario func = new Funcionario();
		Gerente gerente = new Gerente();

		Scanner entrada = new Scanner(System.in);

		String tipo;

		System.out.println("informe o tipo de Pessoa para cadastrar: ");
		tipo = entrada.next();

		if (tipo.equals("gerente")) {
			CadastroPessoa cadastro = new CadastroPessoa();
			cadastro.cadastraPessoa(gerente);
			System.out.println("Informe a área do gerente: ");
			gerente.setArea(entrada.next());
			
		} else if (tipo.equals("funcionario")) {
			CadastroPessoa cadastro = new CadastroPessoa();
			cadastro.cadastraPessoa(func);
			System.out.println("Informe o salario do funcionario: ");
			func.setSalario(entrada.nextDouble());
			
		} else if (tipo.equals("cliente")) {
			CadastroPessoa cadastro = new CadastroPessoa();
			cadastro.cadastraPessoa(cliente);
			System.out.println("Informe o codigo do cliente: ");
			cliente.setCodigo(entrada.nextInt());
		}

	}

}
