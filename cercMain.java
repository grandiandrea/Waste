import java.util.*;
public class cercMain{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		Cerchio c1 = new Cerchio(reader.nextDouble());
		System.out.println(c1.areaCalc());
		Cerchio c2 = new Cerchio(reader.nextDouble());
		System.out.println(c2.areaCalc());
	}
}