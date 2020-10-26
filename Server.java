package lab4_UngDungChat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private static Scanner scan;

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(8888);
			System.out.println("Server da duoc tao");
			Socket client = server.accept();
			System.out.println("Client da ket noi den server");
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("Xin Chao! Ban Muon Lam Gi?");
			while(true) {
				String obj = "exit";
				
				Scanner inFromClient = new Scanner(client.getInputStream());
				outToClient = new PrintStream(client.getOutputStream());
				String text = inFromClient.nextLine();
				System.out.println("client: " + text);
				if(text.equals(obj)) {
					break;
				}
				System.out.print(">>>");
				scan = new Scanner(System.in);
				String txt = scan.nextLine();
				outToClient.println(txt);
				if(txt.equals(obj)) {
					break;
				}
			}
			outToClient.println("Close");
			System.out.println("Close");
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			}
}