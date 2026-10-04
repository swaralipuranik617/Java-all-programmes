import java.sql.*;

public class StudentRecords {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "swara@123";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM student";

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Student Records");
            System.out.println("-------------------------");

            while (rs.next()) {

                System.out.println(
                    rs.getInt("roll_no") + " " +
                    rs.getString("name") + " " +
                    rs.getString("branch") + " " +
                    rs.getInt("marks")
                );
            }

            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}