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
/*
	TODO
	create register list on constructor, and add to list.
	when closing, write list to file and close filewriters.
*/
public class FileManager{
	Path registro;
	SimpleDateFormat formato;
	String registrol;
	List<FileWrapper> content;
	public FileManager(){
		this.registrol = "registro.txt";
		this.registro = Paths.get(registrol);
		content = new ArrayList<>();
		formato = new SimpleDateFormat("HH:mm:SS_dd-MMM-yyyy");
		try{
			Scanner s = new Scanner(new File("registro.txt"));
			while(s.hasNextLine()){
				content.add(new FileWrapper(s.nextLine()));
			}
		}catch(FileNotFoundException ex){

		}	

	}
	public void addToWrite(FileWrapper contenuto){
		content.add(contenuto);
	}
	public boolean write() {
		try{
			List<String> contentString = new ArrayList<>();
			for(FileWrapper iter : content){
				contentString.add(iter.toString());
			}
			Files.write(registro, contentString, Charset.forName("UTF-8"));
			//File read	V
			//To Strig parsing
			//To int
			//Parse to new list to string array
		}catch(FileNotFoundException ex){

		}catch(IOException exe){

		}

		
		return true;
	}
	public void printRegistro(){
		for(FileWrapper iter : content){
			System.out.println(iter.toString());
		}
	}
}