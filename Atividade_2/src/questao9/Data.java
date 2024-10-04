package questao9;

public class Data {
	int dia;
	int mes;
	int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//O método para que devolva o valor da data formatado é este, que foi usado desde a questão 06.
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}
