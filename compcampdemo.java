import java.util.*;
class employee implements Comparable{
	String name;
	int eid;
	employee(String enm ,int id){
		this.name=enm;
		this.eid=id;
	}
	public String toString(){
		return name+" == "+eid;
	}
	public int compareTo(Object obj){
		employee e=(employee)obj;
		Integer i1=this.eid;
		Integer i2=(Integer)e.eid;
		if(i1<i2){
			return 1;
		}
		else{
		if(i1>i2){
			return -1;
		}
		else
			return 0;
		}
	}
}
class compcampdemo{
public static void main(String[]args){
	employee e1=new employee("nag",100);
	employee e2=new employee("tinku",101);
		employee e3=new employee("piyu",102);
			employee e4=new employee("dangu",103);
			TreeSet t=new TreeSet();
			t.add(e1);
			t.add(e2);
			t.add(e3);
			t.add(e4);
			System.out.println(t);
			TreeSet t1=new TreeSet(new Mycomparator());
			t1.add(e1);
			t1.add(e2);
			t1.add(e3);
			t1.add(e4);
			System.out.println(t1);
}
}
class Mycomparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		employee e1=(employee)obj1;
		employee e2=(employee)obj2;
		String i1=e1.name;
		String i2=e2.name;
		return i1.compareTo(i2);
	}
}