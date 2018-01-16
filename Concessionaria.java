import java.util.*;
public class Concessionaria{
	public static void main(String[] args){
		List<Automobile> listaAuto = new ArrayList<>();
		List<Automobile> listaAutoVendute = new ArrayList<>();
		Scanner reader = new Scanner(System.in);
		boolean loop = true;
		while(loop){
			System.out.println("1. Aggiungi nuova auto\n2. Rimuovi auto\n3. Cerca auto\n4. Elenca auto\n5. Vendi auto\n6. Elenca auto vendute");
			int inpt = reader.nextInt();
			switch(inpt){
				case 1:
					listaAuto.add(inputAuto());
					break;
				case 2:
					System.out.println("Inserisci indice dell'auto da rimuovere:");
					listaAuto.remove(reader.nextInt());
					break;
				case 3:
					System.out.println("Inserisci targa della macchina da cercare:");
					Automobile temp = listaAuto.get(cercaAuto(reader.next(), listaAuto));
					System.out.println(temp.toString());
					System.out.println("Si trova all'indice: "+listaAuto.indexOf(temp));
				case 4:
					for(Automobile iter : listaAuto){
						System.out.println("Indice: "+listaAuto.indexOf(iter)+" "+iter.toString());
					}
					break;
				case 5:
					System.out.println("Inserisci indice dell'auto da vendere:");
					int input = reader.nextInt();
					listaAutoVendute.add(listaAuto.get(input));
					listaAuto.remove(input);
					break;
				case 6:
					for(Automobile iter : listaAutoVendute){
						System.out.println("Indice: "+listaAutoVendute.indexOf(iter)+" "+iter.toString());
					}
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
	public static int cercaAuto(String input, List<Automobile> lis){
		for(Automobile iter : lis){
			if(iter.getTarga().equals(input)){
				return lis.indexOf(iter);
			}
		}
		return 0;
	}
}