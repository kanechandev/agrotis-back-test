package br.com.agrotiskane.agrotis_kane.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@SequenceGenerator(name="seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	private Long id;
	
	@NotEmpty(message = "Campo obrigatório.")
	private String nome;
	
	@NotNull
	@DateTimeFormat
	private LocalDate dataInicial;
	
	@NotNull
	@DateTimeFormat
	private LocalDate dataFinal;
	
	@NotNull
	@OneToOne
    @JoinColumn(name="laboratorio_id", nullable=false)
	private Laboratorio laboratorio;	
	
	private String observacoes;
	
	@NotNull
	@OneToOne
    @JoinColumn(name="infospropriedade_id", nullable=false)
	private InfosPropriedade infosPropriedade;

}
