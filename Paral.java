public class Paral extends Rettangolo{
	double h;
	public Paral(){

	}
	public Paral(double l1, double l2, double h){
		super(l1,l2);
		this.h = h;
	}
	public double volumeCalc(){
		return areaCalc() * this.h;
	}
}