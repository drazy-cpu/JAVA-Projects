package questao04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos funcionários a empresa possui?");
		int qtd = scanner.nextInt();
		Empresa e = new Empresa(qtd);
		e.nome = "Apple";
		e.cnpj = "12.345.678/0001-90";
		e.dataAbertura = "01/04/1976";
		for (int i = 0; i < qtd; i++) {
			Funcionario f = new Funcionario();
			System.out.println("Digite o nome do funcionário: ");
			f.nome = scanner.next();
			System.out.println("Digite o salário do funcionário: ");
			f.salario = scanner.nextDouble();
			e.adiciona(f);
		}
		e.mostraEmpregados();
	}
}
