package gamesshop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class telalogin {

	private JFrame frmGameshop;
	private JTextField txtusuario;
	private JPasswordField txtsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telalogin window = new telalogin();
					window.frmGameshop.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telalogin() {
		initialize();
	}
public void visivel() {
	telalogin window = new telalogin();
	window.frmGameshop.setVisible(true);
}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGameshop = new JFrame();
		frmGameshop.setIconImage(Toolkit.getDefaultToolkit().getImage(telalogin.class.getResource("/imagens/hacker-mascot-for-sports-and-esports-logo-free-vector.jpg")));
		frmGameshop.setTitle("gameshop");
		frmGameshop.setBounds(100, 100, 450, 300);
		frmGameshop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGameshop.getContentPane().setLayout(null);
		
		JButton txtentre = new JButton("");
		txtentre.setIcon(new ImageIcon(telalogin.class.getResource("/imagens/Primary button.png")));
		txtentre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = txtusuario.getText();
				String Senha = txtsenha.getText();
				bancodedados bd = new bancodedados();
				bd.conectar();
				if(bd.verificarlogin(usuario, Senha)) {
					telacatalogo tel = new telacatalogo();
					tel.visivel();
					frmGameshop.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Usuario ou senha invalido","atenção",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		txtentre.setBounds(122, 227, 89, 23);
		frmGameshop.getContentPane().add(txtentre);
		
		
		txtusuario = new JTextField();
		txtusuario.setBounds(140, 82, 163, 20);
		frmGameshop.getContentPane().add(txtusuario);
		txtusuario.setColumns(10);
		txtusuario.setBorder(null);
		txtusuario.setOpaque(false);
		
		txtsenha = new JPasswordField();
		txtsenha.setBounds(140, 144, 163, 20);
		frmGameshop.getContentPane().add(txtsenha);
		txtsenha.setBorder(null);
		txtsenha.setOpaque(false);
		
		JCheckBox exibirsenha = new JCheckBox("exibir senha");
		exibirsenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(exibirsenha.isSelected()) {
					txtsenha.setEchoChar((char)0);
				}else {
					txtsenha.setEchoChar('*');
				}
			}
		});
		exibirsenha.setBounds(136, 175, 97, 23);
		frmGameshop.getContentPane().add(exibirsenha);
		if(exibirsenha.isSelected()) {
			txtsenha.setEchoChar((char)0);
		}else {
			txtsenha.setEchoChar('*');
		}
		
		JButton cadastro = new JButton("");
		cadastro.setIcon(new ImageIcon(telalogin.class.getResource("/imagens/Primary button-1.png")));
		cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telacadastro tel = new telacadastro();
				tel.visivel();
				frmGameshop.dispose();
			}
		});
		cadastro.setBounds(243, 227, 89, 23);
		frmGameshop.getContentPane().add(cadastro);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(telalogin.class.getResource("/imagens/TV - 1 (1).png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frmGameshop.getContentPane().add(lblNewLabel);
	}
}
