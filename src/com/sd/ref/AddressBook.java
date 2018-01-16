package com.sd.address.ref;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.sql.*; 

public class AddressBook extends JFrame implements TextListener,ItemListener,ActionListener{

    

JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;    

TextField firstnamet,lastnamet,mobilet,emailt;    

TextArea addresst;     

JButton addcontact;    

JCheckBox malet,femalet;    

JComboBox relationt;

JComboBox monthcb,daycb,yearcb;

String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

String yearsdob[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014"};    

String relation[] = {"Son","Daughter","Mother","Father","Cousin","Brother","Sister","Niece","Friend","GirlFriend","Uncle","Aunt"};

String firstname,lastname,address,mobile,email,month,year,day,finaldob,sex,relative;

 Connection con;

 Statement st;

 ButtonGroup bg;

 Font textfont = new Font( "Serif", Font.ITALIC+Font.BOLD,40 );

 

public AddressBook() {

    super("Address Book");

    JTabbedPane tabbedpane = new JTabbedPane();    

    
    JPanel newcontact = new JPanel();

    newcontact.setLayout(new FlowLayout());

    tabbedpane.addTab("New Contact",null,newcontact," Click To Add New Contact "); 

    

    l1 = new JLabel(" First Name ");

    newcontact.add(l1);

    firstnamet = new TextField(10);

    newcontact.add(firstnamet);

    l1.setLabelFor(firstnamet);

    

    l2 = new JLabel(" Last Name ");

    newcontact.add(l2);

    lastnamet = new TextField(10);

    newcontact.add(lastnamet);

    l2.setLabelFor(lastnamet);

    

    l3 = new JLabel(" Date Of Birth ");

    newcontact.add(l3);

    

    daycb = new JComboBox(days);

    daycb.setSelectedItem(days[0]);

    newcontact.add(daycb);

    monthcb = new JComboBox(months);

    monthcb.setSelectedItem(months[0]);

    newcontact.add(monthcb);

    yearcb = new JComboBox(yearsdob);

    yearcb.setSelectedItem(yearsdob[0]);

    newcontact.add(yearcb);

    

    l8 =  new JLabel("Sex");

    newcontact.add(l8);

    malet = new JCheckBox("Male");

    newcontact.add(malet);

    femalet = new JCheckBox("Female");

    newcontact.add(femalet);

    

    l4 = new JLabel("Relation");

    newcontact.add(l4);

    relationt = new JComboBox(relation);

    relationt.setSelectedItem(relation[0]);

    newcontact.add(relationt);

    

    l5 = new JLabel(" Address Of Contact");

    newcontact.add(l5);

    addresst = new TextArea(2,15);

    newcontact.add(addresst);    

        

    l6 = new JLabel("Mobile Number");

    newcontact.add(l6);

    mobilet = new TextField(10);

    newcontact.add(mobilet);

    

    l7 = new JLabel(" E-mail ");

    newcontact.add(l7);

    emailt = new TextField(15);

    newcontact.add(emailt);

    

    addcontact = new JButton("Add Contact");

    newcontact.add(addcontact);

    

    l9 = new JLabel("Programmed By Mayank Sharma");

    l9.setFont(textfont);

    newcontact.add(l9);

    

    l10 = new JLabel("Thanx To Dharmendra Sir");

    l10.setFont(textfont);

    newcontact.add(l10);

    

    bg = new ButtonGroup();

    bg.add(malet);

    bg.add(femalet);

    

    monthcb.addItemListener(this);

    daycb.addItemListener(this);

    yearcb.addItemListener(this);

    relationt.addItemListener(this);

    

    malet.addItemListener(this);

    femalet.addItemListener(this);

    

    firstnamet.addTextListener(this);

    lastnamet.addTextListener(this);

    mobilet.addTextListener(this);

    emailt.addTextListener(this);

    addresst.addTextListener(this);

    

    addcontact.addActionListener(this);

    

     try{

 

              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

              con = DriverManager.getConnection("jdbc:odbc:d1");

 

             }catch(Exception e){}

 

        WindowListener wl = new WindowAdapter()

            {

            public void windowClosing(WindowEvent w)

                {

                int dia=JOptionPane.showConfirmDialog(null,"Are you sure want to Exit ?","Car Detail", JOptionPane.YES_NO_OPTION);

 

                if(dia==JOptionPane.YES_OPTION)

                    {

                        try

                            {

                            con.close();

 

                            dispose();

                    } 

                    catch(Exception e2) {}

            }

            else

                {

                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

                }

        } };

        addWindowListener(wl);    

    

    add(tabbedpane);

        

    }

    


public void actionPerformed(ActionEvent ae){

    if (ae.getSource() == addcontact){
      
        try {

               st = con.createStatement();

                  int i = st.executeUpdate("insert into AddBook values('"+firstname+"','"
                                             +lastname+"','"+finaldob+"','"+sex+"','"+relative+"','"
                                             +address+"','"+mobile+"','"+email+"')");

                   int dia1=JOptionPane.showConfirmDialog(null,"Enter new Contacts","Option", 
                                                          JOptionPane.YES_NO_OPTION);

 

                if(dia1==JOptionPane.YES_OPTION)

                {

                try {

                        setVisible(false);

                        AddressBook ob = new AddressBook();    

                        ob.setVisible(true);

                        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        ob.setSize(650,300);

                        ob.setLocation(250,250);    

                        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

                    

                    }catch(Exception e2) {}

                }else{

                System.exit(0);

                }

               }catch(Exception e){

                      System.out.println(""+e);

                 }    

            

        }    

    }  



    public static void main(String args[]){

            
        AddressBook ob = new AddressBook();    

        ob.setVisible(true);

        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ob.setSize(650,300);

        ob.setLocation(250,250);

        }
    

}

