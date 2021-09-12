package visao;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenu mnPrincipal;
	private JMenuItem itemCadastrar; //lancamento da prof
	private JMenuItem itemConsultar;
	
	private CardLayout card;
	private TelaCadastro telaLanc;
	private TelaConsulta telaCon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Lançamentos de Pagamentos Docentes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		itemCadastrar = new JMenuItem("Cadastrar Pagamento");
		mnPrincipal.add(itemCadastrar);
		itemCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "painel1");
			}
		});
		
		itemConsultar = new JMenuItem("Consultar Pagamento");
		mnPrincipal.add(itemConsultar);
		itemConsultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				card.show(contentPane, "painel2");
				getTelaCon().limpaTelaConsulta();
			}
		});
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		card = new CardLayout(0,0);
		contentPane.setLayout(card);
		
		telaLanc = new TelaCadastro();
		telaCon = new TelaConsulta();
		
		contentPane.add(telaLanc, "painel1");
		contentPane.add(telaCon, "painel2");
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

	public TelaCadastro getTelaLanc() {
		return telaLanc;
	}

	public void setTelaLanc(TelaCadastro telaLanc) {
		this.telaLanc = telaLanc;
	}

	public TelaConsulta getTelaCon() {
		return telaCon;
	}

	public void setTelaCon(TelaConsulta telaCon) {
		this.telaCon = telaCon;
	}

	
	
	
}
