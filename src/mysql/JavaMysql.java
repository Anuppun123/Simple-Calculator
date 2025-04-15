package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JavaMysql {
    public static void main(String[] args){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing_db", "root", "Guleria1");
            PreparedStatement ps = con.prepareStatement("insert into register values('Anup','lucky_anup2046@yahoo.com')");
            ps.executeUpdate();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
