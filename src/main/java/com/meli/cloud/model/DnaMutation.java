package com.meli.cloud.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DnaMutation implements Serializable {
	private static final long serialVersionUID = 5L;

	private String idDna;
	private String[] dna;
	private int mutations;

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		for (String line : dna) {
			builder.append("[").append(line).append("]");
		}

		return builder.toString();
	}

}
