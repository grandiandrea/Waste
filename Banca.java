import java.io.*;
public class Banca{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		ContoCorrente conto1;
		while(true){
			System.out.println("a. Apri conto corrente\n b. Chiudi conto corrente\n c. Fai un prelievo.");
			char inpt = reader.nextChar();
			if(inpt == 'a'){
				System.out.println("Inserisci nome intestatario");
				reader.nextChar();
				String intestatario = reader.nextLine();
				System.out.println("Inserisci saldo iniziale");
				double saldo = reader.nextDouble();
				conto1 = new ContoCorrente(saldo,intestatario);
			}
			else if(inpt == 'b'){
				conto1 = null;
			}
			else if(inpt == 'c'){
				if(conto1 != null){
					System.out.println("Quanto vuoi prelevare?");
					double prel = reader.nextDouble();
					conto1.preleva(prel);
				}
			}
		}
	}
}