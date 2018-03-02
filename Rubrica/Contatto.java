package com.company;

public class Contatto {
    String nome;
    String cognome;
    String numero;
    public Contatto(String nome, String cognome, String numero){
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
    }
    public Contatto(){

    }
    public boolean equals(Contatto x){
        return (this.nome.equals(x.nome) && this.cognome.equals(x.cognome));
    }
    public String toString(){
        return this.nome + " " + this.cognome + " " + this.numero;
    }
}
