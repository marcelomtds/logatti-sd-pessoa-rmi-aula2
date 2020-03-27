package comum;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * @author Marcelo
 *
 */
public class PessoaFisica extends Pessoa implements Serializable {

	private static final long serialVersionUID = -5246313003068355927L;

	private String cpf;
	private int idade;
	private double salario;
	private String nomePai;
	private String nomeMae;

	public PessoaFisica() throws RemoteException {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Override
	public String toString() {
		return "CPF: " + cpf + ", Idade: " + idade + ", Salário: " + salario + ", Nome do Pai: " + nomePai
				+ ", Nome da Mãe: " + nomeMae + super.toString();
	}

}
