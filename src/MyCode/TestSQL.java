package MyCode;

import java.sql.*;
public class TestSQL{

	public static void connectDB(String dbName, String userName, String pwd) {
		
		try {
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/"+dbName, userName, pwd);
			
			insertUser(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
	
	public static void insertUser(Connection con) {
		PreparedStatement stmt = null;
		try {
			String insertQuery = "INSERT INTO storeuser (UserID, UserName, Pwd, Address, MobileNumber) VALUES (1, \'Minal\', \'Minal\', \'Hari ganga\', 12);";
			stmt = con.prepareStatement(insertQuery);
			stmt.execute();
		} catch (SQLException e) {
			System.out.println("Exception occurred while inserting user." );
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	/*
	 * this is a test class
	 * 
	 * BAAACCAABBBDC
	 * 1B3A2C2A3B1D1C
	 * 4B5A3C1D
	 */
	

	public void encodeStr(String input) {
		
		/*if(input==null)
			return;
		
		char[] str = input.toCharArray();
		int length = str.length;
		char[] newStr1 = new char[2*length];
		int j = 0;
		int charCount = 0;
		boolean charMatched = false;
		for(int i= 0; i< length; i++) {
			j = i;
			if(str[i] == str[i+1] && charMatched ) { 
				j= j -1;
				charCount++;
				newStr1[j++] = (char)charCount;
				charMatched = true;
			}else {
				charMatched = false;
			}
			newStr1[j++] = str[i];
		}*/
	}
}
