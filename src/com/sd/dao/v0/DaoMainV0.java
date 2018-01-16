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
      conn = DriverManager.getConnection(prop.getProperty("URL")+"?useSSL=true",//mysql.properties�� �ִ� �� ������ ��. �빮�ڸ� �빮�� �ҹ��ڸ� �ҹ��ڷ�
                                           prop.getProperty("USER"),
                                           prop.getProperty("PASSWORD")
                                           );
      //String mySql = "CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
      //mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      //conn.createStatement().execute(mySql);
      
      mySql = "INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')";
      stmt = conn.createStatement();//stmt�� ���⼭ ���� ������ �ؿ��� execute�� �� ����.
      stmt.execute(mySql);
      //conn.createStatement().execute(mySql); //�Ǵ� �ٷ� ����� �ٷ� execute 
      mySql = "INSERT INTO persons(name,address) VALUES('v0-2','2 Hongji Dong')";
      conn.createStatement().execute(mySql);
      mySql = "DELETE FROM persons WHERE id=3 LIMIT 1";
      conn.createStatement().execute(mySql);
      
      stmt.execute(mySql);
      rs=stmt.executeQuery("SELECT name FROM persons WHERE id < 4 ORDER BY id");
      while (rs.next()) { 
         System.out.println(rs.getString("name"));//getString�Լ��� ��Ʈ�� ��Ʈ������ ���ڸ� �� �� �ִ� �� ������ ����.
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

      