package br.com.etechoracio.sihas.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="TBL_ENDERECO")
public class Endereco {

@Getter
@Setter

@Id
@GeneratedValue
@Column(name="ID_ENDERECO")
 private Long id;

@Column(name="TX_ENDERECO")
private String logradouro;

@Column(name="NR_NUMERO")
private Long numero;

@Column(name="TX_COMPLEMENTO")
private String complemento;

@Column(name="TX_BAIRRO")
private String bairro;

@Column(name="TX_CIDADE")
private String cidade;

@Column(name="TX_UF")
private String estado;

@Column(name="TX_CEP")
private String cep;



}
