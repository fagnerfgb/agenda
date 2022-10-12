package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class Agenda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtFone;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Construtor
	 */
	public Agenda() {
		setTitle("Agenda de Contatos");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Agenda.class.getResource("/img/favicon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 10, 46, 14);
		contentPane.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(107, 10, 60, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 40, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblFone = new JLabel("Fone");
		lblFone.setBounds(10, 70, 46, 14);
		contentPane.add(lblFone);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 100, 46, 14);
		contentPane.add(lblEmail);
		
		txtNome = new JTextField();
		txtNome.setBounds(107, 40, 150, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtFone = new JTextField();
		txtFone.setBounds(107, 70, 150, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(107, 100, 150, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnAdicionar = new JButton("");
		btnAdicionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar.setBorderPainted(false);
		btnAdicionar.setToolTipText("Adicionar  contato");
		btnAdicionar.setIcon(new ImageIcon(Agenda.class.getResource("/img/add.png")));
		btnAdicionar.setBounds(7, 137, 64, 64);
		contentPane.add(btnAdicionar);
		
		JButton btnRemover = new JButton("");
		btnRemover.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemover.setBorderPainted(false);
		btnRemover.setIcon(new ImageIcon(Agenda.class.getResource("/img/delete.png")));
		btnRemover.setToolTipText("Remover contato");
		btnRemover.setBounds(78, 137, 64, 64);
		contentPane.add(btnRemover);
		
		JButton btnAtualizar = new JButton("");
		btnAtualizar.setToolTipText("Atualizar contato");
		btnAtualizar.setIcon(new ImageIcon(Agenda.class.getResource("/img/update.png")));
		btnAtualizar.setBorderPainted(false);
		btnAtualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAtualizar.setBounds(149, 137, 64, 64);
		contentPane.add(btnAtualizar);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.setBorderPainted(false);
		btnPesquisar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar.setToolTipText("Pesquisar");
		btnPesquisar.setIcon(new ImageIcon(Agenda.class.getResource("/img/search.png")));
		btnPesquisar.setBounds(220, 137, 64, 64);
		contentPane.add(btnPesquisar);
	} // Fim do construtor
}
