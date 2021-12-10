package Tkachenko.Lab31;

import java.sql.*;
import java.util.*;

public class Database {
    private List<Employee> employees;
    private Connection connection;

    public Database() { employees = new LinkedList<Employee>(); }

    public List<Employee> getEmployees() { return Collections.unmodifiableList(employees); }

    private void addEmployee(Employee person) {
        employees.add(person);
    }

    public void connect() throws SQLException {
        if(connection != null) return;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:sqlite:db/stuff.db";
        connection = DriverManager.getConnection(url);
    }

    public void disconnect() {
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void count() throws SQLException {
        String sql = "SELECT count(*) from employee";
        PreparedStatement sqlStmt = connection.prepareStatement(sql);
        ResultSet checkResult = sqlStmt.executeQuery();

        checkResult.next();
        int count = checkResult.getInt(1);

        System.out.println("count for person is " + count + ".");

        sqlStmt.close();
    }

    public void getFromDatabase() {
        employees.clear();

        String sql = "Select * from employee";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet set = stmt.executeQuery();
            while(set.next()) {
                Employee temp = new Employee(set.getString("name"), set.getString("department"), set.getInt("age"), set.getString("phone"), set.getString("position"), set.getString("gender"));

                addEmployee(temp);
            }

            stmt.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void addEmployeeToDatabase(Employee employee) {
        String name = employee.getName();
        int age = employee.getAge();
        String phone = employee.getPhone();
        String gender = employee.getGender().toString();
        String position = employee.getPosition();
        String department = employee.getDepartment();

        String Sql = "INSERT INTO employee (name, department, age, phone, position, gender) VALUES ('"+name+"','"+department+"','"+age+"','"+phone+"','"+position+"','"+gender+")'";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(Sql);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        getFromDatabase();
    }
}
