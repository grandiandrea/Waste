class Rettangolo{
	private double lato1;
	private double lato2;
	private double area;
	private double perim;
	public Rettangolo(double a, double b){
		this.lato1 = a;
		this.lato2 = b;
	}
	public Rettangolo(){
		this.lato1 = 0;
		this.lato2 = 0;
	}
	public double areaCalc(){
		this.area = this.lato1 * this.lato2;
		return this.area;
	}
	public double perimCalc(){
		this.perim = (this.lato1 * 2) + (this.lato2 * 2);
		return this.perim;
	}
	public void update(){
		this.areaCalc();
		this.perimCalc();
	}
	public double getLato1(){
		return this.lato1;
	}
	public double getLato2(){
		return this.lato2;
	}
	public void setLato1(double a){
		this.lato1 = a;
		this.update();
	}
	public void setLato2(double b){
		this.lato2 = b;
		this.update();
	}
}