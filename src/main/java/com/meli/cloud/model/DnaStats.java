package com.meli.cloud.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DnaStats implements Serializable {
	private static final long serialVersionUID = 5L;

	private int countMutant;
	private int countHuman;
	private double ratio;

}
