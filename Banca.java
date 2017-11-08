import java.util.*;
public class Banca{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		ContoCorrente conto1 = null;
		while(true){
			System.out.println("a. Apri conto corrente\n b. Chiudi conto corrente\n c. Fai un prelievo.");
			String inpt = reader.next();
			if(inpt.equals("a")){
				System.out.println("Inserisci nome intestatario");
				reader.next();
				String intestatario = reader.nextLine();
				System.out.println("Inserisci saldo iniziale");
				double saldo = reader.nextDouble();
				conto1 = new ContoCorrente(saldo,intestatario);
			}
			else if(inpt.equals("b")){
				conto1 = null;
			}
			else if(inpt.equals("c")){
				if(conto1 != null){
					System.out.println("Quanto vuoi prelevare?");
					double prel = reader.nextDouble();
					conto1.preleva(prel);
				}
			}
			else if(inpt.equals("d")){
				if(conto1 != null){
					System.out.println("Quanto vuoi depositare?");
					double prel = reader.nextDouble();
					conto1.versa(prel);
				}
			}
		}
	}
}