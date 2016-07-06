
class Student{
}
class test{
test(int a){
	System.out.println("Hiiii");
}
public static void main(String[]args)throws Exception{
	Student s=new Student();
	Object o=Class.forName(args[0]).newInstance();
	System.out.println("Object created "+o.getClass().getName());
	
}
}