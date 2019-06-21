package com.smartfeedback.bo;

import java.util.Map;

import com.smartfeedback.dao.MasterDataDAO;

public class MasterDataBO {

	public Map<Integer, String> fetchSpecialization() {
		return new MasterDataDAO().fetchSpecialization();
	}
	public Map<Integer, String> fetchCourse() {
		return new MasterDataDAO().fetchCourse();
	}
}