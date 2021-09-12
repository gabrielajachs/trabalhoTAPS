package controle;

import modelo.Professor;
import visao.JanelaPrincipal;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		JanelaPrincipal j = new JanelaPrincipal();
		j.setVisible(true);
		Professor p = new Professor(null, null);
		
		ProfessorControle pcon = new ProfessorControle(j, p);
	}

}
