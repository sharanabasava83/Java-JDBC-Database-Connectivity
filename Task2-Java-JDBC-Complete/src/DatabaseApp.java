import java.sql.*;

public class DatabaseApp {

    // Database details
    static final String URL = "jdbc:mysql://localhost:3306/companydb";
    static final String USER = "root";
    static final String PASSWORD = "Sharanu@5";   // Your real password

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            System.out.println("Connected to Database Successfully!");

            // INSERT
            String insertSql = "INSERT INTO employees(name, department, salary) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
            insertStmt.setString(1, "NewEmployee");
            insertStmt.setString(2, "Development");
            insertStmt.setDouble(3, 55000);
            insertStmt.executeUpdate();
            System.out.println("Employee Inserted Successfully!");

            // SELECT
            String selectSql = "SELECT * FROM employees";
            Statement selectStmt = conn.createStatement();
            ResultSet rs = selectStmt.executeQuery(selectSql);

            System.out.println("\nEmployee Records:");
            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("id") +
                        " | Name: " + rs.getString("name") +
                        " | Dept: " + rs.getString("department") +
                        " | Salary: " + rs.getDouble("salary")
                );
            }

            // UPDATE
            String updateSql = "UPDATE employees SET salary = 70000 WHERE name = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setString(1, "NewEmployee");
            updateStmt.executeUpdate();
            System.out.println("\nEmployee Updated Successfully!");

            // DELETE
            String deleteSql = "DELETE FROM employees WHERE name = ?";
            PreparedStatement deleteStmt = conn.prepareStatement(deleteSql);
            deleteStmt.setString(1, "NewEmployee");
            deleteStmt.executeUpdate();
            System.out.println("Employee Deleted Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
