package gamesshop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class telacatalogo {

	private JFrame frmCatalogoDeJogos;
	JTextArea mostrarcarrinho;
	ArrayList <String>carrinho = new ArrayList<>();
	JLabel lbltotal;
	double total;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telacatalogo window = new telacatalogo();
					window.frmCatalogoDeJogos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telacatalogo() {
		initialize();
	}
	public void visivel() {
		telacatalogo window = new telacatalogo();
		window.frmCatalogoDeJogos.setVisible(true);
	/**
	 * Initialize the contents of the frame.
	 */}
	private void initialize() {
		frmCatalogoDeJogos = new JFrame();
		frmCatalogoDeJogos.setTitle("Catalogo de jogos");
		frmCatalogoDeJogos.setBounds(100, 100, 1203, 620);
		frmCatalogoDeJogos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCatalogoDeJogos.getContentPane().setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Pix");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Pix: denis.silvace@hotmail.com","pix",-1);
				bancodedados bd = new bancodedados();
				bd.conectar();
				if(bd.estaConectado()) {
					bd.salvarvenda(carrinho);
					frmCatalogoDeJogos.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "erro","aviso", -1);
				}
			}
		});
		btnNewButton_4.setBounds(1097, 64, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Debito");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "pagamento realizado com sucesso", "Debito",-1);
				bancodedados bd = new bancodedados();
				bd.conectar();
				if(bd.estaConectado()) {
					bd.salvarvenda(carrinho);
					frmCatalogoDeJogos.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "erro","aviso", -1);
				}
			}
		});
		btnNewButton_3.setBounds(998, 64, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Credito");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "pagamento realizado com sucesso", "credito",-1);
				bancodedados bd = new bancodedados();
				bd.conectar();
				if(bd.estaConectado()) {
					bd.salvarvenda(carrinho);
					frmCatalogoDeJogos.dispose();
				}else {
					JOptionPane.showMessageDialog(null, "erro","aviso", -1);
				}
			}
		});
		btnNewButton.setBounds(899, 64, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/images (3) (1).jpg")));
		lblNewLabel.setBounds(10, 95, 80, 98);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/Diablo_IV_Lord_of_Hatred (1).jpg")));
		lblNewLabel_1.setBounds(20, 204, 62, 98);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/egs-firstclasstrouble-invisiblewalls-s1-2560x1440-061767b6ed3f_2560x1440-5949bbfd7f9dd488810526905e93a0f1 (1).jpg")));
		lblNewLabel_2.setBounds(10, 313, 161, 98);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/images (2) (1).jpg")));
		lblNewLabel_3.setBounds(10, 422, 80, 83);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/61BlQmnK8XS._AC_UF894,1000_QL80_ (1).jpg")));
		lblNewLabel_4.setBounds(360, 95, 80, 98);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/images (1) (1).jpg")));
		lblNewLabel_5.setBounds(360, 204, 83, 98);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/81OSkSH-qgL (1).jpg")));
		lblNewLabel_6.setBounds(360, 313, 80, 98);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/81KtQcxwLSL (1).jpg")));
		lblNewLabel_7.setBounds(360, 422, 84, 83);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/pvzr-key-art.png.adapt.crop1x1.767p (1).png")));
		lblNewLabel_8.setBounds(690, 95, 84, 98);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/Devil_May_Cry_5 (1).jpg")));
		lblNewLabel_9.setBounds(690, 204, 84, 98);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/Dead_By_Daylight (1).png")));
		lblNewLabel_10.setBounds(690, 313, 84, 98);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/images (5).jpg")));
		lblNewLabel_11.setBounds(690, 422, 84, 83);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("GTA 5 ");
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_12.setBounds(100, 95, 71, 24);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_12);
		
		JButton buttongta = new JButton("adicionar");
		buttongta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 75.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("GTA 5 - R$75,00");
				atualizarcarrinho();
			}
		});
		buttongta.setBounds(100, 170, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttongta);
		
		JLabel lblNewLabel_13 = new JLabel("Diablo IV");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_13.setBounds(92, 204, 97, 24);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_13);
		
		JButton buttonIV = new JButton("adicionar");
		buttonIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 175.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Diablo IV - R$175,00");
				atualizarcarrinho();
			}
		});
		buttonIV.setBounds(92, 279, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttonIV);
		
		JLabel lblNewLabel_14 = new JLabel("First Class");
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_14.setBounds(181, 313, 101, 24);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_14);
		
		JButton buttonfct = new JButton("adicionar");
		buttonfct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 50.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("First Class Trouble - R$50,00");
				atualizarcarrinho();
			}
		});
		buttonfct.setBounds(181, 388, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttonfct);
		
		JLabel lblNewLabel_15 = new JLabel("For Honor");
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_15.setBounds(100, 422, 101, 29);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_15);
		
		JButton buttonfh = new JButton("adicionar");
		buttonfh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 75.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("For Honor - R$75,00");
				atualizarcarrinho();
			}
		});
		buttonfh.setBounds(100, 482, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttonfh);
		
		JLabel lblNewLabel_16 = new JLabel("Rainbow Six Siege");
		lblNewLabel_16.setForeground(Color.WHITE);
		lblNewLabel_16.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_16.setBounds(450, 95, 174, 24);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_16);
		
		JButton buttonr6 = new JButton("adicionar");
		buttonr6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 80.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Rainbow six siege - R$80,00");
				atualizarcarrinho();
			}
		});
		buttonr6.setBounds(450, 170, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttonr6);
		
		JLabel lblNewLabel_17 = new JLabel("Dragon Ball FigtherZ");
		lblNewLabel_17.setForeground(Color.WHITE);
		lblNewLabel_17.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_17.setBounds(453, 204, 194, 24);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_17);
		
		JButton buttondb = new JButton("adicionar");
		buttondb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 70.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("DBFZ - R$70,00");
				atualizarcarrinho();
			}
		});
		buttondb.setBounds(453, 279, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttondb);
		
		JLabel lblNewLabel_18 = new JLabel("Splatoon 3");
		lblNewLabel_18.setForeground(Color.WHITE);
		lblNewLabel_18.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_18.setBounds(450, 313, 101, 24);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_18);
		
		JButton buttonsp = new JButton("adicionar");
		buttonsp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 200.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Splatoon 3 - R$200,00");
				atualizarcarrinho();
			}
		});
		buttonsp.setBounds(450, 388, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttonsp);
		
		JLabel lblNewLabel_19 = new JLabel("Animal Crossing");
		lblNewLabel_19.setForeground(Color.WHITE);
		lblNewLabel_19.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_19.setBounds(454, 422, 161, 29);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_19);
		
		JButton buttonac = new JButton("adicionar");
		buttonac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 170.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("Animal Crossing - R$170,00");
				atualizarcarrinho();
			}
		});
		buttonac.setBounds(450, 482, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttonac);
		
		JLabel lblNewLabel_20 = new JLabel("PVZ");
		lblNewLabel_20.setForeground(Color.WHITE);
		lblNewLabel_20.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_20.setBounds(784, 95, 46, 24);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_20);
		
		JButton buttonpvz = new JButton("adicionar");
		buttonpvz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 25.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("PVZ - R$25,00");
				atualizarcarrinho();
			}
		});
		buttonpvz.setBounds(784, 170, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttonpvz);
		
		JLabel lblNewLabel_21 = new JLabel("DMC 5");
		lblNewLabel_21.setForeground(Color.WHITE);
		lblNewLabel_21.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_21.setBounds(784, 204, 62, 24);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_21);
		
		JButton buttondmc = new JButton("adicionar");
		buttondmc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 85.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("DMC 5 - R$85,00");
				atualizarcarrinho();
			}
		});
		buttondmc.setBounds(784, 279, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttondmc);
		
		JLabel lblNewLabel_22 = new JLabel("DBD");
		lblNewLabel_22.setForeground(Color.WHITE);
		lblNewLabel_22.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_22.setBounds(784, 313, 46, 24);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_22);
		
		JButton buttondbd = new JButton("adicionar");
		buttondbd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 60.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("DBD - R$60,00");
				atualizarcarrinho();
			}
		});
		buttondbd.setBounds(784, 388, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttondbd);
		
		JLabel lblNewLabel_23 = new JLabel("COTL");
		lblNewLabel_23.setForeground(Color.WHITE);
		lblNewLabel_23.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_23.setBounds(784, 422, 62, 29);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_23);
		
		JButton buttoncotl = new JButton("adicionar");
		buttoncotl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total + 100.00;
				lbltotal.setText(String.valueOf(String.format("%.2f", total)));
				carrinho.add("COTL - R$100,00");
				atualizarcarrinho();
			}
		});
		buttoncotl.setBounds(784, 482, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(buttoncotl);
		
		JLabel lblNewLabel_24 = new JLabel("Trouble");
		lblNewLabel_24.setForeground(Color.WHITE);
		lblNewLabel_24.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_24.setBounds(181, 334, 101, 29);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("R$75,00");
		lblNewLabel_25.setForeground(Color.WHITE);
		lblNewLabel_25.setBounds(100, 130, 46, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("R$175,00");
		lblNewLabel_26.setForeground(Color.WHITE);
		lblNewLabel_26.setBounds(92, 239, 54, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("R$50,00");
		lblNewLabel_27.setBounds(181, 363, 46, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("R$75,00");
		lblNewLabel_28.setForeground(Color.WHITE);
		lblNewLabel_28.setBounds(100, 456, 46, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("R$80,00");
		lblNewLabel_29.setForeground(Color.WHITE);
		lblNewLabel_29.setBounds(450, 130, 46, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_29);
		
		mostrarcarrinho = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(mostrarcarrinho);
		frmCatalogoDeJogos.getContentPane().add(scrollPane);
		mostrarcarrinho.setEditable(false);
		scrollPane.setBounds(899, 98, 275, 407);
		
		JLabel lblNewLabel_30 = new JLabel("R$70,00");
		lblNewLabel_30.setForeground(Color.WHITE);
		lblNewLabel_30.setBounds(453, 239, 46, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("R$200,00");
		lblNewLabel_31.setForeground(Color.WHITE);
		lblNewLabel_31.setBounds(450, 348, 54, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("R$170,00");
		lblNewLabel_32.setForeground(Color.WHITE);
		lblNewLabel_32.setBounds(454, 456, 62, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("R$25,00");
		lblNewLabel_33.setForeground(Color.WHITE);
		lblNewLabel_33.setBounds(784, 130, 46, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("R$85,00");
		lblNewLabel_34.setForeground(Color.WHITE);
		lblNewLabel_34.setBounds(784, 239, 46, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("R$60,00");
		lblNewLabel_35.setForeground(Color.WHITE);
		lblNewLabel_35.setBounds(784, 348, 46, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("R$100,00");
		lblNewLabel_36.setForeground(Color.WHITE);
		lblNewLabel_36.setBounds(784, 456, 62, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_36);
		
		lbltotal = new JLabel("");
		lbltotal.setForeground(Color.WHITE);
		lbltotal.setFont(new Font("Arial", Font.BOLD, 20));
		lbltotal.setBounds(1085, 524, 89, 24);
		frmCatalogoDeJogos.getContentPane().add(lbltotal);
		lbltotal.setText(String.valueOf(total));
		
		JLabel lblNewLabel_37 = new JLabel("Total: R$");
		lblNewLabel_37.setForeground(Color.WHITE);
		lblNewLabel_37.setBounds(1011, 532, 64, 14);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_37);
		
		JLabel lblNewLabel_38 = new JLabel("");
		lblNewLabel_38.setIcon(new ImageIcon(telacatalogo.class.getResource("/imagens/Frame 1 (2).png")));
		lblNewLabel_38.setBounds(-15, 0, 1212, 599);
		frmCatalogoDeJogos.getContentPane().add(lblNewLabel_38);
		
		JButton btnNewButton_1 = new JButton("Credito");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(899, 64, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("credito");
		btnNewButton_2.setBounds(899, 64, 89, 23);
		frmCatalogoDeJogos.getContentPane().add(btnNewButton_2);
		//frmCatalogoDeJogos.getContentPane().add(mostrarcarrinho);
	}
	public void atualizarcarrinho() {
		mostrarcarrinho.setText("");
		for(int i = 0;i<carrinho.size();i++) {
			mostrarcarrinho.append(carrinho.get(i)+"\n");
		}
	}
}
