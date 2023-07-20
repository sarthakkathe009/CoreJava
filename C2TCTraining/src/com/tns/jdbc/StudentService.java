package com.tns.jdbc;

import java.sql.SQLException;

public interface StudentService {
	int addStudent(int rollNo,String name,float per,int clgId) throws SQLException;
	int deleteStudentByRollNo(int rollNo) throws SQLException;
	int deleteStudentByName(String name) throws SQLException;
	int updateStudentPerByRollNo(int rollNo,float per) throws SQLException;
	int updateStudentNameByClgId(int clgId,String name) throws SQLException;
	void displayStudentTable() throws SQLException;
}
