import javax.swing.JOptionPane;

public class Caixa 
{
	//Atributo
	private double saldo;
	
	//Método Saque
	public void Saque()
	{
		//Recebendo valor
		double valorS = Double.parseDouble(
						JOptionPane
				     .showInputDialog(
					 "Digite o valor do saque:"));
		
		//Atualizando o saldo
		saldo = saldo - valorS;
		
		//Mostrando pro usuário
		JOptionPane.showMessageDialog(null,"Saldo Atual:"+saldo);
		
		
	}
	
	
	
	//Método Depósito
	public void Deposito()
	{
		
	}
	
	
	

}
