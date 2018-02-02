import java.util.*;
public class Autosalone{
  protected List<Automobile> salone;
  protected List<Automobile> vendute;
  public Autosalone(){
    salone = new ArrayList<>();
    vendute = new ArrayList<>();
  }
  public void aggiungi(Automobile daAggiungere){
    salone.add(daAggiungere);
  }
  public void rimuovi(Automobile daRimuovere){
    salone.remove(cercaAuto(daRimuovere));

  }
  public void visualizza(){
    for(Automobile iter : salone){
      System.out.println(iter.toString());
    }
  }
  public void visualizzaVendute(){
    for(Automobile iter : vendute){
      System.out.println(iter.toString());
    }
  }
  public void sort(){
    Collections.sort(salone, new AutomobileComparator());
  }
  public Automobile get(int index){
    return salone.get(index);
  }
  public void vendi(Automobile daVendere){
    vendute.add(salone.get(salone.indexOf(daVendere)));
    this.rimuovi(salone.get(salone.indexOf(daVendere)));
  }
  public int cercaAuto(Automobile daCercare){
		for(Automobile iter : salone){
			if(iter.equals(daCercare)){
				return salone.indexOf(iter);
			}
		}
		return 0;
	}
}
