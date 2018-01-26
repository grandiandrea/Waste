import java.util.*;
public class Autosalone{
  protected List<Automobile> salone;
  public Autosalone(){
    salone = new ArrayList<>();
  }
  public void aggiungi(Automobile daAggiungere){
    salone.add(daAggiungere);
  }
  public boolean rimuovi(Automobile daRimuovere){
    return salone.remove(cercaAuto(daRimuovere));

  }
  public void visualizza(){
    for(Automobile iter : salone){
      System.out.println(iter.toString());
    }
  }
  public int cercaAuto(Automobile){
		for(Automobile iter : salone){
			if(iter.equals(Automobile)){
				return lis.indexOf(iter);
			}
		}
		return 0;
	}
}
