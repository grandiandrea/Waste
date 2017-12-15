class Rettangolo extends FiguraGeometrica{
	protected double lato2;
	protected double area;
	protected double perim;
	public Rettangolo(double a, double b){
		super.lato = a;
		this.lato2 = b;
	}
	public Rettangolo(){
		super.lato = 0;
		this.lato2 = 0;
	}
	public double area(){
		this.area = super.lato * this.lato2;
		return this.area;
	}
	public double perimetro(){
		this.perim = (super.lato * 2) + (this.lato2 * 2);
		return this.perim;
	}
	public void update(){
		this.area();
		this.perimetro();
	}
	public double getArea(){
		return this.area;
	}
	public double getPerimetro(){
		return this.perim;
	}
	public double getLato1(){
		return super.lato;
	}
	public double getLato2(){
		return this.lato2;
	}
	public void setLato1(double a){
		super.lato = a;
		this.update();
	}
	public void setLato2(double b){
		this.lato2 = b;
		this.update();
	}
}