import java.util.*;
public class AlberoBinario{
	Nodo root;
	public AlberoBinario(double input){
		this.root = new Nodo(input);
	}
	public boolean add(Nodo son){
		return root.addBranch(son);
	}
	public String toString(){
		return root.findMinor(root);
	}
	public Nodo search(double valore){
		if(valore > this.root.getValore()){
			return searching(this.root.getMinore(), valore);
		}
		else if(valore < this.root.getValore()){
			return searching(this.root.getMaggiore(), valore);
		}
		else{
			return root;
		}
	}
	public Nodo searching(Nodo radice, double valore){
		if(valore > radice.getValore()){
			return searching(radice.getMinore(), valore);
		}
		else if(valore < radice.getValore()){
			return searching(radice.getMaggiore(), valore);
		}
		else{
			return radice;
		}
	}
}