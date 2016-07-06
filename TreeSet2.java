import java.util.*;
class TreeSet2{
public static void main(String[]args){
	TreeSet t=new TreeSet();
	t.add(new String("A"));
	t.add(new String("K"));
	t.add(new String("L"));
	t.add(new String("M"));
	System.out.println("M".compareTo("M"));
	
	System.out.println("M".compareTo("L"));
	
	System.out.println("Ks".compareTo("L"));
	}
}