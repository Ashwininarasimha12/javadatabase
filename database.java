package database;

import java.sql.Connection;

public class Main {

    public static void main(String[]args) {

    }
    public static Connection getConnection() throws Exception {
        try{
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://24.196.52.166:3306/moviedb";
            String username = "ash";
            String password = "ashw12";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
        } catch(Exception e)(System.out.println(e);)


        return null;
    }
}