class Veicolo{
	protected String marca;
	protected String modello;
	protected double velMax;
	protected double vel;
	public Veicolo(){
		this.marca = "";
		this.modello = "";
	}
	public Veicolo(String marca, String modello,double velMax){
		this.marca = marca;
		this.modello = modello;
		this.velMax = velMax;
	}
	public String getMarca(){return this.marca;}
	public String getModello(){return this.modello;}
	public double getVel(){return this.vel;}
	public double getVelMax(){return this.velMax;}
	public void setMarca(String marca){this.marca = marca;}
	public void setModello(String modello){this.modello = modello;}
	public void setVel(double vel){this.vel = vel;}
	public void setVelMax(double velMax){this.velMax = velMax;}
}