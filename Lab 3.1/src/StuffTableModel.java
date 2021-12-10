package Tkachenko.Lab31;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class StuffTableModel extends AbstractTableModel {
    private List<Employee> db;

    private String[] colsName = {"Name", "Department", "Age", "Phone", "Position", "Gender"};

    public void setData(List<Employee> db) { this.db = db; }

    @Override
    public String getColumnName(int i) { return colsName[i]; }

    @Override
    public int getRowCount() { return db.size(); }

    @Override
    public int getColumnCount() { return 6; }

    @Override
    public Object getValueAt(int row, int column) {
        Employee emp = db.get(row);

        switch (column) {
            case 0:
                return emp.getName();
            case 1:
                return emp.getDepartment();
            case 2:
                return emp.getAge();
            case 3:
                return emp.getPhone();
            case 4:
                return emp.getPosition();
            case 5:
                return emp.getGender();
        }

        return null;
    }
}
