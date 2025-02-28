package com.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Nominee")
public class Nominee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int NomineeId;

	private String NomineeName;

	private Integer userId;   // user id from User

	public int getNomineeId() {
		return NomineeId;
	}

	public void setNomineeId(int nomineeId) {
		NomineeId = nomineeId;
	}

	public String getNomineeName() {
		return NomineeName;
	}

	public void setNomineeName(String nomineeName) {
		NomineeName = nomineeName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Nominee [NomineeId=" + NomineeId + ", NomineeName=" + NomineeName + ", userId=" + userId + "]";
	}
	

}
