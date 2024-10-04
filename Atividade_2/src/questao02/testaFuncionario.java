package questao02;

public class testaFuncionario {
	public static void main(String[] args) {
		funcionario f1 = new funcionario();
		f1.nome = "Marcus";
		f1.rg = "85613-7";
		f1.departamento = "Financeiro";
		f1.salario = 500;
		f1.dataEntrada = "21/06/2023";
		f1.recebeAumento(100);
		
		System.out.println("O nome é: " + f1.nome);
		System.out.println("O rg é: " + f1.rg);
		System.out.println("O departamento é: " + f1.departamento);
		System.out.println("A data de entrada é: " + f1.dataEntrada);
		System.out.println("O salário atual é: " + f1.salario);
		System.out.println("O salário anual é: " + f1.calculaGanhoAnual());
	}
}
