package ChuyenBay;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IFlight extends Remote{

	public Flight getFlight(String x) throws RemoteException;
	public String Display(int x) throws RemoteException;
	public String[] DataId() throws RemoteException;
	public String Order(String x,int y,String user,String password) throws RemoteException;
}