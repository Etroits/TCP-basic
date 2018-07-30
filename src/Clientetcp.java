import java.net.*;
import java.io.*;
public class Clientetcp {
	public static void main (String argv[]){
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Socket socket;
		byte[] message_byte = new byte[256];
		
		String message ="";
		
		try{
			socket = new Socket("127.0.0.1",6000);
			DataOutputStream out= new DataOutputStream(socket.getOutputStream());
			do{
				message= in.readLine();
				out.writeUTF(message);
			}while(!message.startsWith("fin"));
			
			
		}catch (Exception g){
			System.err.println(g.getMessage());
			System.exit(1);
		}
		
		
	}
	

}
