package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            Connection conn=DriverManager.getConnection("jdbc:sqlite:testDBDB.db");
            Statement statement =conn.createStatement();
            conn.setAutoCommit(false);
//            statement.execute("Create table if not exists contacts (name Text,phone integer,email text)");
//            statement.execute("INSERT INTO contacts (name,phone,email) VALUES ('Max',664252,'max@microsoft.com')");
//            statement.execute("UPDATE contacts set phone=999999 WHERE name='Jane'");
//            statement.execute("SELECT * FROM contacts");
//            ResultSet results=statement.getResultSet();
            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
            System.out.println("Name Phone Email");
            while (results.next()){
                System.out.println(results.getString("name")+" "
                        +results.getString("phone")+" "+
                        results.getString("email"));
            }

            conn.commit();
            statement.close();
            conn.close();
        }
        catch (SQLException e){
            System.out.println("Something went wrong ->"+e.getMessage());
        }
    }
}
