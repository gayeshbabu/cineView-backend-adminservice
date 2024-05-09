package com.cineAdmin.ResponseType;

public class TokenResponse {
	private String bearerToken;
	private String message;
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TokenResponse(String bearerToken) {
		super();
		this.bearerToken = bearerToken;
	}

	public String getBearerToken() {
		return bearerToken;
	}

	public void setBearerToken(String bearerToken) {
		this.bearerToken = bearerToken;
	}

	public TokenResponse() {
		super();
		
	}
	

}
