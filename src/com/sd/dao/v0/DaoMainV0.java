package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;

public class DaoMainV0{
  public static void main(String[] args) {
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs = null;
    String mySql;
    
    try{
      String path = System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      //static Connection getConnection(String url, String user, String password)
      //conn=DriverManager.getconnection("jdbc:mysql://localhost/test","root","1111");
      conn = DriverManager.getConnection(prop.getProperty("URL")+"?useSSL=true",//mysql.properties에 있는 것 가지고 옴. 대문자면 대문자 소문자면 소문자로
                                           prop.getProperty("USER"),
                                           prop.getProperty("PASSWORD")
                                           );
      //String mySql = "CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
      //mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      //conn.createStatement().execute(mySql);
      
      mySql = "INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')";
      stmt = conn.createStatement();//stmt를 여기서 만든 다음에 밑에서 execute할 수 있음.
      stmt.execute(mySql);
      //conn.createStatement().execute(mySql); //또는 바로 만들고 바로 execute 
      mySql = "INSERT INTO persons(name,address) VALUES('v0-2','2 Hongji Dong')";
      conn.createStatement().execute(mySql);
      mySql = "DELETE FROM persons WHERE id=3 LIMIT 1";
      conn.createStatement().execute(mySql);
      
      stmt.execute(mySql);
      rs=stmt.executeQuery("SELECT name FROM persons WHERE id < 4 ORDER BY id");
      while (rs.next()) { 
         System.out.println(rs.getString("name"));//getString함수는 인트나 스트링으로 인자를 줄 수 있는 두 가지가 있음.
      }
    }catch(Exception e){
      e.printStackTrace();
    } finally {
      //rs.close();
      //stmt.close();
      //conn.close();
      try{
       if(stmt != null) stmt.close();            
     }catch (Exception e) {};
      try {                
         if (conn != null) conn.close();
      } catch (Exception e) {};
    }
  }
}

      