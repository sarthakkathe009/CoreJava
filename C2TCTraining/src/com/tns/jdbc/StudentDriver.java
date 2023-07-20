package com.tns.jdbc;

import java.sql.SQLException;

public class StudentDriver {

	public static void main(String[] args) {
		int n;
		StudentServiceImp service=new StudentServiceImp();
//		StudentServiceImpUsingPrepareStatement service=new StudentServiceImpUsingPrepareStatement();
//		StudentServiceImpUsingCallableStatement service=new StudentServiceImpUsingCallableStatement();
		try {
//			n=service.addStudent(1,"John",77.55f,101);
//			n=service.addStudent(4,"Sam",97.53f,104);
//			n=service.addStudent(5,"Pablo",88.63f,105);
			n=service.addStudent(6,"JellyBean",65.98f,106);
			if(n>0)
				System.out.println("RECORD INSERTED!!");
//			n=service.deleteStudentByRollNo(4);
//			if(n>0)
//				System.out.println("RECORD DELETED!!");
//			n=service.updateStudentPerByRollNo(4,69.46f);
//			if(n>0)
//				System.out.println("RECORD UPDATED!!");
//			n=service.updateStudentNameByClgId(103,"Soul");
//			if(n>0)
//				System.out.println("RECORD UPDATED!!");
//			service.displayStudentTable();
//			n=service.updateStudentNameByClgId(102,"Carla");
//			if(n>0)
//				System.out.println("RECORD UPDATED!!");
//			service.addStudent(5,"Sam",64.19f,105);
			
		}
		catch(SQLException e) {
			System.err.println(e.getMessage());
		}

	}

}
