abstract public class ContoCorrente{
	String nome;
	String cognome;
	int nConto;
	double saldo;
	abstract public boolean preleva(double amount);
	public void versa(double amount){
		this.saldo += amount;
	}
	public double Saldo(){
		return this.saldo;
	}
}