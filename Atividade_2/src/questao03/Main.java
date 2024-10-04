package questao03;

public class Main {
	public static void main(String[] args) {	
		funcionario f1 = new funcionario();
		f1.rg = "4859-5";
		f1.nome = "Marcus";
		f1.dataEntrada = "19/07/2006";
		f1.departamento = "Financeiro";
		f1.salario = 5000;
		f1.mostra();
	}
}
