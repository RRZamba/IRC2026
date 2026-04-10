import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ClientChat 
{
	public static void main(String[] args) 
	{
		//1) Variável para guardar IP do SERVER S2!!!
		String ipServer = JOptionPane
			.showInputDialog("Digite o IP, seu otário!!!");
 	
		//2) Nome do indivíduo
		String nominho = JOptionPane
				   .showInputDialog("Digite seu belo nome:");
		
		//3) Numero da porta de acesso
		int porta = 12345;
		
		try 
		{
			//4) Tentar abrir a conexão
			Socket portinha = new Socket(ipServer,porta);
			
			//5) Sair o pacote com o texto
			PrintWriter saidera = new 
					  PrintWriter(portinha.getOutputStream(),true);
			
			//6) Mensagem show de bola!!!
			saidera.println("Olá querido professor!!!, sou o " + nominho);
			
			//7) Fecha a conexão
			portinha.close();
			
			//8) Mensagem de sucesso
			JOptionPane.showMessageDialog(null,
					"Mensagem enviada com sucesso ao IP: " + ipServer);
		} 
		catch (Exception e) 
		{
			// Mensagem de erro
			JOptionPane.showMessageDialog(null, 
					"ERRO: Não foi Possível conectar no servidor!!!",
			        "Erro de Rede!!!",JOptionPane.ERROR_MESSAGE);
		}
	}

}
