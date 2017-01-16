package movie_rental;

import java.sql.*;
import java.util.*;


public class adminClass {
	
	//������ ��ȸ ok
	void checkCusInfo() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 = //�����ڿ���ȸ
				" select CusNum ��ID, CusName �̸�,"
				+ " MovieNum ��ȭ����, CusTel ����ó"
				+ " from cusInfoTable"
				+ " order by 1";
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		ResultSet rs = pst1.executeQuery();
		
		while(rs.next()){
			int cusID=rs.getInt("��ID");
			String cusName=rs.getString("�̸�");
			int mvNum=rs.getInt("��ȭ����");
			String cusTel=rs.getString("����ó");
			System.out.println
			(rs.getRow()+"\t"+cusID+"\t"+cusName+"\t"+mvNum+"\t"+cusTel);
		}
		
		//int rowcnt1 = pst1.executeQuery();
		//System.out.println(rowcnt1+"�� delete");//update �� ����
		con1.close();
		System.out.println("���ӳ�");
		
	}
	
	
	//��ȭ���� ��ȸ ok
	void checkMV() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 = //�����ڿ���ȸ
				" select MovieNum ��ȭ����, MovieName ��ȭ�̸�,"
				+ " MoviePrice ��ȭ����, MovieDate ��ÿ���"
				+ " from movieTable"
				+ " order by 1";
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		ResultSet rs = pst1.executeQuery();
		
		while(rs.next()){
			int mvNum=rs.getInt("��ȭ����");
			String mvTitle=rs.getString("��ȭ�̸�");
			int mvPrice=rs.getInt("��ȭ����");
			int mvDate=rs.getInt("��ÿ���");
			System.out.println
			(rs.getRow()+"\t"+mvNum+"\t"+mvTitle+"\t"+mvPrice+"\t"+mvDate);
		}
		
		//int rowcnt1 = pst1.executeQuery();
		//System.out.println(rowcnt1+"�� delete");//update �� ����
		con1.close();
		System.out.println("���ӳ�");
		
	}
	
	
	// ������ �߰� ok
	void insertCusInfo() throws ClassNotFoundException, SQLException {
	
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 =
				"insert into cusInfoTable values (?,?,?,?)";
		
		PreparedStatement pst1 = con1.prepareStatement(sql2);
		
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("�� ID : ");
		int cusID=sc1.nextInt();	
		
		System.out.println("�� �̸� : ");
		String cusName=sc1.nextLine();
		
		System.out.println("��ȭ���� : ");
		int mvNum=sc1.nextInt();

		System.out.println("����ó : ");
		String cusTel=sc1.nextLine();
		
		pst1.setInt(1, cusID);
		pst1.setString(2, cusName);
		pst1.setInt(3, mvNum);
		pst1.setString(4, cusTel);
		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"�� insert");
		con1.close();
		System.out.println("���ӳ�");
		
	}

	
	// ��ȭ���� �߰� ok
	void insertMV() throws ClassNotFoundException, SQLException {
	
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 =
				"insert into movieTable values(?,?,?,?)";
		
		PreparedStatement pst1 = con1.prepareStatement(sql2);
		
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("��ȭ���� : ");
		int mvNum=sc1.nextInt();	
		
		System.out.println("��ȭ���� : ");
		String mvTitle=sc1.nextLine();
		
		System.out.println("�뿩���� : ");
		int mvPrice=sc1.nextInt();

		System.out.println("����: ");
		int mvDate=sc1.nextInt();
		
		pst1.setInt(1, mvNum);
		pst1.setString(2, mvTitle);
		pst1.setInt(3, mvPrice);
		pst1.setInt(4, mvDate);
		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"�� insert");
		con1.close();
		System.out.println("���ӳ�");
		
	}
	
	
	//������ ���� ok //�̸� ����
	void updateCusInfo() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 = // �����
				" update cusInfoTable "
				+" set CusName = ? " 
				+" where CusName = ? ";
				
				PreparedStatement pst1 =
						con1.prepareStatement(sql2);
				
				Scanner sc1=new Scanner(System.in);
				
				System.out.println("���� �� ���̸� : ");
				String hal_name=sc1.next();
				
				System.out.println("���� �� ���̸� : ");
				String deul_name=sc1.next();
				
				pst1.setString(1, deul_name);
				pst1.setString(2, hal_name);
				
				int rowcnt1 = pst1.executeUpdate();
				System.out.println(rowcnt1+"�� update");
				con1.close();
				System.out.println("���ӳ�");
	}
		
	
	// ��ȭ���� ����ok //�̸� ����
	void updateTMV() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 = // �����
				" update movieTable "
				+" set MovieName = ? " 
				+" where MovieName = ? ";
				
	
		PreparedStatement pst1 =
			con1.prepareStatement(sql2);
				
		Scanner sc1=new Scanner(System.in);
				
		System.out.println("���� �� ��ȭ����: ");
		String hal_name=sc1.nextLine();
				
		System.out.println("���� �� ��ȭ����: ");
		String deul_name=sc1.nextLine();
				
				
		pst1.setString(1, deul_name);
		pst1.setString(2, hal_name);
				
		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"�� update");
		con1.close();
		System.out.println("���ӳ�");
		
	}
	
	// ��ȭ���� ����ok //���� ����
	void updateYMV() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 = // �����
				" update movieTable "
				+" set MovieDate = ? " 
				+" where MovieDate = ? ";
				
	
		PreparedStatement pst1 =
			con1.prepareStatement(sql2);
				
		Scanner sc1=new Scanner(System.in);
				
		System.out.println("���� �� ��ȭ����: ");
		int hal_date=sc1.nextInt();
				
		System.out.println("���� �� ��ȭ����: ");
		int deul_date=sc1.nextInt();
				
				
		pst1.setInt(1, deul_date);
		pst1.setInt(2, hal_date);
				
		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"�� update");
		con1.close();
		System.out.println("���ӳ�");
		
	}
	
	// ��ȭ���� ����ok //���� ����
	void updatePMV() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 = // �����
				" update movieTable "
				+" set MoviePrice = ? " 
				+" where MoviePrice = ? ";
				
		PreparedStatement pst1 =
			con1.prepareStatement(sql2);
				
		Scanner sc1=new Scanner(System.in);
				
		System.out.println("���� �� ��ȭ����: ");
		int hal_price=sc1.nextInt();
				
		System.out.println("���� �� ��ȭ����: ");
		int deul_price=sc1.nextInt();
				

		pst1.setInt(1, deul_price);
		pst1.setInt(2, hal_price);
						
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"�� update");
		con1.close();
		System.out.println("���ӳ�");
		
	}
		
	
	//������ ����  ok //�̸� ���ý� ��� ����
	void deleteCusInfo() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 = //�̸� ������
				"delete from cusInfoTable " 
						+" where CusName = ?";
				
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("������ �� �̸� : ");
		String del_name=sc1.next();
		
		
		pst1.setString(1, del_name);

		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"�� delete");//update �� ����
		con1.close();
		System.out.println("���ӳ�");
	}
	
	
	//��ȭ���� ���� ok
	void deleteMV() throws ClassNotFoundException, SQLException {
		
		Connection con1=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection
				("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr","hr");
		
		System.out.println("�����ߴٰ� ���ض�");
		
		
		String sql2 = //�̸� ������
				"delete from movieTable " 
						+" where movieName = ?";
				
		
		PreparedStatement pst1 =
				con1.prepareStatement(sql2);
		
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("������ ��ȭ�̸� : ");
		String del_name=sc1.next();
		
		
		pst1.setString(1, del_name);

		
		int rowcnt1 = pst1.executeUpdate();
		System.out.println(rowcnt1+"�� delete");//update �� ����
		con1.close();
		System.out.println("���ӳ�");
	}	
}
