package com.clase23.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name ="id")
	private Long id;
	@Column (name="dni",length =  20)
	private int dni;
	@Column (name="name",length =  25)
	private String name;
	@Column (name="surname",length =  25)
	private String surname;
	@Column (name="telephone",length =  15)
	private String telephone;
}
