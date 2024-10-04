package questao9;

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
}
