package org.com.eventos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity(name="evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")	
	private Long codigo;
	

	@Column(name="nome")
	private String nome;
	
	@NotBlank
	@Column(name="local")	
	private String local;
	
	@NotBlank
	@Column(name="data")	
	private String data;
	
	@NotBlank
	@Column(name="horario")
	private String horario;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	@Override
	public String toString() {
		return "Evento [codigo=" + codigo + ", nome=" + nome + ", local=" + local + ", data=" + data + ", horario="
				+ horario + "]";
	}

}
