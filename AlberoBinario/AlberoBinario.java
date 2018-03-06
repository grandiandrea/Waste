import java.util.*;
public class AlberoBinario{
	Nodo root;
	int size = 0;
	public AlberoBinario(double input){
		this.root = new Nodo(input);
	}
	public boolean add(Nodo son){
		size++;
		return root.addBranch(son);
	}
	public void delete(int valore){
		Nodo daEliminare = this.search(valore);
		Nodo maggiore = null;
		Nodo minore = null;
		if(daEliminare.maggiore != null)
			maggiore = daEliminare.maggiore;
		if(daEliminare.minore != null)
			minore = daEliminare.minore;
		size--;
		daEliminare = null;
		this.add(maggiore);
		this.add(minore);
	}
	public String toString(){
		return root.findMinor(root);
	}
	public int size(){
		return this.size;
	}
	public void print(int spaziatura){
		printTree(this.root, size+5+spaziatura, spaziatura);
	}
	public void printTree(Nodo radice, int spazio,int spaziatura){
		for(int i = 0; i < spazio; i++){
			System.out.print(" ");
		}
		System.out.print(radice.getValore());
		System.out.println("");
		if(radice.getMaggiore() != null)
			printTree(radice.getMaggiore(), spazio-2-spaziatura,spaziatura);
		if(radice.getMinore() != null)
			printTree(radice.getMinore(), spazio+2+spaziatura,spaziatura);
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
			if(radice.getMinore() != null)
				return searching(radice.getMinore(), valore);
			else return null;
		}
		else if(valore < radice.getValore()){
			if(radice.getMaggiore() != null)
				return searching(radice.getMaggiore(), valore);
			else return null;
		}
		else{
			return radice;
		}
	}
}
