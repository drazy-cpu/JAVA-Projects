package questao03;

public class Funcionario {
	private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private Data dataDeEntrada;
    private String id;

    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getDepartamento() {
    	return departamento;
    }
    
    public void setDepartamento(String departamento) {
    	this.departamento = departamento;
    }
    
    public double getSalario() {
    	return salario;
    }
    
    public void setSalario(double salario) {
    	this.salario = salario;
    }
    
	public void recebeAumento(double aumento) {
        salario += aumento;
    }
    
	public double calculaGanhoAnual() {
    	return salario * 12;
    }
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public Data getDataDeEntrada() {
		return dataDeEntrada;
	}
	
	public void setDataDeEntrada(Data dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}
