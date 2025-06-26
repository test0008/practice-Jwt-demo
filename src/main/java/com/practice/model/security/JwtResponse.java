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
public class JwtResponse {
	private String jwtToken;
	private String userName;
	
	
	@Override
	public String toString() {
		return "JwtResponse : {\"jwtToken\" : \"" + jwtToken + "\", \"userName\" : \"" + userName + "\"}";
	}
	
	
}
