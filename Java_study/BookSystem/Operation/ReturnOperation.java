package BookSystem.Operation;

import BookSystem.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("归还书籍");
        System.out.println("请输入您要归还书籍的名称：");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int i=0;
        for(;i<bookList.getSize();i++){
            if(bookList.getBook(i).getName().equals(name))
                break;
        }
        if(bookList.getSize()==i){
            System.out.println("未找到，无法归还");
            return;
        }
        bookList.getBook(i).setBorrowed(false);
    }
}
