package com.example.demo.dto;

import com.example.demo.model.User;

public record JwtResponse(
		String accessToken,
		String refreshToken,
		UserDto dto
		) {

}
