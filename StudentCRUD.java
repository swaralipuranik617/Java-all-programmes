import java.sql.*;

public class StudentCRUD {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String username = "root";
        String password = "swara@123";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                url, username, password
            );

            Statement stmt = con.createStatement();

            System.out.println("Database Connected Successfully");

            // CREATE / INSERT
            String insertQuery =
                "INSERT INTO student_crud VALUES " +
                "(1, 'Swarali', 'CSE', 85)";

            stmt.executeUpdate(insertQuery);

            System.out.println("Student record inserted successfully");

            // READ
            String selectQuery = "SELECT * FROM student_crud";

            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\nStudent Records:");
            System.out.println("--------------------------------");

            while (rs.next()) {

                System.out.println(
                    rs.getInt("roll_no") + " " +
                    rs.getString("name") + " " +
                    rs.getString("course") + " " +
                    rs.getDouble("marks")
                );
            }

            // UPDATE
            String updateQuery =
                "UPDATE student_crud SET marks = 90 WHERE roll_no = 1";

            stmt.executeUpdate(updateQuery);

            System.out.println("\nStudent record updated successfully");

            // DELETE
            String deleteQuery =
                "DELETE FROM student_crud WHERE roll_no = 1";

            stmt.executeUpdate(deleteQuery);

            System.out.println("Student record deleted successfully");

            con.close();

        } catch (Exception e) {

            System.out.println("Database Error: " + e.getMessage());
        }
    }
}