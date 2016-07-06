import java.util.*;
class ListIterator1{
public static void main(String[]args){
	LinkedList l=new LinkedList();
	for(int i=0;i<10;i++){
		l.add(i);
	}
	System.out.println(l);
	ListIterator ltr=l.listIterator();
	while(ltr.hasNext()){
		Integer i=(Integer)ltr.next();
		System.out.println(i+"Index:"+ltr.nextIndex());
	}
	
	System.out.println(l);
	while(ltr.hasPrevious()){
		Integer i=(Integer)ltr.previous();
		System.out.println(i+"Index:"+ltr.previousIndex());
		if(i%2==0){
			ltr.remove();
		}
		else{
		if(i%3==0){
			Integer j=i*3;
			ltr.set(j);
		}
		if(i%5==0){
			ltr.add(1001);
		}
		}
	}
	
	System.out.println(l);
	}
}