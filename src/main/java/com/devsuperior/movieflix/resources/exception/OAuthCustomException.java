package com.devsuperior.movieflix.resources.exception;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthCustomException implements Serializable {

	private static final long serialVersionUID = 1L;

	private String error;
	
	@JsonProperty("error_description")
	private String errorDescrition;
	
	public OAuthCustomException() {
		
	}

	public OAuthCustomException(String error, String errorDescrition) {
		super();
		this.error = error;
		this.errorDescrition = errorDescrition;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getErrorDescrition() {
		return errorDescrition;
	}

	public void setErrorDescrition(String errorDescrition) {
		this.errorDescrition = errorDescrition;
	}
	
	
}
