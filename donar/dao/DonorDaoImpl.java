package com.cg.donar.dao;

import java.sql.Connection;
import java.util.List;

import com.cg.donar.bean.DonorBean;
import com.cg.donar.exception.DonorException;
import com.cg.donar.util.DBConnection;

public class DonorDaoImpl implements IDonorDao {

	@Override
	public String addDonor(DonorBean donor) throws DonorException {
		Connection connection=DBConnection.getConnection();
		return null;
	}

	@Override
	public DonorBean viewDonorDetails(String donorId) throws DonorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List retrieveAll() throws DonorException {
		// TODO Auto-generated method stub
		return null;
	}

}
