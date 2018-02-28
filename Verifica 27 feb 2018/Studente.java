/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificaandreagrandi;

/**
 *
 * @author Aula
 */
public class Studente {
    protected String nome;
    protected String cognome;
    protected String indirizzo;
    protected int nAssenze;
    
    public Studente(){
        
    }
    public Studente(String nome, String cognome, String indirizzo, int nAssenze){
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.nAssenze = nAssenze;
    }
    public Studente(String nome, String cognome, String indirizzo){
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.nAssenze = 0;
    }
    public boolean isOver25percent(int tot){
        return (this.nAssenze > (tot/100)*25);
    }
    public boolean equals(Studente altro){
        return (this.nome.equals(altro.nome) && this.cognome.equals(altro.cognome) && this.indirizzo.equals(altro.indirizzo));
    }
    public String toString(){
      return this.nome+" "+this.cognome+" "+this.indirizzo+" "+"NASSENZE: "+Integer.toString(this.nAssenze);
    }
}
