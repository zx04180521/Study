package BookSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = login();
        BookList bookList = new BookList();
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }

    private static User login() {
        System.out.println("请输入您的姓名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入您的身份：\n1代表管理员\n2代表普通用户");
        int choice = sc.nextInt();
        if (choice == 1) {
            return new Admin(name);
        }
        return new NormalUser(name);
    }
}
