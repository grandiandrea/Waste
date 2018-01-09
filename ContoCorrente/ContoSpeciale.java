public class ContoSpeciale extends ContoCorrente{
	protected double maxRosso;
	public ContoSpeciale(){

	}
	public ContoSpeciale(double saldo, String nome,String cognome, int nConto, double maxRosso){
		super.saldo = saldo;
		super.nome = nome;
		super.cognome = cognome;
		super.nConto = nConto;
		this.maxRosso = maxRosso;
	}
	public boolean preleva(double amount){
		if(saldo + maxRosso >= amount){
			super.saldo -= amount;
			return true;
		}
		else{
			System.out.println("	Ammontare massimo di saldo in rosso superato");
			return false;
		}
	}
}