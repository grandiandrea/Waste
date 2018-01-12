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
public class FileManager{
	Path buffer;
	Path registro;
	SimpleDateFormat formato;
	public FileManager(){
		this.buffer = Paths.get("buffer.txt");
		this.registro = Paths.get("registro.txt");
		formato = new SimpleDateFormat("HH:mm:SS_dd-MMM-yyyy");
	}
	public boolean addToWrite(FileWrapper contenuto) throws IOException{
		try{
			Scanner s = new Scanner(new File("registro.txt"));
			List<FileWrapper> inContent = new ArrayList<>();
			while(s.hasNextLine()){
				String[] linea = s.nextLine().split(" ");
				inContent.add(new FileWrapper(Integer.parseInt(linea[0]),linea[1],linea[2],linea[3],Double.parseDouble(linea[4]),formato.parse(linea[5])));
			}
			s.close();
			inContent.add(contenuto);
			List<String> outContent = new ArrayList<>();	
			for(FileWrapper iter : inContent){
				outContent.add(Integer.toString(iter.nconto)+" "+iter.nome+" "+iter.cognome+" "+iter.operazione+" "+Double.toString(iter.amount)+" "+formato.format(iter.data));
			}
			Files.write(buffer, outContent, Charset.forName("UTF-8"));
			File infile = new File("buffer");
			File outfile = new File("registro");
			FileChannel src = new FileInputStream(infile).getChannel();
			FileChannel dest = new FileOutputStream(outfile).getChannel();
			dest.transferFrom(src,0,src.size());
			//File read	V
			//To Strig parsing
			//To int
			//Parse to new list to string array
		}catch(FileNotFoundException ex){

		}catch(ParseException e){

		}

		
		return true;
	}
	public List<FileWrapper> getRegistro(){
		List<FileWrapper> content = new ArrayList<>();
		try{
			Scanner s = new Scanner(new File("registro"));
			
			while(s.hasNextLine()){
				String[] linea = s.nextLine().split(" ");
				content.add(new FileWrapper(Integer.parseInt(linea[0]),linea[1],linea[2],linea[3],Double.parseDouble(linea[4]),formato.parse(linea[5])));
			}
			s.close();
		}catch(FileNotFoundException ex){

		}catch(ParseException e){
			
		}
		return content;
	}
}