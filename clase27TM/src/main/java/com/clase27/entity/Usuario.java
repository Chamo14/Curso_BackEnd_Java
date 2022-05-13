package com.clase27.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Table(name = "usuarios", uniqueConstraints = { @UniqueConstraint(columnNames = { "nombre" }),
		@UniqueConstraint(columnNames = { "email" }) })
@Data
@NoArgsConstructor
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String username;
	private String password;
	private String email;
	@ManyToMany(fetch=FetchType.EAGER,cascade= CascadeType.ALL)
	@JoinTable(name="usuario_roles",joinColumns = @JoinColumn(name="usuario_id",referencedColumnName ="id"),inverseJoinColumns =@JoinColumn(name="rol_id",referencedColumnName = "id"))
	private Set<Rol> roles =new HashSet<>();
}
