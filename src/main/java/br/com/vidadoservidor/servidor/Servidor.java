package br.com.vidadoservidor.servidor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Servidor {

	@Id
	@Column(name = "id_servidor_portal")
	private Integer id;
	
	@Column(nullable = false)
	private String nome;

	public Servidor() {
		// JPA: The entity class must have a no-argument constructor.
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
