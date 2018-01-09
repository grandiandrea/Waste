public class ContoBase extends ContoCorrente{
	protected double maxPrelievo;
	public ContoBase(){

	}
	public ContoBase(double saldo, String nome, string cognome, String nConto, double maxPrelievo){
		super.saldo = saldo;
		super.nome = nome;
		super.cognome = cognome;
		super.nConto = nConto;
		this.maxPrelievo = maxPrelievo;
	}
	public boolean preleva(double amount){
		if(amount <= this.maxPrelievo){
			return super.preleva(amount);
		}
		else{
			System.out.println("	Ammontare superiore al prelievo massimo");
			return false;
		}
	}

}