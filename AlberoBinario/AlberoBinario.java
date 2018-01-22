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