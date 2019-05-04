package com.usa.fed.gov.entity;

@Entity
@Table
@Data

public class Ssnmaster {
	@Id
	@Generator Value
	private long ssn;
	private String fname;
	private String lname;
	private String gender;
	private Date DOB;
	private String phone;
	private String state;
	private byte[] photo;
	private Date createdate;
	private Date updatedate;
	private String createdby;
	private String updatedby;
	
	
	

}
