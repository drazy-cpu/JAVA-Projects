package questao05;

import java.util.Scanner;

public class mesmoFuncionario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		funcionario f1 = new funcionario();
		System.out.println("Digite o nome do primeiro funcionário: ");
		f1.nome = scanner.next();
		System.out.println("Digite o salário do primeiro funcionário: ");
		f1.salario = scanner.nextInt();
		
		funcionario f2 = new funcionario();
		f2 = f1;
		
		if (f1 == f2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		//Neste caso sempre aparecerá a mensagem "iguais", pois os atributos foram igualados.
	}
}
