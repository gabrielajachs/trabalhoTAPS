package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class TelaCadastro extends JPanel {
	private JTextField fieldMatricula;
	private JTextField fieldNome;
	private JRadioButton radioDe;
	private JRadioButton radioHorista;
	
	
	
	private ButtonGroup group;
	private JTextField fieldSalarioBase;
	private JTextField fiedlHorasTrabalhadas;
	private JTextField fieldValorHora;
	private JButton btnCadastrarCadastro;
	private JButton btnLimparCadastro;
	

	
	
	
	/** eh a tela lancamento da professora
	 * Create the panel.
	 */
	public TelaCadastro() {
		setLayout(new MigLayout("", "[45px][]", "[13px][][][][][][][]"));
		
		JLabel labelCabecalho = new JLabel("TELA DE CADASTRO DE PROFESSORES");
		labelCabecalho.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(labelCabecalho, "cell 0 0,alignx left,aligny top");
		
		JLabel labelMatricula = new JLabel("Matrícula:");
		add(labelMatricula, "flowx,cell 0 1");
		
		fieldMatricula = new JTextField();
		add(fieldMatricula, "cell 0 1");
		fieldMatricula.setColumns(10);
		
		JLabel labelTipoDeProfessor = new JLabel("Tipo de Professor:");
		add(labelTipoDeProfessor, "flowx,cell 0 2");
		
		radioDe = new JRadioButton("DE");
		radioDe.setActionCommand("D");
		add(radioDe, "cell 0 2");
		
		radioHorista = new JRadioButton("Horista");
		radioHorista.setActionCommand("H");
		add(radioHorista, "cell 0 2");
		
		group = new ButtonGroup();
		group.add(radioDe);
		group.add(radioHorista);
		
		JLabel labelSalarioBase = new JLabel("Salário base:");
		add(labelSalarioBase, "flowx,cell 0 3");
		
		fieldSalarioBase = new JTextField();
		add(fieldSalarioBase, "cell 0 3,growx");
		fieldSalarioBase.setColumns(10);
		
		JLabel labelHorasTrabalhadas = new JLabel("Horas Trabalhadas:");
		add(labelHorasTrabalhadas, "flowx,cell 0 4");
		
		fiedlHorasTrabalhadas = new JTextField();
		add(fiedlHorasTrabalhadas, "cell 0 4,growx");
		fiedlHorasTrabalhadas.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome:");
		add(labelNome, "cell 0 1");
		
		fieldNome = new JTextField();
		add(fieldNome, "cell 0 1");
		fieldNome.setColumns(10);
		
		JLabel labelValorHora = new JLabel("Valor Hora:");
		add(labelValorHora, "flowx,cell 0 5");
		
		fieldValorHora = new JTextField();
		add(fieldValorHora, "cell 0 5,growx");
		fieldValorHora.setColumns(10);
		
		btnCadastrarCadastro = new JButton("Cadastrar");
		add(btnCadastrarCadastro, "flowx,cell 0 7");
		
		btnLimparCadastro = new JButton("Limpar Tela");
		add(btnLimparCadastro, "cell 0 7");
		btnLimparCadastro.setActionCommand("Limpar Tela Cadastro");

	}


	public JTextField getFieldMatricula() {
		return fieldMatricula;
	}


	public void setFieldMatricula(JTextField fieldMatricula) {
		this.fieldMatricula = fieldMatricula;
	}


	public JTextField getFieldNome() {
		return fieldNome;
	}


	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}


	public JRadioButton getRadioDe() {
		return radioDe;
	}


	public void setRadioDe(JRadioButton radioDe) {
		this.radioDe = radioDe;
	}


	public JRadioButton getRadioHorista() {
		return radioHorista;
	}


	public void setRadioHorista(JRadioButton radioHorista) {
		this.radioHorista = radioHorista;
	}


	public ButtonGroup getGroup() {
		return group;
	}


	public void setGroup(ButtonGroup group) {
		this.group = group;
	}


	public JTextField getFieldSalarioBase() {
		return fieldSalarioBase;
	}


	public void setFieldSalarioBase(JTextField fieldSalarioBase) {
		this.fieldSalarioBase = fieldSalarioBase;
	}


	public JTextField getFiedlHorasTrabalhadas() {
		return fiedlHorasTrabalhadas;
	}


	public void setFiedlHorasTrabalhadas(JTextField fiedlHorasTrabalhadas) {
		this.fiedlHorasTrabalhadas = fiedlHorasTrabalhadas;
	}


	public JTextField getFieldValorHora() {
		return fieldValorHora;
	}


	public void setFieldValorHora(JTextField fieldValorHora) {
		this.fieldValorHora = fieldValorHora;
	}


	public JButton getBtnCadastrarCadastro() {
		return btnCadastrarCadastro;
	}


	public void setBtnCadastrarCadastro(JButton btnCadastrarCadastro) {
		this.btnCadastrarCadastro = btnCadastrarCadastro;
	}


	public JButton getBtnLimparCadastro() {
		return btnLimparCadastro;
	}


	public void setBtnLimparCadastro(JButton btnLimparCadastro) {
		this.btnLimparCadastro = btnLimparCadastro;
	}
	
	public void LimparTelaLanc() { //PARA LIMPAR A TELA 
		fieldMatricula.setText("");
		fieldNome.setText("");
		fieldSalarioBase.setText("");
		fieldValorHora.setText("");
		fiedlHorasTrabalhadas.setText("");
		group.clearSelection();
	}

}
