package BookSystem.Operation;

import BookSystem.BookList;

import java.util.Scanner;

public class DeleteOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("删除书籍:");
        System.out.println("请输入您要删除的书籍名称：");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int i=0;
        for(;i<bookList.getSize();i++){
            if(bookList.getBook(i).getName().equals(name))
                break;
        }
        if(i== bookList.getSize()){
            System.out.println("没找到["+name+"]这本书");
            System.out.println("删除失败！！！");
            return;
        }
        if(i==bookList.getSize()-1){
            bookList.setSize(bookList.getSize()-1);
            System.out.println("删除成功！");
            return;
        }
        bookList.setBook(i,bookList.getBook(bookList.getSize()-1));
        bookList.setSize(bookList.getSize()-1);
        System.out.println("删除成功！");
    }
}
