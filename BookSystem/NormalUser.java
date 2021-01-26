package BookSystem;

import BookSystem.Operation.*;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        this.name = name;
        this.operation = new IOperation[]{
                new BorrowOperation(),
                new ReturnOperation(),
                new FineOperation(),
                new ExitOperation(),
        };
    }

    @Override
    public int menu() {
        System.out.println("********************************");
        System.out.println("Hello!"+name+"欢迎来到图书馆里系统");
        System.out.println("1.借阅书籍");
        System.out.println("2.归还书籍");
        System.out.println("3.查看书籍信息");
        System.out.println("4.退出系统");
        System.out.println("********************************");
        System.out.println("请输入您的选择：");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        return choice;
    }
}

