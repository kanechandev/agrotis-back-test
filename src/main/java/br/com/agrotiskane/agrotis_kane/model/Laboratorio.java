package br.com.agrotiskane.agrotis_kane.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@SequenceGenerator(name="seq_laboratorio", sequenceName = "seq_laboratorio", allocationSize = 1, initialValue = 1)
public class Laboratorio {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_laboratorio")
	private Long id;


	@NotNull
	@NotEmpty(message = "Campo obrigatório.")
	private String nome;
	
	
}
