package comum;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {

	private static final long serialVersionUID = 4416943133236562597L;

	protected int id;
	protected String nome;
	protected String telefone;
	protected String endereco;
	protected String cidade;
	protected String estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return ", ID=" + id + ", Nome: " + nome + ", Telefone: " + telefone + ", Endereço: " + endereco + ", Cidade: "
				+ cidade + ", Estado: " + estado;
	}

}
