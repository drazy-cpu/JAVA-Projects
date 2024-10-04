package questao06;

public class Empresa {
	Funcionario[] empregados;
	private String nome;
	private String cnpj;
	private String dataAbertura;
	int auxiliar = 0;
	
	
	public Empresa(int tamanho) {
        empregados = new Funcionario[tamanho];
    }
	
	void adiciona (Funcionario f) {
		this.empregados[auxiliar] = f;
		auxiliar++;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getDataAbertura() {
		return dataAbertura;
	}
	
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	void mostraEmpregados(int posicao){
		System.out.println("O funcionário está na posição " + posicao);
		System.out.println("O nome do funcionário da posição " + posicao + " é: " + empregados[posicao].getNome());
		System.out.println("O salário do funcionário da posição " + posicao + " é: " + empregados[posicao].getSalario());
	}
	
	public boolean verificaFuncionario(Funcionario f) {
        for (int i = 0; i < auxiliar; i++) {
        	if (empregados[i].getIdentificador() == f.getIdentificador()) {
        	    return true;
        	}
        }
        return false;
    }
}
