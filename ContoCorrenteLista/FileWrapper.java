import java.util.Date;
public class FileWrapper{
	int nconto; 
	String nome;
	String cognome; 
	String operazione; 
	double amount; 
	Date data;
	public FileWrapper(int nconto, String nome,String cognome, String operazione, double amount, Date data){
		this.nconto = nconto; 
		this.nome = nome;
		this.cognome = cognome; 
		this.operazione = operazione; 
		this.amount = amount; 
		this.data = data;
	}
}
