package com.tns.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentServiceImpUsingPrepareStatement implements StudentService {
	static PreparedStatement pservice;
	@Override
	public int addStudent(int rollNo, String name, float per, int clgId) throws SQLException {
		pservice=DBUtil.getConnection().prepareStatement("INSERT INTO info VALUES(?,?,?,?)");
		pservice.setInt(1,rollNo);
		pservice.setString(2,name);
		pservice.setFloat(3,per);
		pservice.setInt(4,clgId);
		int n;
		n=pservice.executeUpdate();
		return n;
	}

	@Override
	public int deleteStudentByRollNo(int rollNo) throws SQLException {
		pservice = DBUtil.getConnection().prepareStatement("DELETE FROM info WHERE roll_no=?");
		pservice.setInt(1, rollNo);
		int n;
		n = pservice.executeUpdate();
		return n;
	}

	@Override
	public int deleteStudentByName(String name) throws SQLException {
		pservice = DBUtil.getConnection().prepareStatement("DELETE FROM info WHERE name=?");
		pservice.setString(1, name);
		int n;
		n = pservice.executeUpdate();
		return n;
	}

	@Override
	public int updateStudentPerByRollNo(int rollNo, float per) throws SQLException {
		pservice=DBUtil.getConnection().prepareStatement("UPDATE info SET per=? WHERE roll_no=?");
		pservice.setFloat(1,per);
		pservice.setInt(2,rollNo);
		int n;
		n=pservice.executeUpdate();
		return n;
	}

	@Override
	public int updateStudentNameByClgId(int clgId, String name) throws SQLException {
		pservice=DBUtil.getConnection().prepareStatement("UPDATE info SET name=? WHERE clg_id=?");
		pservice.setString(1,name);
		pservice.setInt(2,clgId);
		int n;
		n=pservice.executeUpdate();
		return n;
		
	}

	@Override
	public void displayStudentTable() throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Percentage: ");
		float per=sc.nextFloat();
		pservice = DBUtil.getConnection().prepareStatement("SELECT * FROM info WHERE per>=?");
		pservice.setFloat(1, per);
		ResultSet rs;
		rs = pservice.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getInt(4));
		}
		rs.close();
	}

}
