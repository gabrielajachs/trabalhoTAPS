package modelo;

public class ProfessorDE extends Professor {
	
	private float salarioBase;
	
	public ProfessorDE(String matricula, String nome, float salB) {
		super(matricula, nome);
		this.salarioBase = salB;
		// TODO Auto-generated constructor stub
	}

	
	
	
	public float getSalarioBase() {
		return salarioBase;
	}

	
	
	
	
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	
	
	
	
	public float calculaSalario() {
		setSalarioFinal(salarioBase*2);
		return getSalarioFinal();
	}

}
