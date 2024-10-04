package questao01;

public class Main {
	public static void main(String[] args){
		Funcionario f = new Funcionario();
		f.nome = "Marcus";
		f.rg = "89230-4";
		f.salario = 2500;
		int dia = 23;
		int mes = 8;
		int ano = 2022;
		Data data = new Data(dia, mes, ano);
		f.setDataDeEntrada(data);
		
		System.out.println("Nome: " + f.nome);
		System.out.println("Rg: " + f.rg);
		System.out.println("Salário: " + f.salario);
		System.out.println("Data: " + f.getDataDeEntrada());
		
		/*A resposta para estar dando erro em f.nome, f.rg e f.salario é por seus respectivos atributos serem privados.
		  Então pelos atributos estarem privados, o código só funcionaria se a classe Main estivesse dentro da 
		  classe Funcionario. Tudo isso não se aplica a data, pois possui métodos set e get.*/
	}
}
