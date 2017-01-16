package movie_rental;

import java.sql.*;
import java.util.*;


public class adminClass {
	
	//고객정보 조회 ok
	void checkCusInfo() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 = //관리자용조회
				" select CusNum 고객ID, CusName 이름,"
				+ " MovieNum 영화순번, CusTel 연락처"
				+ " from cusInfoTable"
				+ " order by 1";
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		ResultSet rs = pst1.executeQuery();
		
		while(rs.next()){
			int cusID=rs.getInt("고객ID");
			String cusName=rs.getString("이름");
			int mvNum=rs.getInt("영화순번");
			String cusTel=rs.getString("연락처");
			System.out.println
			(rs.getRow()+"\t"+cusID+"\t"+cusName+"\t"+mvNum+"\t"+cusTel);
		}
		
		//int rowcnt1 = pst1.executeQuery();
		//System.out.println(rowcnt1+"행 delete");//update 행 갯수
		con1.close();
		System.out.println("접속끝");
		
	}
	
	
	//영화정보 조회 ok
	void checkMV() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 = //관리자용조회
				" select MovieNum 영화순번, MovieName 영화이름,"
				+ " MoviePrice 영화가격, MovieDate 출시연도"
				+ " from movieTable"
				+ " order by 1";
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		ResultSet rs = pst1.executeQuery();
		
		while(rs.next()){
			int mvNum=rs.getInt("영화순번");
			String mvTitle=rs.getString("영화이름");
			int mvPrice=rs.getInt("영화가격");
			int mvDate=rs.getInt("출시연도");
			System.out.println
			(rs.getRow()+"\t"+mvNum+"\t"+mvTitle+"\t"+mvPrice+"\t"+mvDate);
		}
		
		//int rowcnt1 = pst1.executeQuery();
		//System.out.println(rowcnt1+"행 delete");//update 행 갯수
		con1.close();
		System.out.println("접속끝");
		
	}
	
	
	// 고객정보 추가 ok
	void insertCusInfo() throws ClassNotFoundException, SQLException {
	
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 =
				"insert into cusInfoTable values (?,?,?,?)";
		
		PreparedStatement pst1 = con1.prepareStatement(sql2);
		
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("고객 ID : ");
		int cusID=sc1.nextInt();	
		
		System.out.println("고객 이름 : ");
		String cusName=sc1.nextLine();
		
		System.out.println("영화순번 : ");
		int mvNum=sc1.nextInt();

		System.out.println("연락처 : ");
		String cusTel=sc1.nextLine();
		
		pst1.setInt(1, cusID);
		pst1.setString(2, cusName);
		pst1.setInt(3, mvNum);
		pst1.setString(4, cusTel);
		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"행 insert");
		con1.close();
		System.out.println("접속끝");
		
	}

	
	// 영화정보 추가 ok
	void insertMV() throws ClassNotFoundException, SQLException {
	
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 =
				"insert into movieTable values(?,?,?,?)";
		
		PreparedStatement pst1 = con1.prepareStatement(sql2);
		
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("영화순번 : ");
		int mvNum=sc1.nextInt();	
		
		System.out.println("영화제목 : ");
		String mvTitle=sc1.nextLine();
		
		System.out.println("대여가격 : ");
		int mvPrice=sc1.nextInt();

		System.out.println("연도: ");
		int mvDate=sc1.nextInt();
		
		pst1.setInt(1, mvNum);
		pst1.setString(2, mvTitle);
		pst1.setInt(3, mvPrice);
		pst1.setInt(4, mvDate);
		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"행 insert");
		con1.close();
		System.out.println("접속끝");
		
	}
	
	
	//고객정보 수정 ok //이름 수정
	void updateCusInfo() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 = // 변경시
				" update cusInfoTable "
				+" set CusName = ? " 
				+" where CusName = ? ";
				
				PreparedStatement pst1 =
						con1.prepareStatement(sql2);
				
				Scanner sc1=new Scanner(System.in);
				
				System.out.println("변경 할 고객이름 : ");
				String hal_name=sc1.next();
				
				System.out.println("변경 될 고객이름 : ");
				String deul_name=sc1.next();
				
				pst1.setString(1, deul_name);
				pst1.setString(2, hal_name);
				
				int rowcnt1 = pst1.executeUpdate();
				System.out.println(rowcnt1+"행 update");
				con1.close();
				System.out.println("접속끝");
	}
		
	
	// 영화정보 수정ok //이름 수정
	void updateTMV() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 = // 변경시
				" update movieTable "
				+" set MovieName = ? " 
				+" where MovieName = ? ";
				
	
		PreparedStatement pst1 =
			con1.prepareStatement(sql2);
				
		Scanner sc1=new Scanner(System.in);
				
		System.out.println("변경 할 영화제목: ");
		String hal_name=sc1.nextLine();
				
		System.out.println("변경 될 영화제목: ");
		String deul_name=sc1.nextLine();
				
				
		pst1.setString(1, deul_name);
		pst1.setString(2, hal_name);
				
		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"행 update");
		con1.close();
		System.out.println("접속끝");
		
	}
	
	// 영화정보 수정ok //연도 수정
	void updateYMV() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 = // 변경시
				" update movieTable "
				+" set MovieDate = ? " 
				+" where MovieDate = ? ";
				
	
		PreparedStatement pst1 =
			con1.prepareStatement(sql2);
				
		Scanner sc1=new Scanner(System.in);
				
		System.out.println("변경 할 영화연도: ");
		int hal_date=sc1.nextInt();
				
		System.out.println("변경 될 영화연도: ");
		int deul_date=sc1.nextInt();
				
				
		pst1.setInt(1, deul_date);
		pst1.setInt(2, hal_date);
				
		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"행 update");
		con1.close();
		System.out.println("접속끝");
		
	}
	
	// 영화정보 수정ok //가격 수정
	void updatePMV() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 = // 변경시
				" update movieTable "
				+" set MoviePrice = ? " 
				+" where MoviePrice = ? ";
				
		PreparedStatement pst1 =
			con1.prepareStatement(sql2);
				
		Scanner sc1=new Scanner(System.in);
				
		System.out.println("변경 할 영화제목: ");
		int hal_price=sc1.nextInt();
				
		System.out.println("변경 될 영화제목: ");
		int deul_price=sc1.nextInt();
				

		pst1.setInt(1, deul_price);
		pst1.setInt(2, hal_price);
						
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"행 update");
		con1.close();
		System.out.println("접속끝");
		
	}
		
	
	//고객정보 삭제  ok //이름 선택시 모두 삭제
	void deleteCusInfo() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 = //이름 삭제시
				"delete from cusInfoTable " 
						+" where CusName = ?";
				
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("삭제할 고객 이름 : ");
		String del_name=sc1.next();
		
		
		pst1.setString(1, del_name);

		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"행 delete");//update 행 갯수
		con1.close();
		System.out.println("접속끝");
	}
	
	
	//영화정보 삭제 ok
	void deleteMV() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("접속했다고 전해라");
		
		
		String sql2 = //이름 삭제시
				"delete from movieTable " 
						+" where movieName = ?";
				
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("삭제할 영화이름 : ");
		String del_name=sc1.next();
		
		
		pst1.setString(1, del_name);

		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"행 delete");//update 행 갯수
		con1.close();
		System.out.println("접속끝");
	}	
}
