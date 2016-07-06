class Typecast1{
	public static void main(String[]args){
		double i=10.12;
		int d=(int)i;
		int a='a';
		short b=(short)d;
		byte s=(byte)d;
		System.out.println(d+"\t"+b+"\t"+s);
	}
}