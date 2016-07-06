import java.util.*;
class TreeSet4{
public static void main(String[]args){
	TreeSet t=new TreeSet(new Mycomparator());
	t.add(new String("A"));
	t.add(new String("K"));
	t.add(new String("L"));
	t.add(new String("M"));
	System.out.println(t);
	}
}
class Mycomparator implements Comparator{
	public int compare(Object o1,Object o2){
		String s1=(String)o1;
		String s2=o2.toString();
		return -s1.compareTo(s2);
	}
}