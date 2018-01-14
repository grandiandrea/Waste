import java.util.*;
import java.io.*;
import java.text.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.*;
import java.text.SimpleDateFormat;
public class Banca{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		ContoSpeciale conto1 = null;
		FileManager manager = new FileManager();
		while(true){
			System.out.println(" a. Apri conto corrente\n b. Chiudi conto corrente\n c. Fai un prelievo.\n d. Fai un versamento\n e. Stampa registro\n f. Stampa saldo\n q. Salva ed esci");
			String inpt = reader.next();
			if(inpt.equals("a")){
				System.out.println("Inserisci nome intestatario");
				String nome = reader.next();
				System.out.println("Inserisci cognome intestatario");
				String cognome = reader.next();
				System.out.println("Inserisci saldo iniziale");
				double saldo = reader.nextDouble();
				System.out.println("Inserisci rosso massimo");
				double maxRosso = reader.nextDouble();
				Random gen = new Random();
				conto1 = new ContoSpeciale(saldo,nome,cognome,gen.nextInt(999),maxRosso);
			}
			else if(inpt.equals("b")){
				conto1 = null;
			}
			else if(inpt.equals("c")){
				if(conto1 != null){
					System.out.println("Quanto vuoi prelevare?");
					double prel = reader.nextDouble();
					if(conto1.preleva(prel)){
						DateFormat dateFormat = new SimpleDateFormat("HH:mm:SS_dd-MMM-yyyy");
						Date date = new Date();
						System.out.println(dateFormat.format(date));
						FileWrapper transaction = new FileWrapper(conto1.getnConto(),conto1.getNome(),conto1.getCognome(),"Prelievo",prel,date);
						System.out.println(transaction.toString());
						manager.addToWrite(transaction);
						System.out.println("	Prelievo completato");

					}
					else{
						System.out.println("	Prelievo non completato");
					}
				}
			}
			else if(inpt.equals("d")){
				if(conto1 != null){
					System.out.println("Quanto vuoi depositare?");
					double prel = reader.nextDouble();
					conto1.versa(prel);
					Date date = new Date();
					FileWrapper transaction = new FileWrapper(conto1.getnConto(),conto1.getNome(),conto1.getCognome(),"Versamento",prel,date);
					System.out.println(transaction.toString());
					manager.addToWrite(transaction);
					System.out.println("	Versamento completato");

				}
			}
			else if(inpt.equals("e")){
				manager.printRegistro();
			}
			else if(inpt.equals("f")){
				System.out.println(conto1.Saldo());
			}
			else{
				manager.write();
				break;
			}
		}
	}
}