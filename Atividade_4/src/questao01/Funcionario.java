package questao01;

public class Funcionario {
	private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private Data dataDeEntrada;
    private String id;

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
