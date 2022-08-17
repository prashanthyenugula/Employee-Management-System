package com.emp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourseNotFounfException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String resourseName;
	private String fieldName;
	private Integer fieldValue;
	
	public ResourseNotFounfException(String resourseName, String fieldName, Integer id) {
		super(String.format("%s not found with the %s :%s", resourseName, fieldName, id));
		this.resourseName = resourseName;
		this.fieldName = fieldName;
		this.fieldValue = id;
	}

	public String getResourseName() {
		return resourseName;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public Integer getFieldValue() {
		return fieldValue;
	}
	
}
