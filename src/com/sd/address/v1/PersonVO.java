package com.sd.dao.v2;

public class PersonVO {
    private String name;
    private String num;
    private int id;
    private String email;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String toString(){
        return "Name: "+name+ "\tID: "+id +"\tNumber: "+num+"\tEmail: "+email;
    }
}
