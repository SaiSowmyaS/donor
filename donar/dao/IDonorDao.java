package com.cg.donar.dao;

import java.util.List;

import com.cg.donar.bean.DonorBean;
import com.cg.donar.exception.DonorException;

public interface IDonorDao {
	public String addDonor(DonorBean donor) throws DonorException;
	public DonorBean viewDonorDetails(String donorId) throws DonorException;
	public List retrieveAll() throws DonorException;

}
