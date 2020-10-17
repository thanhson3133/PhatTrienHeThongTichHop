
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Cau2_Client {
public static void main(String[] args) {
try {
	Socket client = new Socket("LocalHost", 9541);
	System.out.println("Client Đã Được Tạo");
	Scanner inFromServer = new Scanner(client.getInputStream());
	PrintStream outToServer = new PrintStream(client.getOutputStream());
	System.out.println("Server: " + inFromServer.nextLine());
	Scanner scan = new Scanner(System.in);
	String tens = scan.nextLine();
	outToServer.println(tens);
	System.out.println("Server: " + inFromServer.nextLine());
	} catch (UnknownHostException e) {

		e.printStackTrace();
	} catch (IOException e) {

		e.printStackTrace();
}
}
}
