package com.pharamaeasy.common.base.model;

import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiError{
	
	private HttpStatus status;
	
    private String message;
    
    private List<String> errors;

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApiError [status=").append(status).append(", message=").append(message).append(", errors=")
				.append(errors).append("]");
		return builder.toString();
	}
    
}
