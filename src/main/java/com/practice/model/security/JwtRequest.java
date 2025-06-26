package com.practice.model.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtRequest {
	private String email;
	private String password;
	
	
	@Override
	public String toString() {
		return "JwtRequest : {\"email\" : \"" + email + "\", \"password\" : \"" + password + "\"}";
	}
}
