public abstract class ContoCorrente{
	protected String nome;
	protected String cognome;
	protected int nConto;
	protected double saldo;
	public abstract boolean preleva(double amount);
	public void versa(double amount){
		this.saldo += amount;
	}
	public double Saldo(){
		return this.saldo;
	}
}