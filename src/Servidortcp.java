import java.net.*;
import java.io.*;
public class Servidortcp {

	public static void main(String argv[]) {
		
		ServerSocket socket;
		
		boolean fin = false;
		
		try{
			socket= new ServerSocket(6000);
		Socket socket_client = socket.accept();
		
		DataInputStream in = new DataInputStream(socket_client.getInputStream());
		
		do{
			String message = "";
			message = in.readUTF();
			System.out.println(message);
			
		}while(1>0);

	}catch (Exception g){
		System.err.println(g.getMessage());
		System.exit(1);
	}

}
	}
