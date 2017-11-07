import java.util.*;
public class trapMain{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Inserisci B,b,H");
		Trapezio t1 = new Trapezio(reader.nextDouble(), reader.nextDouble(), reader.nextDouble());
		System.out.println("Area: "+t1.areaCalc() +" Perimetro: "+t1.perimCalc());
	}
}