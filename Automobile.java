class Automobile extends Veicolo{
	protected String targa;
	protected int nPosti;
	protected int posti;
	public Automobile(){
		super();
		this.targa = "";
		this.nPosti = 0;
	}
	public Automobile(String marca, String modello, String targa, int nPosti, double velMax){
		super(marca, modello, velMax);
		this.targa = targa;
		this.nPosti = nPosti;
	}
	public double Accellera(double inpt){
		if(super.vel < super.velMax){
			if(super.vel+inpt > super.velMax){
				super.vel = super.velMax;
			}
			else{
				super.vel+= inpt;
			}
		}
		return super.vel;
	}
	public double frena(double inpt){
		if(super.vel > 0){
			if(super.vel-inpt > 0){
				super.vel-= inpt;
			}
			else{
				super.vel = 0;
			}
		}
		return super.vel;
	}
	public int caricaPersone(int inpt){
		if(posti +inpt <= nPosti){
			posti+=inpt;
			System.out.println("Sono state caricate "+inpt+" persone");
		}
		System.out.println("Ci sono "+posti+" a bordo");
		return posti;
	}
	public int scaricaPersone(int inpt){
		if(posti-inpt >= 0){
			posti-=inpt;
			System.out.println("Sono scese "+inpt+" persone");
		}
		System.out.println("Ci sono "+posti+" persone a bordo");
		return posti;
	}
	public String getTarga(){
		return this.targa;
	}
	public String toString(){
		return "Marca: "+marca+" "+"Modello: "+modello+" "+"Targa: "+targa+" "+"Numero Posti: "+Integer.toString(nPosti)+" "+"Velocita' Massima: "+Double.toString(velMax);
	}
	public boolean equals(Automobile altro){
		return ( this.targa.equals(altro.getTarga()) );
	}
	public int compareTo(Automobile altro){
		if(this.nPosti > altro.nPosti)
		 	return 10;
		else
			return 0;
	}


}
