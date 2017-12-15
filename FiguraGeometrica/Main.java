import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		while(true){
			System.out.println("	MENU CALCOLATORE GEOMETRICO");
			System.out.println(" Oggetti disponibili da FigureGeometriche:");
			System.out.println(" 1. Rettangolo");
			System.out.println("  1a. Parallelepipedo");
			System.out.println(" 2. Cerchio");
			System.out.println("  2a. Cilindro");
			System.out.println(" 3. Trapezio");
			String selector = inp.next();
			if(selector.equals("1")){
				System.out.print("Inserisci i 2 lati>");
				Rettangolo rettangolo = new Rettangolo(inp.nextDouble(),inp.nextDouble());
				System.out.println("Area = "+rettangolo.area()+"\n Perimetro = "+rettangolo.perimetro());
			}
			else if(selector.equals("1a")){
				System.out.print("Inserisci i 2 lati, seguiti dall'altezza>");
				Paral parallelepipedo = new Paral(inp.nextDouble(),inp.nextDouble(), inp.nextDouble());
				System.out.println("Volume = "+parallelepipedo.volume());
			}
			else if(selector.equals("2")){
				System.out.print("Inserisci il raggio>");
				Cerchio cerchio = new Cerchio(inp.nextDouble());
				System.out.println("Area = "+cerchio.area()+"\n Circonferenza = "+cerchio.perimetro());
			}
			else if(selector.equals("2a")){
				System.out.print("Inserisci il raggio e l'altezza>");
				Cilindro cilindro = new Cilindro(inp.nextDouble(),inp.nextDouble());
				System.out.println("Area base = "+cilindro.area()+"\n Circonferenza = "+cilindro.perimetro()+"\n Volume = "+cilindro.volume());
			}
			else if(selector.equals("3")){
				System.out.print("Inserisci Base maggiore, base minore ed altezza>");
				Trapezio trapezio = new Trapezio(inp.nextDouble(), inp.nextDouble(), inp.nextDouble());
				System.out.println("Area = "+trapezio.area() +" Perimetro = "+trapezio.perimetro());
			}
		}
	}
}