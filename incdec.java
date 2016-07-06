import java.util.*;

class incdec{
public static void main(String[]args){
	ArrayList <Number> l=new ArrayList<Number>();
	//l.add("chinu");
	l.add(12);
	int x,y;
	x=10;
	y=x++;
	int z=++x;
	System.out.println(x+"\t"+y+"\t"+z);
	y=z--;
	x=--y;
	System.out.println(x+"\t"+y+"\t"+z);
	char ch='a';
	ch++;
	double d=10.6;
	d++;
	System.out.println(ch+"\t"+d);
}
}