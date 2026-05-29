package gamesshop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class bancodedados {
public Connection conexao = null;
public Statement consultas = null;
public ResultSet resultado = null;
public void conectar() {
	String servidor = "jdbc:mysql://localhost:3306/gameshop";
	String usuario = "root";
	String senha = "Aluno";
	String driver = "com.mysql.cj.jdbc.Driver";
	try {
		Class.forName(driver);
		this.conexao = DriverManager.getConnection(servidor,usuario,senha);
		this.consultas = this.conexao.createStatement();
	}catch(Exception e) {
		System.out.println("erro ao conectar com o banco");
	}
}
public boolean estaConectado() {
	if(this.conexao !=null) {
		return true;
	}else {
		return false;
	}
}
	public void desconectar() {
		try {
			this.conexao.close();
		}catch(Exception e) {
			System.out.println("erro");
		}
		
		
	}public void listarAlunos() {
		try {
		String query = "select * from aluno_senac order by nome_aluno";
				this.resultado = this.consultas.executeQuery(query);
				while(this.resultado.next()) {
					System.out.println("matricula: "+ this.resultado.getString("matricula") +
							" nome do aluno: " + this.resultado.getString("nome_aluno") +
							" idade: "+ this.resultado.getString("idade") +
							" sede do senac: " + this.resultado.getString("sede_senac"));
				}
	}catch(Exception e) {
		System.out.println("erro");
}
	}
	public boolean verificarlogin(String email, String senha) {
		try {
			String query = "select * from cadcliente where email = '"+email+"'and senha = '"+senha+"'";
			this.resultado = this.consultas.executeQuery(query);
			while(this.resultado.next()) {
				return true;
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,  "erro no banco","aviso",-1);
		}
		return false;
	}
	public void inserircliente(String nome,String cpf,String nascimento,String endereco,String cep,String telefone,String email,String senha) {
		try {
			String query = "insert into cadcliente(nomecliente,cpf,nascimento,endereco,cep,telefone,email,senha) values('"+nome+"','"+cpf+"','"+nascimento+"','"+endereco+"','"+cep+"','"+telefone+"','"+email+"','"+senha+"')";
			this.consultas.executeUpdate(query);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,  "erro no banco","aviso",-1);
		}
	}
	public void inserirAluno(String nome,int idade,String sede) {
		try {
			String query = "insert into aluno_senac(nome_aluno,idade,sede_senac) values('"+nome+"','"+idade+"','"+sede+"')";
			this.consultas.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("erro" + e.getMessage());
		}
	}
	public void editarAluno(int matricula,String nome,int idade,String sede) {
		try {
			String query = "update aluno_senac set nome_aluno = '"+nome+"', idade = '"+idade+"',sede_senac = '"+sede+"' where matricula = '"+matricula+"'";
			this.consultas.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Erro"+e.getMessage());
		}
	}
	public void apagarAluno(int matricula) {
		try {
			String query = "delete from aluno_senac where matricula = '"+matricula+"'";
			this.consultas.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Erro"+e.getMessage());
		}
	}
	public void salvarvenda(ArrayList<String> carrinho) {
		try {
			this.consultas = conexao.createStatement();
			for(String item: carrinho) {
				String query = "insert into vendas(nome_item) values ('"+item+"')";
				this.consultas.executeUpdate(query);
			}
		}catch(Exception e) {
				System.out.println("Erro"+e.getMessage());
			}
			
		}
	
}
