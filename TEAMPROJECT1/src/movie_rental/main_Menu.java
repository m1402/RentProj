package movie_rental;

import java.sql.*;
import java.util.*;

public class main_Menu {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		// Admin Menu
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("┌───── Main Menu ─────┐");
		System.out.println("│  1. 관리자 접속             │");
		System.out.println("│  2. 고객 접속               │");
		System.out.println("│  3. 나가기                  │");
		System.out.println("└─────────────────────┘");
		System.out.println();
		System.out.println("번호를 입력하세요 ☞ ");
		int s1 = sc1.nextInt();
		
		// Menu 이동~~
		if(s1==1){
			
			Admin_Menu();
			//menu();
			
		} else if(s1==2){
			
			Customer_Menu();
			//menu();
			
		} else {
			
			System.out.println("ㅠㅠ");
		
		}
		
	}
	
	public static void Admin_Cus_Menu() throws ClassNotFoundException, SQLException {
		
		// Admin Menu
		Scanner sc1 = new Scanner(System.in);
		System.out.println("┌──────── Admin Menu ─────────┐");
		System.out.println("│  1. 고객정보 조회                       │");
		System.out.println("│  2. 고객정보 추가                       │");
		System.out.println("│  3. 고객정보 수정                       │");
		System.out.println("│  4. 고객정보 삭제                       │");
		System.out.println("│  5. 나가기                              │");
		System.out.println("└─────────────────────────────┘");
		System.out.println();
		System.out.println("번호를 입력하세요 ☞ ");
		int s1 = sc1.nextInt();
		
		adminClass ad1 = new adminClass();		
		
		// Menu 이동~~
		if(s1==1){
					
			System.out.println("조회 START@!!");
			ad1.checkCusInfo();
			//ad1.checkCusInfo();
			//menu();
					
		} else if(s1==2){
					
			System.out.println("추가 START@!!");
			ad1.insertCusInfo();
			//menu();
					
		} else if(s1==3){
					
			System.out.println("수정 START@!!");
			ad1.updateCusInfo();
			//menu();
					
		} else if(s1==4){
					
			System.out.println("삭제 START@!!");
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
		System.out.println("┌───────── Admin Menu ────────┐");
		System.out.println("│  1. 고객 정보관리                       │");
		System.out.println("│  2. 영화 정보관리                       │");
		System.out.println("└─────────────────────────────┘");
		System.out.println();
		System.out.println("번호를 입력하세요 ☞ ");
		int s1 = sc1.nextInt();
		
		adminClass ad1 = new adminClass();
		
		// Menu 이동~~
		if(s1==1){
			
			//System.out.println("조회 START@!!");
			Admin_Cus_Menu();
			//menu();
			
		} else if(s1==2){
			
			//System.out.println("대여 START@!!");
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
		System.out.println("┌──────── Admin Menu ─────────┐");
		System.out.println("│  1. 영화정보 조회                       │");
		System.out.println("│  2. 영화정보 추가                       │");
		System.out.println("│  3. 영화정보 수정                       │");
		System.out.println("│  4. 영화정보 삭제                       │");
		System.out.println("│  5. 나가기                              │");
		System.out.println("└─────────────────────────────┘");
		System.out.println();
		System.out.println("번호를 입력하세요 ☞ ");
		int s1 = sc1.nextInt();
		
		adminClass ad1 = new adminClass();		
		
		// Menu 이동~~
		if(s1==1){
					
			System.out.println("조회 START@!!");
			//ad1.checkCusInfo();
			ad1.checkCusInfo();
			//menu();
					
		} else if(s1==2){
					
			System.out.println("추가 START@!!");
			ad1.insertCusInfo();
			//menu();
					
		} else if(s1==3){
					
			System.out.println("수정 START@!!");
			MV_Update_Menu();
			//ad1.updateCusInfo();
			//menu();
					
		} else if(s1==4){
					
			System.out.println("삭제 START@!!");
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
		System.out.println("┌────── Customer Menu ────────┐");
		System.out.println("│  1. 영화정보 조회                       │");
		System.out.println("│  2. 나가기                              │");
		System.out.println("└─────────────────────────────┘");
		System.out.println();
		System.out.println("번호를 입력하세요 ☞ ");
		int s1 = sc1.nextInt();
		
		adminClass ad1 = new adminClass();
		
		// Menu 이동~~
		if(s1==1){
			
			System.out.println("조회 START@!!");
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
		System.out.println("┌─────── Admin Menu ────────┐");
		System.out.println("│  1. 영화제목 수정                    │");
		System.out.println("│  2. 영화가격 수정                    │");
		System.out.println("│  3. 영화연도 수정                    │");
		System.out.println("└───────────────────────────┘");
		System.out.println();
		System.out.println("번호를 입력하세요 ☞ ");
		int s1 = sc1.nextInt();
		
		adminClass ad1 = new adminClass();
		
		// Menu 이동~~
		if(s1==1){
			
			//System.out.println("조회 START@!!");
			ad1.updateTMV();
			//menu();
			
		} else if(s1==2){
			
			//System.out.println("대여 START@!!");
			ad1.updatePMV();
			//menu();
			
		}else if(s1==3){
			
			//System.out.println("반납 START@!!");
			ad1.updateYMV();
			//menu();
			
		}else{
			
			//exit();
		}
			
		System.out.println();
	}

}