package BookSystem.Operation;

import BookSystem.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("借阅书籍");
        System.out.println("请输入您要借阅书籍的名字：");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int i=0;
        for(;i<bookList.getSize();i++){
            if(name.equals(bookList.getBook(i).getName()))
                break;
        }
        if(i==bookList.getSize()){
            System.out.println("没找到");
            return;
        }
        if(bookList.getBook(i).isBorrowed()){
            System.out.println("该书已借出！");
            return;
        }
        if(bookList.getBook(i).isBorrowed()==false){
            System.out.println("借阅成功！");
            bookList.getBook(i).setBorrowed(true);
        }

    }
}
