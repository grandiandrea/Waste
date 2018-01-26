import java.util.*;
public class Concessionaria2{
	public static void main(String[] args){
		Autosalone salone = new Autosalone();
		Scanner reader = new Scanner(System.in);
		boolean loop = true;
		while(loop){
			System.out.println("1. Aggiungi nuova auto\n2. Rimuovi auto\n3. Cerca auto\n4. Elenca auto\n5. Vendi auto\n6. Elenca auto vendute\n7. Riordina in modo lexicografico per targa");
			int inpt = reader.nextInt();
			switch(inpt){
				case 1:
					salone.aggiungi(inputAuto());
					break;
				case 2:
					System.out.println("Inserisci indice auto da rimuovere:");
					salone.rimuovi(inputAuto());
					break;
				case 3:
					System.out.println("Inserisci auto da cercare:");
					Automobile temp = salone.get(salone.cercaAuto(inputAuto()));
					System.out.println(temp.toString());
				case 4:
					salone.visualizza();
					break;
				case 5:
					salone.vendi(inputAuto());
					break;
				case 6:
					salone.visualizzaVendute();
					break;
				case 7:
					salone.sort();
					break;
				default:
					loop = false;
					break;
			}
		}

	}
	public static Automobile inputAuto(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci marca: ");
		String marca = sc.next();
		System.out.println("Inserisci modello: ");
		String modello = sc.next();
		System.out.println("Inserisci targa: ");
		String targa = sc.next();
		System.out.println("Inserisci numero posti: ");
		int nPosti = sc.nextInt();
		System.out.println("Inserisci velocita' massima: ");
		int velMax = sc.nextInt();
		return new Automobile(marca,modello,targa,nPosti,velMax);
	}
}
