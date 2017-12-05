public class contoBase extends ContoCorrente{
	protected double maxPrelievo;
	public contoBase(){

	}
	public contoBase(double saldo, String intestario, String nConto, double maxPrelievo){
		super(saldo,intestario, nConto);
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