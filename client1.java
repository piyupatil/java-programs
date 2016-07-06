import java.net.*;
import java.io.* ; 
class client1{
public static void main(String[] args) throws IOException {
 InputStream in = null;
 BufferedReader bin = null;
 Socket sock = null; 
 try {
 sock = new Socket ("127.0.0.1" ,5155) ; 
 in = sock. getInputStream();
 bin = new BufferedReader(new InputStreamReader(in)); 
 String line;
 while ( (line = bin.readLine()) != null)
	System.out.println(line); 
 }
 catch (IOException ioe) { System.err .println(ioe) ; } 
 finally { if (sock != null) sock.close() ; } 
 }}
