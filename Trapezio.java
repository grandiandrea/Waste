import java.lang.Math.*;
class Trapezio{
	private double B,b,H,L,A;
	public Trapezio(){
		this.B = 0;
		this.b = 0;
		this.H = 0;
	}
	public Trapezio(double x,double x1, double y){
		this.B = x;
		this.b = x1;
		this.H = y;
	}
	public double areaCalc(){
		this.A = ((this.B + this.b) * this.H)/2; 
		return this.A;
	}
	public double perimCalc(){
		return this.B+this.b+( Math.sqrt( Math.pow(((this.B-this.b)/2),2) + Math.pow(this.H,2)) ) * 2;
	}
}