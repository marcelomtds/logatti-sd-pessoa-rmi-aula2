package comum;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServicoRemoto extends Remote {

	void inserir(final Pessoa pessoa) throws RemoteException;

	List<Pessoa> listar() throws RemoteException;

}
