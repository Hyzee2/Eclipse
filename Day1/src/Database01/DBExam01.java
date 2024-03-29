package Database01;

import java.sql.Connection;
//Database 접속
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class DBExam01 {
	Connection conn;
	PreparedStatement pstmt; // prepared

	public DBExam01() {
		this("jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC", "root", "qwe123!@#");
		// 아래 생성자 이용
	}

	public DBExam01(String url, String user, String pw) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		DBExam01 exam = new DBExam01();
		// 객체 생성할 때 바로 DB 연결되도록 생성자에 conn 만들기
		System.out.println("DB connection success");
		
//		String[] str = {"AAA", "BBB", "CCC"};
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("id와 name을 차례로 입력하세요");
//		int id = sc.nextInt();
//		String name = sc.next();

		// exam.createDB();

		//exam.dbInput();
		
		//exam.dbInput2();
		
		//exam.dbInput3(str);
		
		//exam.dbInput4(id, name);
		
		//exam.result();
		
		//exam.update("DDD");
		
		exam.delete("DDD");
	}

	private void delete(String string) {
		// TODO Auto-generated method stub
		try {
			String sql = "delete from student3 where username=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, string);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private void update(String string) {
		// TODO Auto-generated method stub
		try {
			String sql = "update student3 set username=? where id=1";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, string);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private void result() throws SQLException {
		// table 값 조회
		String sql = "select * from student3";
		pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) { 
			int id = rs.getInt(1); // 1번째 컬럼 가져오기 
			String name =rs.getString(2); // 2번째 컬럼 가져오기
			
			System.out.println("id는 "+id+"인 사람의 이름은 "+name);
		}
				
				
	}

	private void dbInput4(int id, String name) {
		// Scanner로 사용자에게 값을 입력받기 
		try {
			String sql4 = "insert into student3 values(?,?)";
			
			pstmt = conn.prepareStatement(sql4);
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private void dbInput3(String[] str) {
		// 반복문 사용해서 배열 안의 요소 값으로 입력해주기 
		try {
			String sql3 = "insert into student3 values(?,?)";
			
			pstmt = conn.prepareStatement(sql3);
			
			for(int i=0; i<str.length; i++) {
				pstmt.setInt(1, i);
				pstmt.setString(2, str[i]);
				pstmt.executeUpdate();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private void dbInput2() {
		// ? 이용해서 사용자가 입력하는 값 받기 
		try {
			String sql2 = "insert into student3 values(?, ?)";
			
			pstmt = conn.prepareStatement(sql2);
			
			pstmt.setInt(1, 9);
			pstmt.setString(2, "Carrotman");
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void dbInput() {
		// 값 직접 입력
		try {
			//String sql = "insert into student3 values(7, 'superman')";
			String sql2 = "insert into student3 values(8, 'batman')";
			//pstmt = conn.prepareStatement(sql);
			//pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void createDB() {
		// 테이블 만드는 메서드 
		try {
			String s = "drop table if exists student3;";
			String sql = "create table student3(\r\n" + "id int,\r\n" + "username varchar(20),\r\n"
					+ "primary key(id)\r\n" + ")\r\n";

			pstmt = conn.prepareStatement(s); // prepare
			pstmt.executeUpdate();

			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
