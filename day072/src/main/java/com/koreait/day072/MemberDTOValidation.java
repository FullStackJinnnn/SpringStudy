package com.koreait.day072;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MemberDTOValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("확인용 로그 01");
		// 내가 검증하고싶은 객체의 자료형(클래스 타입)에 대한 정보를 제공하는 메서드
		// 외부에서 검증이 오는데 memberDTO클래스랑 맞아 ?
		return MemberDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("확인용 로그 01");
		MemberDTO mDTO = (MemberDTO) target; // 다운 캐스팅(형변환)

		String name = mDTO.getName();
		if (name == null || name.isEmpty() || name.isBlank() || name.trim().isEmpty()) {
			System.out.println("name 값 입력 X");
			errors.rejectValue("name", "NULL");
		} else if (name.length() < 2 || 6 < name.length()) {
			System.out.println("이름 길이 2~6 X");
			errors.rejectValue("name", "NOT 2~6");
		}

		int age = mDTO.getAge();
		if (age < 0 || 200 < age) {
			System.out.println("age 0~200 X");
			errors.rejectValue("age", "NOT 0~200");
		}

	}

}
