package questao8;

public class Main {
	public static void main(String[] args) {	
		funcionario f1 = new funcionario();
		
		f1.rg = "57593-5";
		f1.nome = "Paulo";
		f1.departamento = "Comercial";
		f1.salario = 6000;
		int dia = 18;
		int mes = 8;
		int ano = 2023;
		Data data = new Data(dia, mes, ano);
		f1.setDataDeEntrada(data);
		f1.mostra();
	}
}
