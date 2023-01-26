package com.salesken.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Embeddable
public class Semester1 {

	private final Integer  idSem1=1;
	private Integer sem1EnglishMarks;
	private Integer sem1MathsMarks;
	private Integer sem1ScienceMarks;

	
}
