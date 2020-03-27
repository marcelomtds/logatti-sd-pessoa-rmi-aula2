package comum;

import java.io.Serializable;
import java.rmi.RemoteException;

public class PessoaJuridica extends Pessoa implements Serializable {

	private static final long serialVersionUID = 7950410883237783376L;

	private String cnpj;

	public PessoaJuridica() throws RemoteException {
		super();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "CNPJ:" + cnpj + super.toString();
	}

}
