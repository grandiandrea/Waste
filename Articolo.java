class Articolo{
	private String marca;
	private String tipo;
	private double prezzo;
	private int narticoli;
	public Articolo(String marca, String tipo, double prezzo, int narticoli){
		this.marca = marca;
		this.tipo = tipo;
		this.prezzo = prezzo;
		this.narticoli =narticoli;
	}
	public Articolo(){

	}
	public boolean venditaArt(int inpt){
		if((this.narticoli-inpt)>= 0){
			this.narticoli-= inpt;
			return true;
		}
		else{
			return false;
		}
	}
	public double setPrezzo(double inpt){
		this.prezzo = inpt;
		return this.prezzo;
	}
	public int setNarticoli(int inpt){
		this.narticoli = inpt;
		return narticoli;
	}
	public int getNarticoli(){
		return this.narticoli;
	}
	public double getPrezzo(){
		return this.prezzo;
	}
	public String getTipo(){
		return this.tipo;
	}
	public String getMarca(){
		return this.marca;
	}
	public boolean equals(Articolo altro){
		return ( this.marca.equals(altro.getMarca()) && this.tipo.equals(altro.getTipo()) );
	}

}