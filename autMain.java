import java.util.*;
public class autMain{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Inserisci Marca:");
		String marca = reader.next();
		System.out.println("Inserisci Modello:");
		String modello = reader.next();
		System.out.println("Inserisci Targa:");
		String targa = reader.next();
		System.out.println("Inserisci Numero di Posti:");
		int nPosti = reader.nextInt();
		System.out.println("Inseisci Velocita' Massima:");
		int VelMax = reader.nextInt();
		Automobile auto1 = new Automobile(marca,modello,targa,nPosti,VelMax);
		while(true){
			while(auto1.getVel() < auto1.getVelMax()){
				System.out.println(auto1.getModello()+" ha accellerato a " +auto1.Accellera(4));
				try{Thread.sleep(900);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
			}
			try{Thread.sleep(2000);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
			while(auto1.getVel() > 0){
				System.out.println(auto1.getModello()+" ha frenato a " +auto1.frena(4));
				try{Thread.sleep(900);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
			}
			try{Thread.sleep(2000);} catch(InterruptedException ex) {Thread.currentThread().interrupt();}
		}

	}
}