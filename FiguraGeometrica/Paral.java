public class Paral extends Rettangolo{
	protected double h;
	public Paral(){

	}
	public Paral(double l1, double l2, double h){
		super(l1,l2);
		this.h = h;
	}
	public double volume(){
		return super.area() * this.h;
	}
}