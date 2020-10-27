package lab4_DocSo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server_DocSo {

private static ServerSocket serverSocket = null;

public static void main(String[] args) throws IOException{

// TODO code application logic here

    DataOutputStream dos = null;

    DataInputStream dis=null;

    try {

        serverSocket = new ServerSocket(7777);

        System.out.print("Server da đuoc tao" );

        Socket clientSocket = null;

        clientSocket = serverSocket.accept();

        dos=new DataOutputStream(clientSocket.getOutputStream());

        dis=new DataInputStream(clientSocket.getInputStream());

        String doc="";

        while(true)

        {

            doc = dis.readUTF();

            char ch[]=doc.toCharArray();

            if(Character.isDigit(ch[0]))

                {

                int i=Integer.parseInt(doc);

                switch(i)

                {

                    case 0:doc="Khong";break;

                    case 1:doc="Mot";break;

                    case 2:doc="Hai";break;

                    case 3:doc="Ba";break;

                    case 4:doc="Bon";break;

                    case 5:doc="Nam";break;

                    case 6:doc="Sau";break;

                    case 7:doc="Bay";break;

                    case 8:doc="Tam";break;

                    case 9:doc="Chin";break;
                    default:
                    	doc="Khong phai la so nguyen";

                }

                dos.writeUTF(doc);

            }

        }

    }

    catch(Exception e) {

        dos.close();

        serverSocket.close();

        dis.close();

        System.out.print(e.getMessage());

    }

}

} 
