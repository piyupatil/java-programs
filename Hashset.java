import java.util.*;
class Hashset{
public static void main(String[]args){
	LinkedHashSet h=new LinkedHashSet(8);
	//System.out.println(h.capacity());
	for(int i=0;i<10;i++){
		h.add(i);
	}
	System.out.println(h+""+h.add(2));
}
}