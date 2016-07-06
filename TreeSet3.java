import java.util.*;
class TreeSet3{
public static void main(String[]args){
	TreeSet t=new TreeSet(new Mycomaparator());
	t.add(1);
	t.add(10);
	t.add(23);
	t.add(5);
	t.add(5);
	System.out.println(t);
	}
}
class Mycomaparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		/*if(i1<i2){
			return +1;
		}
		else{
			if(i1>i2){
				return -1;
			}
			else{
				return 0;
			}
		}*/
		return -1;
		//return -i2.compareTo(i1);
	}
}