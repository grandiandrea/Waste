import java.util.*;
public class Maino{
	public static void main(String[] args){
		AlberoBinario a1 = new AlberoBinario(10);
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			a1.add(new Nodo(sc.nextDouble()));
		}
		System.out.println(a1.toString());
	}
}