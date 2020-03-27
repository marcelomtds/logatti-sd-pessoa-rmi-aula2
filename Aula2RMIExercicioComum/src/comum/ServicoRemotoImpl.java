package comum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto {

	private static final long serialVersionUID = 4297156446468500665L;

	private static final List<Pessoa> PESSOAS = new ArrayList<Pessoa>();

	public ServicoRemotoImpl() throws RemoteException {
		super();
	}

	public void inserir(final Pessoa pessoa) throws RemoteException {
		PESSOAS.add(pessoa);
	}

	public List<Pessoa> listar() throws RemoteException {
		return PESSOAS;
	}

}
