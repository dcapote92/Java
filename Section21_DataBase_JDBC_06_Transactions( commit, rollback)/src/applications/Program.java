package applications;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			
//			Set auto-commit to false (so change stay as pending until manually committed)    
			conn.setAutoCommit(false);
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
//			Interrupt process with an exception and rolled back the changes made.
//			int x = 1;
//			if (x < 2) {
//			 throw new SQLException ("Fake error");
//			}
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
//			Accept changes made as sequence went without errors
			conn.commit();
			
			System.out.printf("Rows 1 = %d%n", rows1);
			System.out.printf("Rows 2 = %d", rows2);
			
		}catch(SQLException e) {
			try {
//				Undo changes made as there were troubles on the sequence, this can throw a new Exception.
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			}catch(SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
