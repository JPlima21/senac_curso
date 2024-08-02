package DoisDeAgosto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/atividades";
        String user = "postgres";
        String password = "postgres";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();

            rs = stmt.executeQuery("SELECT * FROM casa");

            while (rs.next()) {
                System.out.println("ID: " + rs.getString("id"));
                System.out.println("Rua: " + rs.getString("rua"));
                System.out.println("Número: " + rs.getString("numero"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}