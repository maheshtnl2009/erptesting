package com.ERPAnalysts.pages;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrclConn {
	
	public  void  dbquery(String num,String var1,String var2) throws  ClassNotFoundException, SQLException {                                                  
        //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"        
        String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";                   

        //Database Username     
        String username = "HR";   
        
        //Database Password     
        String password = "HR";        
        String data1=num;
        String data2=var1;
        String data3=var2;

        //Query to Execute      
        String query = "insert into ERPDATA values("+data1+",'"+data2+"','"+data3+"')";  
         
        //Load mysql jdbc driver        
        Class.forName("oracle.jdbc.driver.OracleDriver");         
    
        //Create Connection to DB       
        Connection con = DriverManager.getConnection(dbUrl,username,password);
   
        //Create Statement Object       
       Statement stmt = con.createStatement();                  

        // Execute the SQL Query. Store results in ResultSet        
        stmt.executeUpdate(query);                         
  
        // While Loop to iterate through all data and print results     
        //while (rs.next()){
          //          String myName = rs.getString(1);                                        
            //        String myAge = rs.getString(2);  
              //      System.out.println("id number name ");
                //    System. out.println(myName+"  "+myAge);     
          //  }       
         // closing DB Connection       
        con.close();            

	}
}	