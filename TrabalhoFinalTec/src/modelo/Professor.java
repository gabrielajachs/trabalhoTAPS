package modelo;

public class Professor {
	
	private String matricula;
	private String nome;
	private float salarioFinal;
	
	
	public Professor(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getSalarioFinal() {
		return salarioFinal;
	}


	public void setSalarioFinal(float salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	
	public float calculaSalario() {
		
		return 0;
	}
	
	public String toString() {
		return "\nMatricula: " +getMatricula()+ "\n"
				+"Nome: " +getNome() + "\n"
				+"Salario Final: " +getSalarioFinal();
	}
	
}
