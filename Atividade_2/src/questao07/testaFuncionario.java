package questao07;

import java.util.Scanner;

public class testaFuncionario {
	public static void main(String[] args) {
		funcionario f1 = new funcionario();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário: ");
		f1.nome = scanner.next();
		System.out.println("Digite o salário do funcionário: ");
		f1.salario = scanner.nextDouble();
		System.out.println("Digite o dia da entrada do funcionário no banco: ");
		int dia = scanner.nextInt();		
		System.out.println("Digite o mês da entrada do funcionário no banco: ");
		int mes = scanner.nextInt();	
		System.out.println("Digite o ano da entrada do funcionário no banco: ");
		int ano = scanner.nextInt();
		Data data = new Data(dia, mes, ano);
		f1.setDataDeEntrada(data);
		
		System.out.print("O nome do funcionário é " + f1.nome + ", seu salário atual é de " + f1.salario + " e entrou no banco no dia " + f1.getDataDeEntrada());
	}
}
