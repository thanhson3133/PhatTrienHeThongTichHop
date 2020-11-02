package ChuyenBay;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
public class Server {
    public static void main(String args[]) {

        try {
            LocateRegistry.createRegistry(2007);
            
            // Sign in rmiregistry
            IFlight x = new FlightImpl();
            Naming.bind("rmi://localhost:2007", x );
            System.out.println("Server duoc khoi tao>>>>");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}