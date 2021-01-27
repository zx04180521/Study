package BookSystem.Operation;

import BookSystem.BookList;

import java.util.Scanner;

public class FineOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("查看书籍信息");
        System.out.println("请输入您要查看信息的书籍名称");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int i=0;
        for(;i<bookList.getSize();i++){
            if(bookList.getBook(i).getName().contains(name))
                break;
        }
        if(i==bookList.getSize()){
            System.out.println("没找到！");
            return;
        }
        System.out.println(bookList.getBook(i));
    }
}
