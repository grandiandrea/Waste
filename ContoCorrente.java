class ContoCorrente{
	protected double saldo = 0;
	protected String intestario = "";
	protected String nConto;
	public ContoCorrente(double saldo, String intestario, String nConto){
		this.saldo = saldo;
		this.intestario = intestario;
		this.nConto = nConto;
	}
	public ContoCorrente(){

	}
	public void AperturaConto(double saldo, String intestario){
		this.saldo = saldo;
		this.intestario = intestario;
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
			System.out.println("Errore, saldo insufficente");
			return false;
		}
	}
	public double getSaldo(){
		return this.saldo;
	}
	public String getNConto(){
		return this.nConto;
	}
	public void printSaldo(){
		System.out.println(this.saldo);
	}
}