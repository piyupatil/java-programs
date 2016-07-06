import java.util.*;

class LinkedList1{
public static void main(String[]args){
	LinkedList l=new LinkedList();
	//System.out.println(l.size());
	l.add(1);
	l.add("piyu");
	l.add(10.5);
	System.out.println(l);
	l.addFirst("tinku");
	System.out.println(l);
	l.addLast(123);
	Object o=l.getFirst();
	System.out.println(l);
	System.out.println(o);
	o=l.getLast();
	System.out.println(o);
	o=l.removeFirst();
	System.out.println("List1:"+l);
	System.out.println("Object REmoved"+o);
	o=l.removeLast();
	System.out.println("List1:"+l);
	System.out.println("object Removed:"+o);
	
}
}