import java.util.*;
public class retMain{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		Rettangolo[] ret = new Rettangolo[10];
		for(int i = 0; i < 10; i ++){
			System.out.println("Inserisci lato 1 e lato 2 del rettangolo "+i);
			ret[i] = new Rettangolo(reader.nextDouble(), reader.nextDouble());
			System.out.println("Rettangolo "+i+":");
			System.out.println("Area = " +figura1.areaCalc());
			System.out.println("Perimetro = " +figura1.perimCalc());
		}
		
	}
}
