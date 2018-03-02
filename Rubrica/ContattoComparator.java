package com.company;

import java.util.Comparator;

public class ContattoComparator implements Comparator<Contatto>{
    @Override
    public int compare(Contatto a, Contatto b){
        int ret = a.nome.compareTo(b.nome);
        if(ret == 0)
            ret += a.cognome.compareTo(b.cognome);
        return ret;
    }
}
