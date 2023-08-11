
package studentsrecordmanagementsystem;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
public class myconnection {
    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;
public static void Connect()
{
    try{
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","denis");
        stmt=con.createStatement();
       //JOptionPane.showMessageDialog(null,"Connection success");
       /*String sql="create table Admin(username varchar2(10) primary key,Password varchar2(7) not null)";
       stmt.executeQuery(sql);
       JOptionPane.showMessageDialog(null, "Admin Table Created");
       con.close();*/
      
       /*String sql="create table facultySignup(username varchar2(10) primary key,Password varchar2(7) not null)";
       stmt.executeQuery(sql);
       JOptionPane.showMessageDialog(null, "Faculty Signup Table Created");
       con.close();*/
    
      /*String sql="create table Teacher(ID number(5) primary key,Name varchar(40) not null,"
                + "Mobile number(10) unique,Email varchar2(50),"
                + "Password varchar2(7) not null,Branch varchar2(10) not null)";
        stmt.executeQuery(sql);// execute the table 
        JOptionPane.showMessageDialog(null,"Teacher Table created");
        con.close();*/
     /*
          String sql="create table Students_Record(id number(5) primary key,name varchar(40)not null,f_name varchar(40)not null,"
              + "m_name varchar(40) not null,dob varchar2(10)not null,gender varchar(6)not null,address varchar2(60),"
              + "course varchar(13)not null,specialization varchar(10)not null,year number(3)not null,semester varchar(5)not null,"
              + "un_reg_no varchar2(20),un_roll_no varchar2(20),mobile number(10)unique,email varchar2(30))";
//              +"un_reg_no varchar2(20),un_roll_no varhcar2(20),mobile number(10)unique,email varchar2(30))";
      
        stmt.executeQuery(sql);
        JOptionPane.showMessageDialog(null," Student Table created");
        con.close();*/
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Connection Error"+e);
    }
}
}
