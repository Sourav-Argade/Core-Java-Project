package com.sourav.Interest_Calculator.inhertiance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Bank implements Serializable{
	@Id
	@Column(name="bank")
	private String bank;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(String bank) {
		super();
		this.bank = bank;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}
}
