package main;

import 
import java.sql.ResultSet;
import java.sql.Statement;

public class MainCoon {
    public static void main(String[] args) {
        
        Coon.connectSQLite();
        String sql = "SELECT * FROM persons";
        try {
            Statement st = Coon.connectSQLite().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("nombres"));
            }
        }catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
