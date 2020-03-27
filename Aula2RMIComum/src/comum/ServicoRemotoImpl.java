package comum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto {

	private static final long serialVersionUID = -6791788942116179789L;

	private static List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public ServicoRemotoImpl() throws RemoteException {
		super();
	}

	public void inserir(Pessoa pessoa) throws RemoteException {
		pessoas.add(pessoa);
	}

	public List<Pessoa> listarPessoa() throws RemoteException {
		return pessoas;
	}

}
