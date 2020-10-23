package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_cliente")
@Entity
public class Cliente implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 3L;
	// campos banco de dados id, nome, cpf, data de nascimento, telefone, email, nome do pai e da
	// mae.
    //gerar Geg e Set Construtor cheio e vazio
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;
	private String datanasci;
	private String telefone;
	private String email;
	private String nomepai;
	private String nomemae;

	public Cliente() {
		super();
		
	}

	public Cliente(Long id, String name, String cpf, String datanasci, String telefone, String email, String nomepai,
			String nomemae) {

	
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.datanasci = datanasci;
		this.telefone = telefone;
		this.email = email;
		this.nomepai = nomepai;
		this.nomemae = nomemae;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDatanasci() {
		return datanasci;
	}

	public void setDatanasci(String datanasci) {
		this.datanasci = datanasci;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomepai() {
		return nomepai;
	}

	public void setNomepai(String nomepai) {
		this.nomepai = nomepai;
	}

	public String getNomemae() {
		return nomemae;
	}

	public void setNomemae(String nomemae) {
		this.nomemae = nomemae;
	}

}