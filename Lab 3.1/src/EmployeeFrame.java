package Tkachenko.Lab31;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeFrame extends JFrame {
    private Controller controller;
    private JButton addButton;

    public EmployeeFrame() {
        super("Staff Manager");

        controller = new Controller();
        setLayout(new BorderLayout());

        EmployeeAddForm employeeAddForm = new EmployeeAddForm();

        TableForm tableForm = new TableForm();
        tableForm.setData(controller.getEmployee());

        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employeeAddForm.addDataToDB();
                //controller.updateEmployees();
                tableForm.setData(controller.getEmployee());
                tableForm.refresh();
            }
        });

        add(employeeAddForm.getEmployeeAddPanel(), BorderLayout.WEST);
        add(tableForm.getTablePanel(), BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
