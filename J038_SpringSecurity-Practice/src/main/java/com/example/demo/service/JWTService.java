package com.example.demo.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTService {

	public static final String SECRET_KEY="fdftrtrtrebcvfrrtrtretretrewtrtretretrerertreyyrretrert";
	public static final long ACCESS_TOKEN_EXPIRATION = 1*60*1000;
	public static final long REFRESH_TOKEN_EXPIRATION = 24*60*1000;
	
	public String generateToken(String username, boolean isAccessToken)
	{
		long expiration = isAccessToken ? ACCESS_TOKEN_EXPIRATION:REFRESH_TOKEN_EXPIRATION;
		
		return Jwts.builder()
				.setSubject(username)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis()+expiration))
				.signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()),io.jsonwebtoken.SignatureAlgorithm.HS256)
				.compact();
	
	}
	
	public String getUsernamefromToken(String token)
	{
		return Jwts.parser().setSigningKey(SECRET_KEY.getBytes())
				.build()
				.parseClaimsJws(token)
				.getBody().getSubject();
	}
	
	public boolean validateToken(String token)
	{
		
		try {
			Jwts.parser().setSigningKey(SECRET_KEY.getBytes())
			.build().parseClaimsJws(token);
			return true;
		} catch (JwtException e) {
			return false;
		}
	}
	
}
