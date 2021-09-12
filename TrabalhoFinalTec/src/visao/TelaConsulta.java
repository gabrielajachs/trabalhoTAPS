package visao;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class TelaConsulta extends JPanel {
	private JTextField fieldMatricula;
	private JButton btnConsultar;
	private JButton btnLimparConsulta;
	private JTextArea textAreaMensagem;
	

	/**
	 * Create the panel.
	 */
	public TelaConsulta() {
		setLayout(new MigLayout("", "[45px,grow][45px,grow][45px,grow][50px]", "[13px][][][grow][]"));
		
		JLabel lblNewLabel = new JLabel("TELA DE CONSULTA DE PAGAMENTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(lblNewLabel, "cell 0 0 3 1,alignx left,aligny top");
		
		JLabel labelMatricula = new JLabel("Matrícula:");
		add(labelMatricula, "flowx,cell 0 2");
		
		fieldMatricula = new JTextField();
		add(fieldMatricula, "cell 0 2 2 1,growx");
		fieldMatricula.setColumns(10);
		
		textAreaMensagem = new JTextArea();
		add(textAreaMensagem, "cell 0 3 3 1,grow");
		
		btnConsultar = new JButton("Consultar");
		add(btnConsultar, "flowx,cell 0 4 2 1,growx,gapy 20");
		
		btnLimparConsulta = new JButton("Limpar Tela");
		add(btnLimparConsulta, "cell 0 4 3 1,growx");

	}


	public JTextField getFieldMatricula() {
		return fieldMatricula;
	}


	public void setFieldMatricula(JTextField fieldMatricula) {
		this.fieldMatricula = fieldMatricula;
	}


	public JButton getBtnConsultar() {
		return btnConsultar;
	}


	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}


	public JButton getBtnLimparConsulta() {
		return btnLimparConsulta;
	}


	public void setBtnLimparConsulta(JButton btnLimparConsulta) {
		this.btnLimparConsulta = btnLimparConsulta;
	}


	public JTextArea getTextAreaMensagem() {
		return textAreaMensagem;
	}


	public void setTextAreaMensagem(JTextArea textAreaMensagem) {
		this.textAreaMensagem = textAreaMensagem;
	}
	
	public void limpaTelaConsulta() {
		fieldMatricula.setText("");
		textAreaMensagem.setText("");;
		
	}

}
