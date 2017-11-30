import java.util.*;
public class listMain{
	public static void main(String[] args){
		List<Rettangolo> listR = new ArrayList<>();
		listR.add(new Rettangolo(10,20));
		System.out.println(listR.get(0).areaCalc());	
	}
}