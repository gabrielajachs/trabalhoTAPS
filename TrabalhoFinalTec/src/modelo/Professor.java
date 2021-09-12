package modelo;

public class Professor {
	
	private String mat;
	private String no;
	private float sf;
	
	
	public Professor(String mat, String no) {
		super();
		this.mat = mat;
		this.no = no;
	}


	
	
	public String getMat() {
		return mat;
	}


	public void setMat(String mat) {
		this.mat = mat;
	}

	
	

	public String getNo() {
		return no;
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
