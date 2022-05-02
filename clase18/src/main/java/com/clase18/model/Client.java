package com.clase18.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "clients")
public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8196464209105309910L;
	//dni, nombre, apellido,email, direccion
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String dni;
	@Column
	private String name;
	@Column
	private String surname;
	@Column
	private String email;
	@Column
	private String address;
	public Client(String dni, String name, String surname, String email, String address) {
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.address = address;
	}

	
}
