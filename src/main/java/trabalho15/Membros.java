package trabalho15;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Membros {
	@Id
	private String id;

	@Column(unique = true)
	private String nome;

	public Membros() {
		this.id = UUID.randomUUID().toString();

	}

	public Membros(String nome) {
		this();
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
