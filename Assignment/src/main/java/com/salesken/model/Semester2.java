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

@Data
@Embeddable
public class Semester2 {

	private final Integer  idSem2=2;
	private Integer sem2EnglishMarks;
	private Integer sem2MathsMarks;
	private Integer sem2ScienceMarks;
	

	
}
