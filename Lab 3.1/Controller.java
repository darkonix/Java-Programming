package Tkachenko.Lab31;

import java.sql.SQLException;
import java.util.List;

public class Controller {
    Database db = new Database();

    public Controller() {
        try {
            db.connect();
            db.getFromDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addEmployee(Employee employee) {
        db.addEmployeeToDatabase(employee);
    }

    public List<Employee> getEmployee() { return db.getEmployees(); }
}
