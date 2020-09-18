package trabalho15;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CorpoHumano {
	@Id
	private String id;
	private String nome;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "corpoHumano_id")
	private List<Orgaos> orgaos = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "corpoHumano_id")
	private List<Membros> membros = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "coracao_id", table = "corpohumano")
	private Orgaos coracao;

	public CorpoHumano() {
		this.id = UUID.randomUUID().toString();
	}

	public CorpoHumano(String nome) {
		this();
		this.nome = nome;
	}

	public void setCoracao(Orgaos coracao) {
		this.coracao = coracao;
	}

	public Orgaos getCoracao() {
		return coracao;
	}

	public void addOrgaos(Orgaos novo) {
		this.orgaos.add(novo);
	}

	public void addMembros(Membros novo) {
		this.membros.add(novo);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public List<Orgaos> getOrgaos() {
		return orgaos;
	}
	
	public List<Membros> getMembros(){
		return membros;
	}
}
