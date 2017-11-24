import java.util.Scanner;
public class paralMain{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		Paral par = new Paral(reader.nextDouble(), reader.nextDouble(), reader.nextDouble());
		System.out.println(par.volumeCalc());
	}
}