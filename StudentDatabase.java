import java.sql.Connection;
import java.sql.DriverManager;

public class StudentDatabase {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String username = "root";
        String password = "swara@123";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                url, username, password
            );

            System.out.println("Student Database Connected Successfully!");

            con.close();

        } catch (Exception e) {

            System.out.println("Student Database Connection Failed!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}