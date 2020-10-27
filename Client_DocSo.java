package lab4_DocSo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
public class Client_DocSo

{
    public static void main(String[] args) throws IOException

    {

    // TODO code application logic here

   

        Socket mySocket = null;

        DataOutputStream dos = null;

        DataInputStream dis=null;

       

        try {

            mySocket = new Socket("localhost", 7777);

            dos = new DataOutputStream(mySocket.getOutputStream());

            dis = new DataInputStream(mySocket.getInputStream());

            Scanner input = new Scanner(System.in);

            String s = null;

            while(true)

            {

                System.out.print("\nNhap So Muon Doc: ");

                s =input.nextLine();

                dos.writeUTF(s);

               

                String str=dis.readUTF();

                System.out.print(" Server : "+str);

            }

        }

        catch(Exception e) {

            System.out.print("Ngat ket noi");

            dis.close();

            dos.close();

            mySocket.close();

            e.printStackTrace();

        }

    }

}
