public class ContoBase extends ContoCorrente{
	protected double maxPrelievo;
	public ContoBase(){

	}
	public ContoBase(double saldo, String nome, String cognome, int nConto, double maxPrelievo){
		super.saldo = saldo;
		super.nome = nome;
		super.cognome = cognome;
		super.nConto = nConto;
		this.maxPrelievo = maxPrelievo;
	}
	public boolean preleva(double amount){
		if(amount <= this.maxPrelievo && (saldo-amount) >= 0){
			saldo -= maxPrelievo;
			return true;
		}
		else{
			System.out.println("	Errore prelievo");
			return false;
		}
	}

}