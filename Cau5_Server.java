import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cau5_Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("Server Đã Được Tạo");
			Socket client = server.accept();
			System.out.println("Client Đã Được Kết Nổi Đến Server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("(Mời Bạn Nhập Một Chuỗi)");
			String a = inFromClient.nextLine();
			char[] in = a.toCharArray();
		    int begin=0;
		    int end=in.length-1;
		    char temp;
		    while(end>begin){
		        temp = in[begin];
		        in[begin]=in[end];
		        in[end] = temp;
		        end--;
		        begin++;
		    }
		    outToClient.print("(Chuỗi Đảo Ngược Là):");
		    outToClient.println(in);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}

}