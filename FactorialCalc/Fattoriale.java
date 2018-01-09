import java.util.*;
public class Fattoriale{	
	protected double input;
	protected double risultato;
	public Fattoriale(){
	
	}
	public Fattoriale(double input){
		this.input = input;
		this.risultato = Calculate(this.input);
	}	
	public double Calculate(double input){
		if(input > 1){
			//System.out.println("input = "+input);
			return input * Calculate(input-1);
		}
		else{
			return 1;
		}

	}
	public double getRisultato(){
		return this.risultato;
	}	
}
