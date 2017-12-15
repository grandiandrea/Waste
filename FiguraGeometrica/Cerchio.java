import static java.lang.Math.PI;
class Cerchio extends FiguraGeometrica{
	public Cerchio(){
		super.lato = 0;
	}
	public Cerchio(double r){
		super.lato = r;
	}
	public double area(){
		return super.lato * super.lato * Math.PI;
	}
	public double perimetro(){
		return super.lato * 2 * Math.PI;
	}
}