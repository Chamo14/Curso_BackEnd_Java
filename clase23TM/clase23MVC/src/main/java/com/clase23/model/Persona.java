package com.clase23.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
		private Long id;
		private int dni;
		private String name;
		private String surname;
		private String telephone;
	}


