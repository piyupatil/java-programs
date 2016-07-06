import java.util.*;
class Vector1{
	public static void main(String[]args){
		Vector v=new Vector(10,5);
		System.out.println(v.capacity()+"\t"+v.size());
		for(int i=0;i<10;i++)
			v.addElement(20);
		v.addElement("chinu");
		v.addElement("chinu");
		v.addElement("chinu");
		v.addElement("chinu");
		v.addElement("34 chips");
		System.out.println(v);
		Object o=v.removeElement(20);
		System.out.println(o);
		o=v.removeElement("chinu");
		System.out.println(o);
		System.out.println(v);
	}
}