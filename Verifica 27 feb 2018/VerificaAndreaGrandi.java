/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaandreagrandi;

import java.util.Scanner;

/**
 *
 * @author Aula
 */
public class VerificaAndreaGrandi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClasseScolastica classe = new ClasseScolastica();
        Scanner reader = new Scanner(System.in);
        boolean loopMenu = true;
        while(loopMenu){
            System.out.println("1. Aggiungi Studente\n2. Rimuovi Studente\n3. Elenca Studenti\n4. Ricerca Studente\n5. Controlla Assenze Studenti\n6. Ordina Studenti in ordine alfabetico\n7. Esci");
            int scelta = reader.nextInt();
            switch(scelta){
                case 1:
                    classe.aggiungi();
                    break;
                case 2:
                    classe.rimuovi();
                    break;
                case 3:
                    classe.stampa();
                    break;
                case 4:
                    classe.ricerca();
                    break;
                case 5:
                    classe.stampaAssenze(250);
                    break;
                case 6:
                    classe.ordineAlfabetico();
                    break;
                default:
                    loopMenu = false;
                    break;
            }
        }
    }
    
    
}
