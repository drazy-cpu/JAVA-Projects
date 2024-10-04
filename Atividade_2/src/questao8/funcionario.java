package questao8;

public class funcionario {
	String nome;
	String departamento;
	double salario;
	String rg;
	Data dataDeEntrada;
    
	public void recebeAumento(double aumento) {
        salario += aumento;
    }
    
	public double calculaGanhoAnual() {
    	return salario * 12;
    }
	
	public Data getDataDeEntrada() {
		return dataDeEntrada;
	}
	
	public void setDataDeEntrada(Data dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	
	public void mostra() {
		System.out.println(nome);
		System.out.println(rg);
		System.out.println(salario);
		System.out.println(departamento);
		System.out.println(dataDeEntrada);
	}
}
