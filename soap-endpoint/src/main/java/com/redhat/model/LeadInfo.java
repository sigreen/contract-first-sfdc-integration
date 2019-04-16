package com.redhat.model;

public class LeadInfo {
	
	private String first_name;
	private String last_name;
	private String company;
	private String source;
	private String phone;
	private String email;
	private String status;
	private String rating;
	
	public LeadInfo() {}
	
	public LeadInfo(String first_name, String last_name, String company, String source, String phone, String email,
			String status, String rating) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.company = company;
		this.source = source;
		this.phone = phone;
		this.email = email;
		this.status = status;
		this.rating = rating;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
}
