package atividadePolimorfismo;

import java.util.Scanner;

public class CadastroPessoa {

	
	public void cadastraPessoa(Pessoa pessoa) {
		
		Scanner entrada = new Scanner(System.in);
		Data nasc = new Data();
		
		
		System.out.println("Informe o nome da pessoa: ");
		pessoa.setNome(entrada.next());
		
		System.out.println("Informe o dia do nascimento: ");
		nasc.setDia(entrada.nextInt());
		
		System.out.println("Informe o mês do nascimento: ");
		nasc.setMes(entrada.nextInt());
		
		System.out.println("Informe o ano do nascimento: ");
		nasc.setAno(entrada.nextInt());
		
		pessoa.setNascimento(nasc);
		
		
		
		
		
	}

}
