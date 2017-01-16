package movie_rental;

import java.sql.*;
import java.util.*;

public class main_Menu {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		// Admin Menu
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("������������ Main Menu ������������");
		System.out.println("��  1. ������ ����             ��");
		System.out.println("��  2. �� ����               ��");
		System.out.println("��  3. ������                  ��");
		System.out.println("����������������������������������������������");
		System.out.println();
		System.out.println("��ȣ�� �Է��ϼ��� �� ");
		int s1 = sc1.nextInt();
		
		// Menu �̵�~~
		if(s1==1){
			
			Admin_Menu();
			//menu();
			
		} else if(s1==2){
			
			Customer_Menu();
			//menu();
			
		} else {
			
			System.out.println("�Ф�");
		
		}
		
	}
	
	public static void Admin_Cus_Menu() throws ClassNotFoundException, SQLException {
		
		// Admin Menu
		Scanner sc1 = new Scanner(System.in);
		System.out.println("������������������ Admin Menu ��������������������");
		System.out.println("��  1. ������ ��ȸ                       ��");
		System.out.println("��  2. ������ �߰�                       ��");
		System.out.println("��  3. ������ ����                       ��");
		System.out.println("��  4. ������ ����                       ��");
		System.out.println("��  5. ������                              ��");
		System.out.println("��������������������������������������������������������������");
		System.out.println();
		System.out.println("��ȣ�� �Է��ϼ��� �� ");
		int s1 = sc1.nextInt();
		
		adminClass ad1 = new adminClass();		
		
		// Menu �̵�~~
		if(s1==1){
					
			System.out.println("��ȸ START@!!");
			ad1.checkCusInfo();
			//ad1.checkCusInfo();
			//menu();
					
		} else if(s1==2){
					
			System.out.println("�߰� START@!!");
			ad1.insertCusInfo();
			//menu();
					
		} else if(s1==3){
					
			System.out.println("���� START@!!");
			ad1.updateCusInfo();
			//menu();
					
		} else if(s1==4){
					
			System.out.println("���� START@!!");
			ad1.deleteCusInfo();
			//menu();
					
		} else {
					
			//exit();
					
		}
					
		System.out.println();		
		
	}
	
	public static void Admin_Menu() throws ClassNotFoundException, SQLException {
		
		// Customer Menu
		Scanner sc1 = new Scanner(System.in);
		System.out.println("�������������������� Admin Menu ������������������");
		System.out.println("��  1. �� ��������                       ��");
		System.out.println("��  2. ��ȭ ��������                       ��");
		System.out.println("��������������������������������������������������������������");
		System.out.println();
		System.out.println("��ȣ�� �Է��ϼ��� �� ");
		int s1 = sc1.nextInt();
		
		adminClass ad1 = new adminClass();
		
		// Menu �̵�~~
		if(s1==1){
			
			//System.out.println("��ȸ START@!!");
			Admin_Cus_Menu();
			//menu();
			
		} else if(s1==2){
			
			//System.out.println("�뿩 START@!!");
			Admin_MV_Menu();
			//menu();
			
		} else{
			
			//exit();
		}
			
		System.out.println();
	}
	
	public static void Admin_MV_Menu() throws ClassNotFoundException, SQLException {
		
		// Admin Menu
		Scanner sc1 = new Scanner(System.in);
		System.out.println("������������������ Admin Menu ��������������������");
		System.out.println("��  1. ��ȭ���� ��ȸ                       ��");
		System.out.println("��  2. ��ȭ���� �߰�                       ��");
		System.out.println("��  3. ��ȭ���� ����                       ��");
		System.out.println("��  4. ��ȭ���� ����                       ��");
		System.out.println("��  5. ������                              ��");
		System.out.println("��������������������������������������������������������������");
		System.out.println();
		System.out.println("��ȣ�� �Է��ϼ��� �� ");
		int s1 = sc1.nextInt();
		
		adminClass ad1 = new adminClass();		
		
		// Menu �̵�~~
		if(s1==1){
					
			System.out.println("��ȸ START@!!");
			//ad1.checkCusInfo();
			ad1.checkCusInfo();
			//menu();
					
		} else if(s1==2){
					
			System.out.println("�߰� START@!!");
			ad1.insertCusInfo();
			//menu();
					
		} else if(s1==3){
					
			System.out.println("���� START@!!");
			MV_Update_Menu();
			//ad1.updateCusInfo();
			//menu();
					
		} else if(s1==4){
					
			System.out.println("���� START@!!");
			ad1.deleteCusInfo();
			//menu();
					
		} else {
					
			//exit();
					
		}
					
		System.out.println();		
		
	}
	
	
	
	public static void Customer_Menu() throws ClassNotFoundException, SQLException {
		
		// Customer Menu
		Scanner sc1 = new Scanner(System.in);
		System.out.println("�������������� Customer Menu ������������������");
		System.out.println("��  1. ��ȭ���� ��ȸ                       ��");
		System.out.println("��  2. ������                              ��");
		System.out.println("��������������������������������������������������������������");
		System.out.println();
		System.out.println("��ȣ�� �Է��ϼ��� �� ");
		int s1 = sc1.nextInt();
		
		adminClass ad1 = new adminClass();
		
		// Menu �̵�~~
		if(s1==1){
			
			System.out.println("��ȸ START@!!");
			ad1.checkMV();
			//menu();
			
		} else{
			
			//exit();
			
		}
			
		System.out.println();
	}

	
	public static void MV_Update_Menu() throws ClassNotFoundException, SQLException {
		
		// Customer Menu
		Scanner sc1 = new Scanner(System.in);
		System.out.println("���������������� Admin Menu ������������������");
		System.out.println("��  1. ��ȭ���� ����                    ��");
		System.out.println("��  2. ��ȭ���� ����                    ��");
		System.out.println("��  3. ��ȭ���� ����                    ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();
		System.out.println("��ȣ�� �Է��ϼ��� �� ");
		int s1 = sc1.nextInt();
		
		adminClass ad1 = new adminClass();
		
		// Menu �̵�~~
		if(s1==1){
			
			//System.out.println("��ȸ START@!!");
			ad1.updateTMV();
			//menu();
			
		} else if(s1==2){
			
			//System.out.println("�뿩 START@!!");
			ad1.updatePMV();
			//menu();
			
		}else if(s1==3){
			
			//System.out.println("�ݳ� START@!!");
			ad1.updateYMV();
			//menu();
			
		}else{
			
			//exit();
		}
			
		System.out.println();
	}

}