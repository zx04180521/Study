package BookSystem;

import BookSystem.Operation.*;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Admin extends User {
    public Admin(String name) {
        this.name = name;
        this.operation = new IOperation[]{
                new AddOperation(),
                new DeleteOperation(),
                new FineOperation(),
                new DisplayOperation(),
                new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("********************************");
        System.out.println("Hello!"+name+"欢迎来到图书馆里系统");
        System.out.println("1.增加书籍");
        System.out.println("2.删除书籍");
        System.out.println("3.查看书籍信息");
        System.out.println("4.查看书籍列表");
        System.out.println("5.退出系统");
        System.out.println("********************************");
        System.out.println("请输入您的选择：");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        return choice;
    }
}
