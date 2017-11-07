import java.util.*;
public class retMain{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		Rettangolo figura1, figura2;
		System.out.println("Inserisci lato 1 e lato 2 del rettangolo 1");
		figura1 = new Rettangolo(reader.nextDouble(), reader.nextDouble());
		System.out.println("Inserisci lato 1 e lato 2 del rettangolo 2");
		figura2 = new Rettangolo(reader.nextDouble(), reader.nextDouble());
		System.out.println("Rettangolo 1:");
		System.out.println("Area = " +figura1.areaCalc());
		System.out.println("Perimetro = " +figura1.perimCalc());
		System.out.println("Rettangolo 2:");
		System.out.println("Area = " +figura2.areaCalc());
		System.out.println("Perimetro = " +figura2.perimCalc());
	}
}
