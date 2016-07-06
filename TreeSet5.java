import java.util.*;
class TreeSet5{
public static void main(String[]args){
	TreeSet t=new TreeSet(new Mycomparator());
	t.add(new StringBuffer("A"));
	t.add(new StringBuffer("K"));
	t.add(new StringBuffer("L"));
	t.add(new StringBuffer("M"));
	t.add(new String("A"));
	t.add(new String("Kitu"));
	
	t.add(new String("Kitup"));
	t.add(new String("Laatur"));
	t.add(new String("Manisha"));
	System.out.println(t);
	}
}
class Mycomparator implements Comparator{
	public int compare(Object o1,Object o2){
		String s1=o1.toString();
		String s2=o2.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2){
			return -1;
		}
		else{
			if(l1>l2)
				return 1;
			else
				return s1.compareTo(s2);
		}
	}
}