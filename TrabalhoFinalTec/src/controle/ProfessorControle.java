package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;

import modelo.Professor;
import modelo.ProfessorDE;
import modelo.ProfessorHorista;
import visao.JanelaPrincipal;

public class ProfessorControle implements ActionListener, MouseListener {

	private LinkedList<Professor> lista = new LinkedList<Professor>();
	private JanelaPrincipal jan;
	private Professor prof;
	
	public ProfessorControle(JanelaPrincipal j, Professor p) {
		
		this.jan = j;
		this.prof = p;
		this.jan.getTelaLanc().getBtnCadastrarCadastro().addActionListener(this);
		this.jan.getTelaLanc().getBtnLimparCadastro().addActionListener(this);
		this.jan.getTelaLanc().getRadioDe().addActionListener(this);
		this.jan.getTelaCon().getBtnConsultar().addActionListener(this);
		this.jan.getTelaLanc().getRadioHorista().addMouseListener(this);
		this.jan.getTelaLanc().getRadioDe().addMouseListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Limpar Tela Cadastro")) {
			
			this.jan.getTelaLanc().LimparTelaLanc(); //PARA LIMPAR A TELA
			
		}
		if(e.getActionCommand().equals("Cadastrar")) 
		{
			if(this.jan.getTelaLanc().getGroup().getSelection().getActionCommand().equals("D")) 
			{
				String matAux = this.jan.getTelaLanc().getFieldMatricula().getText();
				String nomeAux = this.jan.getTelaLanc().getFieldNome().getText();
				float salAux = Float.parseFloat(this.jan.getTelaLanc().getFieldSalarioBase().getText());
				
				prof = new ProfessorDE(matAux, nomeAux, salAux);
				prof.calculaSalario();
				
				lista.add(prof);
				
				this.jan.getTelaLanc().LimparTelaLanc();
				
			}
			else if(this.jan.getTelaLanc().getGroup().getSelection().getActionCommand().equals("H")) {
				
				String matAux = this.jan.getTelaLanc().getFieldMatricula().getText();
				String nomeAux = this.jan.getTelaLanc().getFieldNome().getText();
				int quantHAux= Integer.parseInt(this.jan.getTelaLanc().getFiedlHorasTrabalhadas().getText());
				float valHAux = Float.parseFloat(this.jan.getTelaLanc().getFieldValorHora().getText());
				
				prof = new ProfessorHorista(matAux, nomeAux, quantHAux, valHAux);
				prof.calculaSalario();
				
				lista.add(prof);
				
				this.jan.getTelaLanc().LimparTelaLanc();
				
			}	
				
			}
		
		else if(e.getActionCommand().equals("Consultar")) 
		{
			
			for (int i = 0; i < lista.size(); i++) {
				if(this.jan.getTelaCon().getFieldMatricula().getText().equals(lista.get(i).getMatricula()))
				{
					this.jan.getTelaCon().getTextAreaMensagem().setText(lista.get(i).toString());
				}
				
			}
			
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.jan.getTelaLanc().getRadioDe()) 
		{	
			this.jan.getTelaLanc().getFieldSalarioBase().setEnabled(true);
			this.jan.getTelaLanc().getFiedlHorasTrabalhadas().setEnabled(false);
			this.jan.getTelaLanc().getFieldValorHora().setEnabled(false);
		}
		else if(e.getSource()==this.jan.getTelaLanc().getRadioHorista())
		{
			this.jan.getTelaLanc().getFieldSalarioBase().setEnabled(false);
			this.jan.getTelaLanc().getFiedlHorasTrabalhadas().setEnabled(true);
			this.jan.getTelaLanc().getFieldValorHora().setEnabled(true);
		}
			
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


