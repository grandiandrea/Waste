import java.util.Scanner;
public class mainCilindro{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		Cilindro cil = new Cilindro(reader.nextDouble(), reader.nextDouble());
		System.out.println(cil.volumeCalc());
	}
}