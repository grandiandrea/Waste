class ContoCorrente{
	private double saldo = 0;
	private String intestario = "";
	public ContoCorrente(double saldo, String intestario){
		this.saldo = saldo;
		this.intestario = intestario;
	}
	public ContoCorrente(){

	}
	public AperturaConto(double saldo, String intestario){
		this.saldo = saldo;
		this.intestario = intestario;
	}
	public ChiusuraConto(){
		this = null
	}
	public void versa(double input){
		this.saldo+=input;
	}
	public boolean preleva(double input){
		if(this.saldo >= input){
			this.saldo -= input;
			return true;
		}
		else{
			System.out.println("Errore");
			return false;
		}
	}
	public double getSaldo(){
		return this.saldo;
	}
	public void printSaldo(){
		System.out.println(this.saldo);
	}
}