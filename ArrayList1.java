import java.util.*;
class ArrayList1{
public static void main(String[]args){
	ArrayList a1=new ArrayList();
	List l=Collections.synchronizedList(a1);
	System.out.println(""+a1.size());
		System.out.println(""+l);
	a1.add(10);
	a1.add(20);
	a1.add(null);
	System.out.println(""+a1);
	a1.remove(1);
	System.out.println(""+a1);
	System.out.println(""+a1);
	
}
}