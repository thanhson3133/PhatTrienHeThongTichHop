
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class Cau2_Server {
public static void main(String[] args) {

try {
	ServerSocket server = new ServerSocket(9541);
	System.out.println("Server Đã Được Tạo");
	Socket client = server.accept();
	System.out.println("Client Đã Kết Nối Đến Server");
	Scanner inFromClient = new Scanner(client.getInputStream());
	PrintStream outToClient = new PrintStream(client.getOutputStream());
	outToClient.println("Bạn Muốn Tìm Sách Gì?");
	String tens = inFromClient.nextLine();
	System.out.println("Client: " + tens);
	BufferedReader br= new BufferedReader(new FileReader("G:\\PhatTrienHeThongTichHop\text.txt"));
	String tep=br.readLine();
	if(tep.contains(tens))
		outToClient.println("Có Sách " + tens);
	else
		outToClient.println("Không Có Sách" + tens);
	} catch (IOException e) {
// TODO Auto-generated catch block
		e.printStackTrace();
}
}
}