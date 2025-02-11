package com.dtos;

import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;

@Data
public class DogDto {
	
	@NotNull
	private Long id;
	
	@NotBlank(message = "Le nom est obligatoire")
	private String name;
	
	@NotBlank(message = "La race est obligatoire")
	private String race;
	
}
