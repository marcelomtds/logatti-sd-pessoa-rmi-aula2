package servidor;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import comum.ServicoRemotoImpl;

public class Servico {

	public static final String URL = "rmi://localhost:8282/pessoaExercicio";

	public Servico() throws RemoteException {

		try {
			LocateRegistry.createRegistry(8282);
			System.out.println("Iniciando servidor ...");
			Naming.rebind(URL, new ServicoRemotoImpl());
			System.out.println("Servidor iniciado com sucesso ...");
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws RemoteException {
		new Servico();
	}

}
