package modelo;

public class ProfessorHorista extends Professor {
	
	private int quantHoras;
	private float valorHora;
	
	public ProfessorHorista(String matricula, String nome, int qh, float vh) {
		super(matricula, nome);
		this.quantHoras = qh;
		this.valorHora = vh;
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public int getQuantHoras() {
		return quantHoras;
	}

	public void setQuantHoras(int quantHoras) {
		this.quantHoras = quantHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	
	
	
	
	public float calculaSalario() {
		setSalarioFinal(valorHora * quantHoras);
		
		return getSalarioFinal();
	}
	

}
