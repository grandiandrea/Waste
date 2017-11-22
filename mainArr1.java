import java.lang.Math;
import java.util.*;
public class mainArr1{
	public static void main(String[] args){
		Trapezio[] joe;
		joe = new Trapezio[5];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			joe[i] = new Trapezio(Math.random()*100,Math.random()*100,Math.random()*100,scanner.next()); 
		}
		for(int i = 0; i < 5; i++)
			System.out.println("Area"+i+": "+joe[i].areaCalc() +" Perimetro: "+joe[i].perimCalc()+" "+joe[i].getNome());
	}
}