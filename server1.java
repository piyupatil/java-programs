import java.io.*;
import java.net.*;
class server1{
	public static void main(String[]args)throws Exception{
		Socket client=null;
		PrintWriter pw=null;
		ServerSocket sock=null;
		try{
			sock = new ServerSocket (5155) ; // now listen for connections 
while (true) { client = sock.accept(); 
pw = new PrintWriter (client.getOutputStream() , true) ; 
pw.println(new java.util.Date().toString()); 
pw.close();
client.close(); 
		}
	}
	catch (IOException ioe) { System.err .println(ioe) ; }
	finally { 
	if (client != null) 
	client. close() ; 
	if (sock != null)
		sock.close();
}
}}