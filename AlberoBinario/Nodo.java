public class Nodo{
	protected Nodo minore;
	protected Nodo maggiore;
	protected double valore;
	protected boolean vuoto = false;
	public Nodo(){
		this.minore = null;
		this.maggiore = null;
	}
	public Nodo(double valore){
		this.valore = valore;
		this.vuoto = false;
		this.minore = null;
		this.maggiore = null;
	}
	public boolean addBranch(Nodo son){
		if(son.getValore() > this.valore){
			if(maggiore == null){
				this.maggiore = son;
				return true;
			}
			else{
				return maggiore.addBranch(son);
			}			
		}
		else if(son.getValore() < this.valore){
			if(minore == null){
				this.minore = son;
				return true;
			}
			else{
				return minore.addBranch(son);
			}
		}
		else{
			return false;
		}
	}
	public double getValore(){
		return this.valore;
	}
	public boolean equals(Nodo input){
		return (this.valore == input.getValore());
	}
	public boolean isVuoto(){
		return this.vuoto;
	}
	public Nodo getMinore(){
		return this.minore;
	}
	public Nodo getMaggiore(){
		return this.maggiore;
	}
	public String findMinor(Nodo radice){
		if(radice != null){
			String pietro;
			pietro = findMinor(radice.minore);
			pietro += " ";
			pietro += Double.toString(radice.getValore());
			pietro += " ";
			pietro += findMinor(radice.maggiore);
			pietro += " ";
			return pietro;
		}
		else{
			return "";
		}
	}
}