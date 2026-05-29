package gamesshop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;

public class telacadastro {

	private JFrame frmCadastro;
	MaskFormatter maskcpf;
	MaskFormatter maskdata;
	MaskFormatter maskcep;
	MaskFormatter masktelefone ;
	private JTextField txtemail;
	private JPasswordField passwordsenha;
	private JPasswordField passwordcs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telacadastro window = new telacadastro();
					window.frmCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telacadastro() {
		initialize();
	}
public void visivel() {
	telacadastro window = new telacadastro();
	window.frmCadastro.setVisible(true);
}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastro = new JFrame();
		frmCadastro.setTitle("Cadastro");
		frmCadastro.setBounds(100, 100, 450, 415);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastro.getContentPane().setLayout(null);
		try {
			maskcpf = new MaskFormatter("###.###.###-##");
			maskdata = new MaskFormatter("##/##/####");
			maskcep = new MaskFormatter("#####-###");
			masktelefone = new MaskFormatter("## #####-####");
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "erro","aviso",-1);
		}
		
		passwordcs = new JPasswordField();
		passwordcs.setBounds(77, 286, 293, 24);
		frmCadastro.getContentPane().add(passwordcs);
		
		passwordsenha = new JPasswordField();
		passwordsenha.setBounds(77, 243, 293, 23);
		frmCadastro.getContentPane().add(passwordsenha);
		
		txtemail = new JTextField();
		txtemail.setBounds(78, 210, 292, 20);
		frmCadastro.getContentPane().add(txtemail);
		txtemail.setColumns(10);
		
		JFormattedTextField txtnome = new JFormattedTextField();
		txtnome.setBounds(77, 16, 293, 26);
		frmCadastro.getContentPane().add(txtnome);
		
		JFormattedTextField txtcpf = new JFormattedTextField(maskcpf);
		txtcpf.setBounds(77, 51, 293, 27);
		frmCadastro.getContentPane().add(txtcpf);
		
		
		JFormattedTextField txtendereço = new JFormattedTextField();
		txtendereço.setBounds(77, 117, 293, 24);
		frmCadastro.getContentPane().add(txtendereço);
		
		JFormattedTextField txtdata = new JFormattedTextField(maskdata);
		txtdata.setBounds(77, 86, 293, 26);
		frmCadastro.getContentPane().add(txtdata);
		
		JFormattedTextField txttelefone = new JFormattedTextField(masktelefone);
		txttelefone.setBounds(77, 179, 293, 29);
		frmCadastro.getContentPane().add(txttelefone);
		
		JFormattedTextField txtcep = new JFormattedTextField(maskcep);
		txtcep.setBounds(77, 146, 293, 28);
		frmCadastro.getContentPane().add(txtcep);
		
		JButton ptncadastrar = new JButton("cadastrar");
		ptncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtnome.getText().trim().toLowerCase();
				String cpf = txtcpf.getText().trim().toLowerCase();
				String endereço = txtcpf.getText().trim().toLowerCase();
				String nascimento = txtdata.getText().trim().toLowerCase();
				String endereco = txtendereço.getText().trim().toLowerCase();
				String cep = txtcep.getText().trim().toLowerCase();
				String telefone = txttelefone.getText().trim().toLowerCase();
				String email = txtemail.getText().trim().toLowerCase();
				String senha = passwordsenha.getText().trim();
				String confirmarsenha = passwordcs.getText().trim();
				String cpfformatado = cpf.replaceAll("\\D","");
				if(nome.isEmpty()==false&&endereço.isEmpty()==false&&nascimento.isEmpty()==false&&cep.isEmpty()==false&&email.isEmpty()==false&&senha.isEmpty()==false&&confirmarsenha.isEmpty()==false) {
					if(nome.matches("[A-Za-z ]+")) {
						if(email.matches("[a-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
							if(senha.equals(confirmarsenha)) {
								ValidaCPF val = new ValidaCPF();
								if(val.isCPF(cpfformatado)) {
									bancodedados bd = new bancodedados();
									bd.conectar();
									if(bd.estaConectado()) {
										bd.inserircliente(nome,cpf,nascimento, endereco,cep,telefone,email,senha);
										//EnviarEmail env = new EnviarEmail();
										//String mensagem = "Obrigado por se cadastrar na gameshop";
										//String assunto = "cadastro realizado";
										//env.enviar(email, assunto, mensagem);
										JOptionPane.showMessageDialog(null, "cadastro realizado com sucesso", "aviso", -1);
										telalogin tel = new telalogin();
										tel.visivel();
										frmCadastro.dispose();
										}else {
										JOptionPane.showMessageDialog(null, "erro no banco","aviso", -1);
									}
								}else {
									JOptionPane.showMessageDialog(null, "Cpf invalido","aviso", -1);
								}
							}else {
								JOptionPane.showMessageDialog(null, "senhas diferentes","aviso", -1);
							}
						}else {
							JOptionPane.showMessageDialog(null, "Email invalido","aviso", -1);
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Nome invalido","aviso", -1);
					}
				
			}else {
				JOptionPane.showMessageDialog(null, "não pode ter campos vazios", "aviso",-1);
				
				
			}
			}
		});
		ptncadastrar.setBounds(108, 342, 89, 23);
		frmCadastro.getContentPane().add(ptncadastrar);
		
		JButton ptnvoltar = new JButton("voltar");
		ptnvoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telalogin tel = new telalogin();
				tel.visivel();
				frmCadastro.dispose();
			}
		});
		ptnvoltar.setBounds(214, 342, 89, 23);
		frmCadastro.getContentPane().add(ptnvoltar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(telacadastro.class.getResource("/imagens/cat.png")));
		lblNewLabel.setBounds(0, 0, 434, 376);
		frmCadastro.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(21, 219, 46, 14);
		frmCadastro.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(21, 219, 46, 14);
		frmCadastro.getContentPane().add(lblNewLabel_3);
	}
}
