package br.com.etechoracio.sihas.biblioteca.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_AUTOR")
public class Autor {

@Getter
@Setter

	@Id
	@GeneratedValue
	@Column(name="ID_AUTOR")
	private Long id;

	
	@Column(name="TX_NOME")
	private String nome;

	@Column(name="DT_INICIO_VIGENCIA")
	private Date dataInicio;
	
	@Column(name="DT_FIM_VIGENCIA")
	private Date dataFim;
	
	@PrePersist
	private void getDateTime() { 
		if(dataInicio == null) {
			dataInicio= new Date();
		}
	}
}
