package br.com.agrotiskane.agrotis_kane.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@SequenceGenerator(name="seq_infospropriedade", sequenceName = "seq_infospropriedades", allocationSize = 1, initialValue = 1)
public class InfosPropriedade {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_propriedade")
	private Long id;
	
	private String nome;
	
}
