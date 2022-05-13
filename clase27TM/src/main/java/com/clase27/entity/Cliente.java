package com.clase27.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="clientes",uniqueConstraints = { @UniqueConstraint(columnNames = "dni")})
@Data
@NoArgsConstructor
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int dni;
	
	private String nombre;
	
	private String apellido;
}
