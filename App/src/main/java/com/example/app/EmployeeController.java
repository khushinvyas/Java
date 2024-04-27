package com.example.app;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.*;

public class EmployeeController {

    @FXML
    private TextField employeeIDField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField ageField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField departmentField;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/assignment_8_10";
    private static final String USER = "root";
    private static final String PASS = "password";

    @FXML
    private void createEmployeeTable() {
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement statement = con.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id INT PRIMARY KEY," +
                    "name VARCHAR(100) NOT NULL," +
                    "age INT NOT NULL," +
                    "email VARCHAR(100) NOT NULL," +
                    "department VARCHAR(100) NOT NULL" +
                    ")";
            statement.executeUpdate(sql);
            showAlert("Employee table created!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void deleteEmployeeTable() {
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement statement = con.createStatement()) {
            String sql = "DROP TABLE IF EXISTS employees";
            statement.executeUpdate(sql);
            showAlert("Employee table deleted!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void registerEmployee() {
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement statement = con.prepareStatement(
                     "INSERT INTO employees (id, name, age, email, department) VALUES (?, ?, ?, ?, ?)")) {

            statement.setInt(1, Integer.parseInt(employeeIDField.getText()));
            statement.setString(2, nameField.getText());
            statement.setInt(3, Integer.parseInt(ageField.getText()));
            statement.setString(4, emailField.getText());
            statement.setString(5, departmentField.getText());

            statement.executeUpdate();
            showAlert("Employee registered successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void viewEmployees() {
        StringBuilder employees = new StringBuilder();
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement statement = con.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM employees")) {
            while (rs.next()) {
                employees.append("ID: ").append(rs.getInt("id"))
                        .append(", Name: ").append(rs.getString("name"))
                        .append(", Age: ").append(rs.getInt("age"))
                        .append(", Email: ").append(rs.getString("email"))
                        .append(", Department: ").append(rs.getString("department"))
                        .append("\n");
            }
            showAlert(employees.toString());
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert("Failed to fetch employees.");
        }
    }

    @FXML
    private void updateEmployeeInfo() {
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = con.prepareStatement(
                     "UPDATE employees SET name = ?, age = ?, email = ?, department = ? WHERE id = ?")) {
            stmt.setString(1, nameField.getText());
            stmt.setInt(2, Integer.parseInt(ageField.getText()));
            stmt.setString(3, emailField.getText());
            stmt.setString(4, departmentField.getText());
            stmt.setInt(5, Integer.parseInt(employeeIDField.getText()));

            int updated = stmt.executeUpdate();
            if (updated > 0) {
                showAlert("Employee updated successfully.");
            } else {
                showAlert("No employee found with ID: " + employeeIDField.getText());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            showAlert("Failed to update employee.");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(message);
        alert.show();
    }
}
