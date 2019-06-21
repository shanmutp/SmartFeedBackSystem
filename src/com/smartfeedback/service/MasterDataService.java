package com.smartfeedback.service;

import java.util.Map;

import com.smartfeedback.bo.MasterDataBO;

public class MasterDataService {

	
	public Map<Integer, String> fetchSpecialization() {
		return new MasterDataBO().fetchSpecialization();
	}

	public Map<Integer, String> fetchCourse() {
		return new MasterDataBO().fetchCourse();
	}
}
