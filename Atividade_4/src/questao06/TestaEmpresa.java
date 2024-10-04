package questao06;

import java.util.Scanner;

public class TestaEmpresa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos funcionários a empresa possui?");
		int qtd = scanner.nextInt();
		Empresa e = new Empresa(qtd);
		System.out.println("Digite o nome da empresa: ");
		String nome = scanner.next();
		e.setNome(nome);
		System.out.println("Digite o cnpj da empresa: ");
		String cnpj = scanner.next();
		e.setCnpj(cnpj);
		System.out.println("Digite a data de abertura da empresa: ");
		String dataAbertura = scanner.next();
		e.setDataAbertura(dataAbertura);
		for (int i = 0; i < qtd; i++) {
			Funcionario f = new Funcionario();
			System.out.println("Digite o nome do funcionário: ");
			String nomeF = scanner.next();
			f.setNome(nomeF);
			System.out.println("Digite o identificador do funcionário: ");
			int identificador = scanner.nextInt();
			f.setIdentificador(identificador);
			e.adiciona(f);
		}
		Funcionario funcionarioProcurado = new Funcionario();
		System.out.println("Digite o nome do funcionário procurado: ");
		String nomeF = scanner.next();
		funcionarioProcurado.setNome(nomeF);
		System.out.println("Digite o identificador do funcionário procurado: ");
		int identificador = scanner.nextInt();
		funcionarioProcurado.setIdentificador(identificador);
		
        if (e.verificaFuncionario(funcionarioProcurado)) {
            System.out.println("O funcionário " + funcionarioProcurado.getNome() + " de identificador " + funcionarioProcurado.getIdentificador() + " está empregado na empresa.");
        } else {
            System.out.println("O funcionário " + funcionarioProcurado.getNome() + " de identificador " + funcionarioProcurado.getIdentificador() + " não está empregado na empresa.");
        }
	}
}