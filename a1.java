interface piku{
 int x=10;
 static void display(){
	System.out.println("hiii");
 }
}
class a1 implements piku{
	public static void main(String[]args){
		byte a=10,b=20;
		byte c=(byte)(a+b);
	System.out.println(c);
	//display();
	}
}