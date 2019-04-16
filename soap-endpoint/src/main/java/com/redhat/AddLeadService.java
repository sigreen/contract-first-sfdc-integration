package com.redhat;

import com.redhat.model.Lead;

public interface AddLeadService {
	
	public Lead lead(String first_name, String last_name, String company, String source, String phone, String email,
			String status, String rating);

}
