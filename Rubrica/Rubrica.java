package com.company;
import java.util.*;
public class Rubrica {
    List<Contatto> rubrica = new ArrayList<>();
    public Rubrica(){

    }
    public void aggiungi(Contatto daAggiungere){
        rubrica.add(daAggiungere);
    }
    public boolean rimuovi(Contatto daRiumovere){
        int ricerca = this.cerca(daRiumovere);
        if(ricerca != -1){
            rubrica.remove(ricerca);
            return true;
        }
        else return false;
    }
    public int cerca(Contatto daCercare) {
        for (Contatto i : rubrica) {
            if (i.equals(daCercare)) {
                System.out.println(i.toString());
                return rubrica.indexOf(i);
            }
        }
        return -1;
    }
    public void riordina(){
        Collections.sort(rubrica, new ContattoComparator());
    }
    public void elenca(){
        for (Contatto i : rubrica){
            System.out.println(i.toString());
        }
    }
    public Contatto creaOggetto(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Inserisci nome");
        String nome = reader.next();
        System.out.println("Inserisci cognome");
        String cognome = reader.next();
        System.out.println("Inserisci numero");
        String numero = reader.next();
        return new Contatto(nome,cognome,numero);
    }
}
