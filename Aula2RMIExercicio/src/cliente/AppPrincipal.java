package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Random;

import comum.IServicoRemoto;
import comum.Pessoa;
import comum.PessoaFisica;
import comum.PessoaJuridica;

public class AppPrincipal {

	public static final String URL = "rmi://localhost:8282/pessoaExercicio";
	public static final Random RANDOM = new Random();
	public static IServicoRemoto iServicoRemoto;

	public static void main(String[] args) {

		try {

			iServicoRemoto = (IServicoRemoto) Naming.lookup(URL);

			System.out.println("Inserindo Pessoa Física ... ");
			final PessoaFisica pessoaFisica = new PessoaFisica();
			pessoaFisica.setId(gerarID());
			pessoaFisica.setNome("Marcelo Tadeu de Souza");
			pessoaFisica.setTelefone("16997314845");
			pessoaFisica.setEndereco("Rua Manoel Rodrigues Fonseca 81");
			pessoaFisica.setCidade("Trabiju");
			pessoaFisica.setEstado("São Paulo");
			pessoaFisica.setCpf("99999999999");
			pessoaFisica.setIdade(28);
			pessoaFisica.setSalario(7000.00);
			pessoaFisica.setNomePai("João de Deus de Souza");
			pessoaFisica.setNomeMae("Ana Darques Tomaz de Souza");
			iServicoRemoto.inserir(pessoaFisica);

			System.out.println("Inserindo Pessoa Jurídica ... ");
			final PessoaJuridica pessoaJuridica = new PessoaJuridica();
			pessoaJuridica.setId(gerarID());
			pessoaJuridica.setNome("Auto Posto 9");
			pessoaJuridica.setTelefone("1633333333");
			pessoaJuridica.setEndereco("Rua Nove de Julho 530");
			pessoaJuridica.setCidade("Araraquara");
			pessoaJuridica.setEstado("São Paulo");
			pessoaJuridica.setCnpj("88888888888888");
			iServicoRemoto.inserir(pessoaJuridica);

			imprimir();

		} catch (final MalformedURLException e) {
			e.printStackTrace();
		} catch (final RemoteException e) {
			e.printStackTrace();
		} catch (final NotBoundException e) {
			e.printStackTrace();
		}

	}

	private static void imprimir() throws RemoteException {
		System.out.println("Listando... ");
		for (final Pessoa pessoa : iServicoRemoto.listar()) {
			if (pessoa instanceof PessoaFisica) {
				System.out.println(gerarAumento(pessoa).toString());
			} else {
				System.out.println(pessoa.toString());
			}
		}
	}

	private static Pessoa gerarAumento(final Pessoa pessoa) {
		if (((PessoaFisica) pessoa).getIdade() <= 20) {
			((PessoaFisica) pessoa).setSalario(((PessoaFisica) pessoa).getSalario() * 0.10);
		} else if (((PessoaFisica) pessoa).getIdade() > 20
				&& ((PessoaFisica) pessoa).getIdade() <= 30 + ((PessoaFisica) pessoa).getSalario()) {
			((PessoaFisica) pessoa)
					.setSalario(((PessoaFisica) pessoa).getSalario() * 0.15 + ((PessoaFisica) pessoa).getSalario());
		} else {
			((PessoaFisica) pessoa)
					.setSalario(((PessoaFisica) pessoa).getSalario() * 0.20 + ((PessoaFisica) pessoa).getSalario());
		}
		return pessoa;
	}

	private static int gerarID() {
		return RANDOM.nextInt(1000) + 1;
	}

}
