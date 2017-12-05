import java.util.*;
public class BancaSpeciale{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		contoSpeciale conto1 = null;
		while(true){
			System.out.println(" a. Apri conto corrente\n b. Chiudi conto corrente\n c. Fai un prelievo.\n d. Fai un versamento");
			String inpt = reader.next();
			if(inpt.equals("a")){
				System.out.println("Inserisci nome intestatario");
				reader.next();
				String intestatario = reader.nextLine();
				System.out.println("Inserisci saldo iniziale");
				double saldo = reader.nextDouble();
				System.out.println("Inserisci rosso massimo");
				double maxRosso = reader.nextDouble();
				conto1 = new contoSpeciale(saldo,intestatario,generateRandomChars("123456789",10),maxRosso);
			}
			else if(inpt.equals("b")){
				conto1 = null;
			}
			else if(inpt.equals("c")){
				if(conto1 != null){
					System.out.println("Quanto vuoi prelevare?");
					double prel = reader.nextDouble();
					if(conto1.preleva(prel)){
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
					System.out.println("	Versamento completato");

				}
			}
		}
	}
	public static String generateRandomChars(String candidateChars, int length) {
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
	    }

	    return sb.toString();
	}
}