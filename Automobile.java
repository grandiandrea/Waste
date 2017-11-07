class Automobile{
	private String marca;
	private String modello;
	private String targa;
	private int nPosti;
	private int VelMax;
	private int vel;
	private int posti;
	public Automobile(String marca, String modello, String targa, int nPosti, int VelMax){
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.nPosti = nPosti;
		this.VelMax = VelMax;
	}
	public int Accellera(int inpt){
		if(vel < VelMax){
			if(vel+inpt > VelMax){
				vel = VelMax;
			}
			else{
				vel+= inpt;
			}
		}
		return vel;
	}
	public int frena(int inpt){
		if(vel > 0){
			if(vel-inpt > 0){
				vel-= inpt;
			}
			else{
				vel = 0;
			}
		}
		return vel;
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
	public int getVel(){
		return vel;
	}
	public int getMaxVel(){
		return VelMax;
	}
	public String getModello(){
		return modello;
	}
	public void setVel(int inpt){
		vel = inpt;
	}
	public void setModello(String inpt){
		modello = inpt;
	}
	public String getTarga(){
		return this.targa;
	}
	public boolean equals(Automobile altro){
		return ( this.targa.equals(altro.getTarga()) );
	}


}