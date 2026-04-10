import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat 
{

	public static void main(String[] args) 
	{
		try(ServerSocket servidor = new ServerSocket(12345)) 
		{
			//Mensagem no console
			System.out.println("Servidor Aberto no IP: " 
			     + InetAddress.getLocalHost().getHostAddress());
			System.out.println("Aguardando mensagens dos alunos fofos...");
			
			//Aguardando os pacotes
			while(true) 
			{
				//Permitindo o acesso dos clients
				Socket cliente = servidor.accept();
				
				//Classe para efetuar leitura
				BufferedReader entrada = 
					   new BufferedReader(
							   new InputStreamReader(cliente.getInputStream()));
				
				//Variável parar salvar a mensagem
				String mensagem = entrada.readLine();
				
				//Mostrar a mensagem no console
				System.out.println("MENSAGEM RECEBIDA: " + mensagem);
				
				//Fechando a conexao
				cliente.close();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
}
