package com.sms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FEE")
public class Fee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="FEE_ID")
	private Integer feeId;
	
	@Column(name="STUDENT_ID")
	private Integer studentId;
	
	@Column(name="AMOUNT")
	private Integer amount;
	
	@Column(name="MONTH")
	private String monthOfFee;
	
	@Column(name="PORT")
	private Integer port;

	public Integer getFeeId() {
		return feeId;
	}

	public void setFeeId(Integer feeId) {
		this.feeId = feeId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getMonthOfFee() {
		return monthOfFee;
	}

	public void setMonthOfFee(String monthOfFee) {
		this.monthOfFee = monthOfFee;
	}
	
	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}
}
