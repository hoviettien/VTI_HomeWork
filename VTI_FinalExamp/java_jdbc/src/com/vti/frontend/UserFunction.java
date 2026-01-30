package com.vti.frontend;

import com.vti.utils.ScannerUtils;
import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.Employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import com.vti.entity.Manager;


public class UserFunction {
    private UserController userController;

    public UserFunction() throws FileNotFoundException, IOException{
        userController = new UserController();
    }

    public void getEmployeesByProjectId(){
        System.out.println("Nhan vien theo projectId: ");
        int projectId = ScannerUtils.inputIntPositive();
        try {
            List<Employee> employees = userController.getEmployeesByProjectId(projectId);
            if (employees != null && !employees.isEmpty()) {
                String leftAlignFormat = "| %-5s | %-20s | %-30s | %-15s |%n";
                System.out.format("+-------+----------------------+--------------------------------+-----------------+%n");
                System.out.format("| ID    | Full Name            | Email                          | Pro Skill       |%n");
                System.out.format("+-------+----------------------+--------------------------------+-----------------+%n");
                for (Employee employee : employees) {
                    System.out.format(leftAlignFormat, 
                        employee.getId(), 
                        employee.getFullName(), 
                        employee.getEmail(), 
                        employee.getProSkill());
                }
                System.out.format("+-------+----------------------+--------------------------------+-----------------+%n");
                System.out.println();
            } else {
                System.out.println("Khong co nhan vien nao!");
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllManagers(){
        try {
            List<Manager> managers = userController.getAllManagers();
            if (managers != null && !managers.isEmpty()) {
                String leftAlignFormat = "| %-5s | %-20s | %-30s | %-15s |%n";
                System.out.format("+-------+----------------------+--------------------------------+-----------------+%n");
                System.out.format("| ID    | Full Name            | Email                          | Pro Skill       |%n");
                System.out.format("+-------+----------------------+--------------------------------+-----------------+%n");
                for (Manager manager : managers) {
                    System.out.format(leftAlignFormat, 
                        manager.getId(), 
                        manager.getFullName(), 
                        manager.getEmail(), 
                        manager.getExpInYear());
                }
                System.out.format("+-------+----------------------+--------------------------------+-----------------+%n");
                System.out.println();
            } else {
                System.out.println("Khong co quan ly nao!");
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void login(){
        System.out.println("Nhap email: ");
        String email = ScannerUtils.inputString();
        System.out.println("Nhap password: ");
        String password = ScannerUtils.inputString();
        try {
            boolean isLogin = userController.login(email, password);
            if (isLogin) {
                System.out.println();
                System.out.println("Login thanh cong!");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Login that bai! Vui long kiem tra lai email va password.");
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
