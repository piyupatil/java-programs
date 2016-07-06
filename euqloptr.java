class equaloptr{
	public static void main(String[]args){
		Thread t=new Thread();
		Object o=new Object();
		String str=new String("panu");
		System.out.println(t==o);
		System.out.println(str==o);
		System.out.println(t==str);
	}
}