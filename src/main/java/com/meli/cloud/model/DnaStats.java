package com.meli.cloud.model;

import java.io.Serializable;
import java.util.Objects;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DnaStats implements Serializable {
	private static final long serialVersionUID = 5L;

	private int countMutant;
	private int countHuman;
	private double ratio;

//  @Override
//  public String toString() {
//    return "User{" +
//        "name='" + name + '\'' +
//        ", id=" + id +
//        ", salary='" + salary + '\'' +
//        '}';
//  }

//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
//    DnaStats user = (DnaStats) o;
//    return Objects.equals(name, user.name) &&
//        Objects.equals(id, user.id) &&
//        Objects.equals(salary, user.salary);
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(name, id, salary);
//  }

}
