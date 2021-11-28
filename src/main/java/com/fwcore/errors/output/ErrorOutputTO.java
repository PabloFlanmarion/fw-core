package com.fwcore.errors.output;

import java.io.Serializable;

/**
 * 
 * @author Pablo
 *
 */
public class ErrorOutputTO implements Serializable {

	private static final long serialVersionUID = 14523647789L;

	private int code;
	private String title;
	private String description;

	public int getCode() {
		return code;
	}

	public ErrorOutputTO setCode(int code) {
		this.code = code;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public ErrorOutputTO setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public ErrorOutputTO setDescription(String description) {
		this.description = description;
		return this;
	}

}
