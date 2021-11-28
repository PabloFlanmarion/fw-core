package com.fwcore.errors.output;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Pablo
 *
 */
public class ErrorOutput implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<ErrorOutputTO> errors;

	public List<ErrorOutputTO> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorOutputTO> errors) {
		this.errors = errors;
	}

}
