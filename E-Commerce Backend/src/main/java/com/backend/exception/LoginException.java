package com.backend.exception;


@NoArgsConstructor
public class LoginException extends RuntimeException{

	
	public LoginException(String message) {
		super(message);
	}
	
}
