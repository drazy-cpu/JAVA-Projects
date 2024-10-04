package questao03;

import java.util.Scanner;

public class TestaEmpresa {
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
			String nome = scanner.next();
			f.setNome(nome);
			System.out.println("Digite o id do funcionário: ");
			String id = scanner.next();
			f.setId(id);
			e.adiciona(f);
		}
		Funcionario funcionarioProcurado = new Funcionario();
		System.out.println("Digite o nome do funcionário procurado: ");
		String nome = scanner.next();
		funcionarioProcurado.setNome(nome);
		System.out.println("Digite o id do funcionário procurado: ");
		String id = scanner.next();
		funcionarioProcurado.setId(id);
		
        if (e.verificaFuncionario(funcionarioProcurado)) {
            System.out.println("O funcionário " + funcionarioProcurado.getNome() + " de id " + funcionarioProcurado.getId() + " está empregado na empresa.");
        } else {
            System.out.println("O funcionário " + funcionarioProcurado.getNome() + " de id " + funcionarioProcurado.getId() + " não está empregado na empresa.");
        }
	}
}
