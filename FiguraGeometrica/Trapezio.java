import java.lang.Math.*;
class Trapezio extends FiguraGeometrica{
	private double b,H,L,A;
	public Trapezio(){
		super.lato = 0;
		this.b = 0;
		this.H = 0;
	}
	public Trapezio(double x,double x1, double y){
		super.lato = x;
		this.b = x1;
		this.H = y;
	}
	public double area(){
		this.A = ((super.lato + this.b) * this.H)/2; 
		return this.A;
	}
	public double perimetro(){
		return super.lato+this.b+( Math.sqrt( Math.pow(((super.lato-this.b)/2),2) + Math.pow(this.H,2)) ) * 2;
	}
}