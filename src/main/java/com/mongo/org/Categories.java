package com.mongo.org;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger bigDecimal;
	private String name;

	public BigInteger getBigDecimal() {
		return bigDecimal;
	}

	public void setBigDecimal(BigInteger bigDecimal) {
		this.bigDecimal = bigDecimal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
