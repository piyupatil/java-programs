import java.util.*;
class Stack1{
public static void main(String[]args){
	Stack s=new Stack();
	s.push("piku");
	for(int i=0;i<5;i++)
	s.push(10);
	System.out.println(s);
	s.pop();
	System.out.println(s);
	s.pop();
	System.out.println(s);
	Object a=s.peek();
	System.out.println(a+""+s.empty()+"\t"+s.search(10));
	}
}