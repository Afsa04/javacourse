package com.tnsif.jdbcpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Preparestatementdemo {
public static void main(String[] args) {
		
		 
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","afsa@1234@");
			
 			
			Statement st=conn.createStatement();
			
			 
			String strselect="select booktitle,bookprize,qty from book";
			
			System.out.println("the sql stament is"+strselect);
			
			 
			ResultSet rst=st.executeQuery(strselect);
			System.out.println("the records are");
			
			int rowcout=0;
			while(rst.next()) {
				String booktitle=rst.getString("booktitle");
				int bookprize=rst.getInt("bookprize");
				int qty=rst.getInt("qty");
				
				System.out.println(booktitle+" "+bookprize+" "+qty);
				++rowcout;
			}
			}
		 catch (SQLException e) {
 			e.printStackTrace();
		}
		
	}
}