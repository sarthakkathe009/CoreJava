package com.tns.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentServiceImp implements StudentService {
	static Statement ss;
	static {
	try {
		ss=DBUtil.getConnection().createStatement();
	}
	catch(SQLException e) {
		System.err.println(e.getMessage());
	}
	}
	@Override
	public int addStudent(int rollNo, String name, float per, int clgId) throws SQLException {
		int n;
		n=ss.executeUpdate("INSERT INTO info VALUES("+rollNo+",'"+name+"',"+per+","+clgId+")");
		return n;
	}

	@Override
	public int deleteStudentByRollNo(int rollNo) throws SQLException {
		int n;
		n=ss.executeUpdate("DELETE FROM info WHERE roll_no="+rollNo);
		return n;
	}

	@Override
	public int deleteStudentByName(String name) throws SQLException {
		int n;
		n=ss.executeUpdate("DELETE FROM info WHERE rollNo="+name);
		return n;
	}

	@Override
	public int updateStudentPerByRollNo(int rollNo, float per) throws SQLException {
		int n;
		n=ss.executeUpdate("UPDATE info SET per="+per+" WHERE roll_no="+rollNo);
		return n;
	}

	@Override
	public void displayStudentTable() throws SQLException {
		ResultSet rs;
		rs=ss.executeQuery("SELECT * FROM info");
		System.err.println("roll_no"+"\t"+"name"+"\t"+"per"+"\t"+"clg_id");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
		}
		rs.close();
	}

	@Override
	public int updateStudentNameByClgId(int clgId, String name) throws SQLException {
		int n;
		n=ss.executeUpdate("UPDATE info SET name='"+name+"' WHERE clg_id="+clgId);
		return n;
	}
	
}
