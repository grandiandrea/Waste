import java.util.*;
import java.io.*;
import java.text.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.nio.channels.FileChannel;
import java.lang.*;
import java.text.SimpleDateFormat;
public class FileWrapper{
	int nconto; 
	String nome;
	String cognome; 
	String operazione; 
	double amount; 
	Date data;
	DateFormat dateFormat;
	public FileWrapper(int nconto, String nome,String cognome, String operazione, double amount, Date data){
		this.nconto = nconto; 
		this.nome = nome;
		this.cognome = cognome; 
		this.operazione = operazione; 
		this.amount = amount; 
		this.data = data;

		dateFormat = new SimpleDateFormat("HH:mm:SS_dd-MMM-yyyy");
	}
	public FileWrapper(String input){
		dateFormat = new SimpleDateFormat("HH:mm:SS_dd-MMM-yyyy");

		String[] linea = input.split(" ");
		try{
			this.nconto = Integer.parseInt(linea[0]);
			this.nome = linea[1];
			this.cognome = linea[2];
			this.operazione = linea[3];
			this.amount = Double.parseDouble(linea[4]);
			this.data = dateFormat.parse(linea[5]);
		}catch(ParseException e){
			
		}
		
	}
	public String toString(){
		return Integer.toString(this.nconto) + " " + this.nome + " " + this.cognome + " " + this.operazione + " " + Double.toString(this.amount) + " " + dateFormat.format(this.data);
	}
}
