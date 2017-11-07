import java.io.*;
public class Banca{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		String intestatario = reader.nextLine();
		double saldo = reader.nextDouble();
		ContoCorrente conto1 = new Contocorrente(saldo,intestatario);
		while(true){
			System.out.println("a. Apri conto corrente\n b. Chiudi conto corrente\n c. Fai un prelievo.")
			char inpt = reader.nextChar());
			if(inpt == 'a'){

			}
			else if(inpt == 'b'){

			}
			else if(inpt == 'c'){
				
			}
		}
	}
}