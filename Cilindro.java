public class Cilindro extends Cerchio{
	protected double h;
	public Cilindro(){

	}
	public Cilindro(double r, double h){
		super(r);
		this.h = h;
	}
	public double volumeCalc(){
		return (super.areaCalc() * this.h);
	}

}