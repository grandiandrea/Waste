public class contoSpeciale extends ContoCorrente{
	protected double maxRosso;
	public contoSpeciale(){

	}
	public contoSpeciale(double saldo, String intestario, String nConto, double maxRosso){
		super(saldo,intestario, nConto);
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