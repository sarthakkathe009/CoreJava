package com.tns.jdbc;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class StudentServiceImpUsingCallableStatement implements StudentService {
	static CallableStatement cservice;
	@Override
	public int addStudent(int rollNo, String name, float per, int clgId) throws SQLException {
		cservice=DBUtil.getConnection().prepareCall("call addStudent(?,?,?,?)");
		cservice.setInt(1,rollNo);
		cservice.setString(2,name);
		cservice.setFloat(3,per);
		cservice.setInt(4,clgId);
		if(cservice.execute())
			return 1;
		else
			return 0;
	}

	@Override
	public int deleteStudentByRollNo(int rollNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudentByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStudentPerByRollNo(int rollNo, float per) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStudentNameByClgId(int clgId, String name) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayStudentTable() throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
