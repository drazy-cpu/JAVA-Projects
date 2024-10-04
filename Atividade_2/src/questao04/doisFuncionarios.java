package questao04;

import java.util.Scanner;

public class doisFuncionarios {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		funcionario f1 = new funcionario();
		System.out.println("Digite o nome do primeiro funcionário: ");
		f1.nome = scanner.next();
		System.out.println("Digite o salário do primeiro funcionário: ");
		f1.salario = scanner.nextInt();
		
		funcionario f2 = new funcionario();
		System.out.println("Digite o nome do segundo funcionário: ");
		f2.nome = scanner.next();
		System.out.println("Digite o salário do segundo funcionário: ");
		f2.salario = scanner.nextInt();
		
		
		if (f1 == f2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		//Sempre será diferente, pois essas variáveis não guardam objetos, e sim uma referência para acessar.
		//Por essa razão, mesmo que os atributos sejam iguais, sempre irá a aparecer a mensagem "diferente".
		//A única maneira de aparecer a mensagem "iguais", é igualando-as: f1 = f2.
	}
}
