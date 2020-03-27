package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import comum.IServicoRemoto;
import comum.Pessoa;
import comum.Professor;

public class AppPrincipal {

	public static String URL = "rmi://localhost:8282/pessoa";

	public static void main(String[] args) {

		try {
			IServicoRemoto iServicoRemoto = (IServicoRemoto) Naming.lookup(URL);

			Professor professor = new Professor();
			professor.setId(1);
			professor.setNome("Pedro");
			professor.setTelefone("(11) 11111-1111");
			professor.setCidade("Araraquara");
			iServicoRemoto.inserir(professor);

			Professor professor2 = new Professor();
			professor2.setId(2);
			professor2.setNome("Bruno");
			professor2.setTelefone("(22) 22222-2222");
			professor2.setCidade("São Carlos");
			iServicoRemoto.inserir(professor2);

			for (Pessoa p : iServicoRemoto.listarPessoa()) {
				System.out.println("ID: " + p.getId());
				System.out.println("Nome: " + p.getNome());
				System.out.println("Telefone: " + p.getTelefone());
				System.out.println("Cidade: " + p.getCidade());
				System.out.println();
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}

	}

}
