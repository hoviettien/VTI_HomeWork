package com.vti.frontend;

import com.vti.utils.ScannerUtils;
import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.Employee;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import com.vti.entity.User;
import com.vti.entity.Manager;


public class UserFunction {
    private UserController userController;

    public UserFunction() throws FileNotFoundException, IOException {
        userController = new UserController();
    }

    public void getAllByProjectId() {
        System.out.println("Nhan vien va quan ly theo projectId: ");
        int projectId = ScannerUtils.inputIntPositive();
        try {
            List<User> users = userController.getAllByProjectId(projectId);
            if (users != null && !users.isEmpty()) {
                String leftAlignFormat = "| %-5s | %-20s | %-30s | %-15s | %-12s | %-10s |%n";
                System.out.format(
                        "+-------+----------------------+--------------------------------+-----------------+--------------+------------+%n");
                System.out.format(
                        "| ID    | Full Name            | Email                          | Pro Skill       | Exp In Year  | Role       |%n");
                System.out.format(
                        "+-------+----------------------+--------------------------------+-----------------+--------------+------------+%n");
                for (User user : users) {
                    String proSkill = "";
                    String expInYear = "";
                    if (user instanceof Employee) {
                        proSkill = ((Employee) user).getProSkill();
                    } else if (user instanceof Manager) {
                        expInYear = String.valueOf(((Manager) user).getExpInYear());
                    }
                    System.out.format(leftAlignFormat,
                            user.getId(),
                            user.getFullName(),
                            user.getEmail(),
                            proSkill,
                            expInYear,
                            user.getRole());
                }
                System.out.format(
                        "+-------+----------------------+--------------------------------+-----------------+--------------+------------+%n");
                System.out.println();
            } else {
                System.out.println("Khong co nhan vien hay quan ly nao!");
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
