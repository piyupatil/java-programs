class vararg{
	public static void display(int...a){
	int sum=0;
		for(int x1:a){
			sum+=x1;
		}
		System.out.println("VRMETHOD"+sum);
	}
	public static void display(int a){
		System.out.println("Normal:"+a);
	}
	public static void main(String[]args){
		display(1);
		display(1,23);
		display(2,5,6,7);
	}
}