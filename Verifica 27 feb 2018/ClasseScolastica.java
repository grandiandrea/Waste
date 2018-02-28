/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaandreagrandi;

import java.util.*;

/**
 *
 * @author Aula
 */
public class ClasseScolastica {
    List<Studente> classe = new ArrayList<>();
    public ClasseScolastica(){
        
    }
    public void aggiungi(){
        this.classe.add(this.creaStudente());
    }
    public void rimuovi(){
        this.stampa();
        System.out.println("Inserisci nRegistro dello studente da rimuovere: ");
        Scanner reader = new Scanner(System.in);
        this.classe.remove(reader.nextInt());
    }
    public void stampa(){
        for(Studente i : classe){
            System.out.println("nRegistro: "+classe.indexOf(i)+"  Dati Studente:"+i.toString());
        }
    }
    public void stampaAssenze(int tot){
        for(Studente i : classe){
            System.out.println("nRegistro: "+classe.indexOf(i)+"  Dati Studente:"+i.toString()+"  Sopra il limite di assenze: "+i.isOver25percent(tot));
        }
    }
    public boolean ricerca(){
        Studente daCercare = creaStudente();
        for(Studente i : classe){
            if(i.equals(daCercare)){
                System.out.println("trovato al nRegistro: "+classe.indexOf(i)+"  Dati Studente:"+i.toString());
                return true;
            }
        }
        return false;
    }
    public void ordineAlfabetico(){
        Collections.sort(classe, new StudenteComparator());
    }
    public Studente creaStudente(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Inserisci nome studente:");
        String nome = reader.next();
        System.out.println("Inserisci cognome studente:");
        String cognome = reader.next();
        System.out.println("Inserisci indirizzo studente:");
        reader.nextLine();
        String indirizzo = reader.nextLine();
        System.out.println("Inserisci numero assenze studente:");
        int nAssenze = reader.nextInt();
        return new Studente(nome,cognome,indirizzo,nAssenze);
    }
    
}
