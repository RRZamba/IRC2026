import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ClientChat 
{
	public static void main(String[] args) 
	{
		//Camada 7(APLICAÇÃO): Entrada da mensagem
		String ipServer = JOptionPane
				  .showInputDialog("Digite o IP do server!");
	
		String nominho = JOptionPane
				  .showInputDialog("Digite seu belo nome!");
		
		// Camada 4 (Transporte): Definição da porta 
		int porta = 12345;
		
		try
		{
			//Camada 3, 4, 5 
			//Tenta estabelecer a sessão usando o IP e PorTa
			Socket portinha = new Socket(ipServer,porta);
			
			//Camada 6(Apresentação)
			//Formatar os dados e manter fluxo
			PrintWriter saida = new PrintWriter(
					portinha.getOutputStream(),true);
			
			// Camada 7 ,6 
			//Mensagem e envio da mesma
			saida.println("Olá Professor, sou o" + nominho);
			
			//Camada 5 (Sessão) Finalizo a sessão
			portinha.close();			
			
			// Camada 7 (Aplicação): Notificação pro usuário
			JOptionPane.showMessageDialog(null,
					"Mensagem enviada!!! S2!!!");
			
		}
		catch(Exception e) 
		{
			JOptionPane.showMessageDialog(null,
				"ERRO ao conectar:" + e.getMessage());
		}
		
	}

}
