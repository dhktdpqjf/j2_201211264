package com.sd.dao.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PersonDAOImpl implements PersonDAO {
    Connection conn=ConnectionFactory.getConnection();
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    boolean check;
    
    public boolean checkId(int id){
      try {        
        pstmt = conn.prepareStatement("SELECT * FROM addressbook WHERE id = ?");
        pstmt.setInt(1, id);
        rs = pstmt.executeQuery();
        if(rs.next()) //id가 있으면 true
          check = true;
        else
          check = false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }
    
    public void insert(PersonVO person) {
        try {
            pstmt = conn.prepareStatement("INSERT INTO addressbook(name,num,id,email) VALUES(?,?,?,?)");
            pstmt.setString(1, person.getName());
            pstmt.setString(2, person.getNum());
            pstmt.setInt(3, person.getId());
            pstmt.setString(4, person.getEmail());
            System.out.println("* inserting... \n"+person.toString());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public List<PersonVO> findAll() {
        Statement stmt=null;
        List<PersonVO> persons = new ArrayList<PersonVO>();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM addressbook");
            PersonVO person = null;            
            while(rs.next()){
                person = new PersonVO();              
                person.setName(rs.getString("name"));
                person.setNum(rs.getString("num"));
                person.setId(rs.getInt("id"));
                person.setEmail(rs.getString("email"));
                persons.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null) stmt.close();
            } catch (Exception e) {};
        }
        return persons;
    }
    
    public PersonVO findById(int id) {
        PersonVO person=null;
        try {
            pstmt = conn.prepareStatement("SELECT * FROM addressbook WHERE id=?");
            pstmt.setInt(1, id);
            System.out.println("--------------------학번 "+id+" 검색------------------------");
            rs = pstmt.executeQuery();
            if(rs.next()) {
                person = new PersonVO();
                person.setName(rs.getString("name"));
                person.setNum(rs.getString("num"));
                person.setId(rs.getInt("id"));
                person.setEmail(rs.getString("email"));            
            }else{
              System.out.println("찾을 수 없음");
            }
           
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return person;
    }
    
    public void update(PersonVO person) {
        try {
            
            pstmt = conn.prepareStatement("UPDATE addressbook SET name=?,num=?,email=? WHERE id=?");             
            pstmt.setString(1, person.getName());
            pstmt.setString(2, person.getNum());
            pstmt.setString(3, person.getEmail());
            pstmt.setInt(4, person.getId());            
            int row = pstmt.executeUpdate();
            if(row == 0)
              System.out.println("Id가 더이상 존재하지않습니다.");
            else
              System.out.println("수정되었습니다.");
        } catch (SQLException e) {
            System.out.println("SQLException error");
        } catch (Exception e){
            System.out.println("Exception error");
        }
    }
    
    public void delete(int id) {
        try {
            pstmt = conn.prepareStatement("DELETE FROM addressbook WHERE id=?");
            pstmt.setInt(1, id);
            int rows=pstmt.executeUpdate();
            if (rows == 0) {  
              System.out.println("Id "+id+" 가 존재하지않습니다.");
            } else if (rows > 0) {  
              System.out.println("삭제 되었습니다.");
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    
    public void close() {
        System.out.println("* closing all...");
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (Exception e) {
     e.printStackTrace();
        }
    }
}
