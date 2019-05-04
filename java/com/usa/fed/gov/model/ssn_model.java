package com.usa.fed.gov.model;

import com.usa.fed.gov.entity.Date;

public class ssn_model {

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
	/**
	 * @return the ssn
	 */
	public long getSsn() {
		return ssn;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @return the dOB
	 */
	public Date getDOB() {
		return DOB;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @return the photo
	 */
	public byte[] getPhoto() {
		return photo;
	}
	/**
	 * @return the createdate
	 */
	public Date getCreatedate() {
		return createdate;
	}
	/**
	 * @return the updatedate
	 */
	public Date getUpdatedate() {
		return updatedate;
	}
	/**
	 * @return the createdby
	 */
	public String getCreatedby() {
		return createdby;
	}
	/**
	 * @return the updatedby
	 */
	public String getUpdatedby() {
		return updatedby;
	}
	
	
}
