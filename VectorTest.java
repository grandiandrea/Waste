import java.util.*;
public class VectorTest{
	// java -Xmx128M -Xms16M VectorTest
	public static void main(String args[]) {
		Vector v = new Vector(3, 2);
    	System.out.println("Dimensione iniziale: " + v.size());
    	System.out.println("Capacita' iniziale: " + v.capacity());
      
    	v.addElement(new Integer(1));
    	v.addElement(new Integer(2));
    	v.addElement(new Integer(3));
    	v.addElement(new Integer(4));
    	System.out.println("Capacita' dopo 4 addElement: " + v.capacity());

    	v.addElement(new Double(5.45));
    	System.out.println("Capacita' dopo 5 addElement: " + v.capacity());
      
    	v.addElement(new Double(6.08));
     	v.addElement(new Integer(7));
     	System.out.println("Capacita' dopo 7 addElement: " + v.capacity());
      
    	v.addElement(new Float(9.4));
     	v.addElement(new Integer(10));
      	System.out.println("Capacita' dopo 9 addElement: " + v.capacity());
      
      	v.addElement(new Integer(11));
      	v.addElement(new Integer(12));

      	System.out.println("Capacita' dopo 11 addElement: " + v.capacity());

      	System.out.println("Primo elemento: " + (Integer)v.firstElement());
      	System.out.println("Ultimo elemento: " + (Integer)v.lastElement());
    }
}