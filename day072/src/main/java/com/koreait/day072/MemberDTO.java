package com.koreait.day072;

import org.hibernate.validator.constraints.NotEmpty;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MemberDTO {
	//유효성관련 어노테이션 
	@NotNull(message="name NULL")
	@NotEmpty(message="name EMPTY")
	@Size(min=2, max=6, message="name ERROR") 
	private String name;
	private int age;
}
