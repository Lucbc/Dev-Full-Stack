package projeto1;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opt;
		
			//INSTANCIA A CLASSE
			ContaEspecial conta1 = new ContaEspecial(new Pessoa(787878, "S�rgio Ramos", "Setor Bueno. Av. 85"),1,1000,90000);
			ContaEspecial conta2 = new ContaEspecial(new Pessoa(454545, "Mario Lago", "Setor Central. Rua 55"),2,13000,50000);
			ContaEspecial conta3 = new ContaEspecial(new Pessoa(121212, "Cristina Mendes", "Setor Panorama Park. Rua Vit�ria R�gia"),3,25500,70000);
			ContaPoupanca conta4 = new ContaPoupanca(new Pessoa(787878, "S�rgio Ramos", "Setor Bueno. Av. 85"),1,500,10);

			do {
			System.out.println("Qual opera��o deseja realizar?\n1-Sacar\n2-Depositar\n3-Transferir\n4-Consultar Saldo\n5-Listar todos os clientes e seus saldos\n0-Encerrar Opera��o");
			 opt = Integer.parseInt(sc.nextLine());
			
			if(opt == 1){
			//DEFINE VALOR PARA SACAR
			conta1.sacar(55.0);
			conta2.sacar(65.0);
			conta3.sacar(75.0);
			conta4.sacar(85.0);
			System.out.println("\n");
			}
			
			else if(opt == 2) {
			//DEFINE VALOR PARA DEPOSITAR
			conta1.depositar(555.0);
			conta2.depositar(1055.0);
			conta3.depositar(3055.0);
			conta4.depositar(3055.0);
			System.out.println("\n");
			}
			
			else if(opt == 3) {
			//DEFINE VALOR PARA TRANSFERIR
			conta1.transferir(conta2,5550.0);
			conta2.transferir(conta3,650.0);
			conta3.transferir(conta1,1050.0);
			conta3.transferir(conta4,550.0);
			System.out.println("\n");
			}
			
			else if(opt == 4) {
			//RESGATA SALDO
			conta1.verificaSaldo();
			conta2.verificaSaldo();
			conta3.verificaSaldo();
			conta4.verificaSaldo();
			System.out.println("\n");
			}
			
			else if(opt == 5) {
			//LISTAR CONTAS
			System.out.println("Conta" + conta1.getNrConta() + " - Cliente: " + conta1.getCliente() + " - Saldo: " + conta1.getSaldo());
			System.out.println("Conta" + conta2.getNrConta() + " - Cliente: " + conta2.getCliente() + " - Saldo: " + conta2.getSaldo());
			System.out.println("Conta" + conta3.getNrConta() + " - Cliente: " + conta3.getCliente() + " - Saldo: " + conta3.getSaldo());
			System.out.println("Conta" + conta4.getNrConta() + " - Cliente: " + conta4.getCliente() + " - Saldo: " + conta4.getSaldo());
			System.out.println("\n");
			}
			}while(opt != 0);

		}

	}