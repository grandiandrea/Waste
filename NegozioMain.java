import java.util.*;
public class NegozioMain{
	public static void main(String[] args){
		List<Articolo> lista = new ArrayList<Articolo>();
		Scanner reader = new Scanner(System.in);
		int flag;
		do{
			flag = 100;
			System.out.println("Menu\n 1. Aggiungi articolo\n 2. Imposta prezzo\n 3. Imposta numero articoli");
			System.out.println(" 4. Vendi articolo\n 5. Lista di tutti gli articoli\n 0. Esci");
			flag = reader.nextInt();
			if(flag == 1){
				System.out.println("Inserisci Marca");
				reader.nextLine();
				String marca = reader.nextLine();
				System.out.println("Inserisci Tipo");
				String tipo = reader.nextLine();
				System.out.println("Inserisci prezzo");
				double prezzo = reader.nextDouble();
				System.out.println("Inserisci numero di articoli");
				int narticoli = reader.nextInt();
				boolean f = false;
				for(Articolo temp : lista){
					if(temp.equals(new Articolo(marca, tipo, prezzo, narticoli))){
						System.out.println("Articolo gia' inserito");
						f = true;
						break;
					}
				}
				if(f == false)
				lista.add(new Articolo(marca, tipo, prezzo, narticoli));
			}
			else if(flag == 2){
				System.out.println("Lista articoli");
				for(int i = 0; i < lista.size(); i++){
					System.out.println(i+": "+lista.get(i).getMarca()+" "+lista.get(i).getTipo()+" \n  Prezzo: "+lista.get(i).getPrezzo());
				}
				System.out.println("\n\nInserisci numero articolo di cui cambiare il prezzo:");
				int i = reader.nextInt();
				System.out.println("Inserisci prezzo:");
				lista.get(i).setPrezzo(reader.nextDouble());
			}
			else if(flag == 3){
				System.out.println("Lista articoli");
				for(int i = 0; i < lista.size(); i++){
					System.out.println(i+": "+lista.get(i).getMarca()+" "+lista.get(i).getTipo()+" \n  Numero Articoli: "+lista.get(i).getNarticoli());				
				}
				System.out.println("\n\nInserisci numero articolo di cui cambiare il numero:");
				int i = reader.nextInt();
				System.out.println("Inserisci numero articoli:");
				lista.get(i).setNarticoli(reader.nextInt());
			}
			else if(flag == 4){
				System.out.println("Lista articoli");
				for(int i = 0; i < lista.size(); i++){
					System.out.println(i+": "+lista.get(i).getMarca()+" "+lista.get(i).getTipo()+" \n  Numero Articoli: "+lista.get(i).getNarticoli()+" \n  Prezzo: "+lista.get(i).getPrezzo());
				}
				System.out.println("\n\n Inserisci numero articolo da vendere:");
				int i = reader.nextInt();
				System.out.println("Inserisci quantita' da vendere:");
				boolean suc = lista.get(i).venditaArt(reader.nextInt());
				if(suc){
					System.out.println("Successo");
				}
				else{
					System.out.println("Errore");
				}
			}
			else if(flag == 5){
				System.out.println("Lista articoli");
				for(int i = 0; i < lista.size(); i++){
					System.out.println(i+": "+lista.get(i).getMarca()+" "+lista.get(i).getTipo()+" \n  Numero Articoli: "+lista.get(i).getNarticoli()+" \n  Prezzo: "+lista.get(i).getPrezzo());
				}
			}
		}while(flag != 0);
	}
}