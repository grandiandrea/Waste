import java.util.*;
public class Fattoriale{	
	protected double input;
	protected double risultato;
	public Fattoriale(){
	
	}
	public Fattoriale(double input){
		this.input = input;
		initCalc(this.input);
	}
	public double initCalc(double input){
		this.risultato = input;
		return Calculate(this.risultato -1);
	}
	/*
	Must multiply the given number by (givennumber-1) until givennumber is 1. Then it must stop.
	TODO: recursive application
	*/
	public double Calculate(double input){
		if(input != 1){
			this.risultato = this.risultato * input-1;
			return Calculate(input-1);
		}
		else{
			return this.risultato;
		}
	}
	public double getRisultato(){
		return this.risultato;
	}	
}
