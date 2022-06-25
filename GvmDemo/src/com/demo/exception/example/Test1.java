package com.demo.exception.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException,SQLException {
File  f1=new File("E:\\mahiqqqq.txt");
FileInputStream f=new FileInputStream(f1);
System.out.println("File Found");

Class.forName("com.mysql.jdbc.Driver");
Connection connection=DriverManager.getConnection("");
	}

}
