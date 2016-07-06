import java.io.*;
class a2{
	public static void main(String[]args)throws Exception{
	System.out.println("concole");
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.println("hii");
		pw.flush();
	}
}