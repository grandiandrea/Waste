package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Rubrica");
        boolean loopMenu = true;
        Scanner reader = new Scanner(System.in);
        Rubrica rub = new Rubrica();
        while(loopMenu){
            System.out.println("1. Aggiungi\n2. Rimuovi\n3. Elenca\n4. Cerca\n5. Riordina in ordine alfabetico\n6. Esci");
            int scelta = reader.nextInt();
            switch(scelta){
                case 1:
                    rub.aggiungi(rub.creaOggetto());
                    break;
                case 2:
                    rub.rimuovi(rub.creaOggetto());
                    break;
                case 3:
                    rub.elenca();
                    break;
                case 4:
                    rub.cerca(rub.creaOggetto());
                    break;
                case 5:
                    rub.riordina();
                    break;
                default:
                    loopMenu = false;
                    break;
            }
        }
    }
}
