import java.sql.*;

public class ProductDetails {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String username = "root";
        String password = "swara@123";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM product";

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Product Details");
            System.out.println("----------------------------------------");
            System.out.println("ID\tName\t\tQuantity\tPrice");
            System.out.println("----------------------------------------");

            while (rs.next()) {

                System.out.println(
                    rs.getInt("product_id") + "\t" +
                    rs.getString("product_name") + "\t\t" +
                    rs.getInt("quantity") + "\t\t" +
                    rs.getDouble("price")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}