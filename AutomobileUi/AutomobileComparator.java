import java.util.*;
public class AutomobileComparator implements Comparator<Automobile>{
  @Override
  public int compare(Automobile a1, Automobile a2){
		return (int)a1.getVelMax() - (int)a2.getVelMax();
	}
}
