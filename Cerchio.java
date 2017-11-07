import static java.lang.Math.PI;
class Cerchio{
	private double raggio;
	public Cerchio(){
		this.raggio = 0;
	}
	public Cerchio(double r){
		this.raggio = r;
	}
	public double areaCalc(){
		return this.raggio * this.raggio * Math.PI;
	}
}