import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat 
{

	public static void main(String[] args) 
	{
		// CAMADA 4(Transporte) 
		//Criação do Server na porta 12345
		try(ServerSocket servidor = new ServerSocket(12345))
		{
			//Camada 3 (REDE): IP local do Servidor
			//Camada 7 (APLICAÇÃO): Status no console
			System.out.println("Servidor no IP:"
			+ InetAddress.getLocalHost().getHostAddress());
			
			System.out.println(
					"Aguardando os pacotes do migus!!! S2!!!");
			
			//Aguardando os pacotes!!!
			while(true)
			{
				// Camada 5(SESSAO): Estabelece e aceita 
				//a conexão com cada client
				Socket cliente = servidor.accept();
				
				// Camada 6(APRESENTAÇÃO): Leitura do fluxo
				// de dados e conversão para char
				BufferedReader entrada = 
						new BufferedReader(
								new InputStreamReader(
										cliente.getInputStream()));
				
				String mensagem = entrada.readLine();
				
				//Camada 7(APLICAÇÃO): Exibindo a mensagem
				System.out.println("MENSAGEM RECEBIDA:" + mensagem);
				
				//Fecha a conexão com o Client
				cliente.close();
			}
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
