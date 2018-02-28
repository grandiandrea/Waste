/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaandreagrandi;

import java.util.Comparator;

/**
 *
 * @author Aula
 */
public class StudenteComparator implements Comparator<Studente>{
    @Override
    public int compare(Studente a, Studente b){
        int ret = a.nome.compareTo(b.nome);
        if(ret == 0){
            ret+= a.cognome.compareTo(b.cognome);
        }
        if(ret == 0){
            ret+= a.indirizzo.compareTo(b.indirizzo);
        }
        return ret;
    }
}
