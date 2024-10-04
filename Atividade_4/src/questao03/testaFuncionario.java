package questao03;

import java.util.Scanner;

public class testaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário: ");
		String nome = scanner.next();
		f1.setNome(nome);
		System.out.println("Digite o salário do funcionário: ");
		double salario = scanner.nextDouble();
		f1.setSalario(salario);
		System.out.println("Digite o rg do funcionário: ");
		String rg = scanner.next();
		f1.setRg(rg);
		System.out.println("Digite o dia da entrada do funcionário no banco: ");
		int dia = scanner.nextInt();		
		System.out.println("Digite o mês da entrada do funcionário no banco: ");
		int mes = scanner.nextInt();	
		System.out.println("Digite o ano da entrada do funcionário no banco: ");
		int ano = scanner.nextInt();
		Data data = new Data(dia, mes, ano);
		f1.setDataDeEntrada(data);
		
		System.out.print("O nome do funcionário é " + f1.getNome() + " de rg " + f1.getRg() + ", seu salário atual é de " + f1.getSalario() + " e entrou no banco no dia " + f1.getDataDeEntrada());
	}
}
